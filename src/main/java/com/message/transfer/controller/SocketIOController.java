package com.message.transfer.controller;

import com.message.transfer.bean.ApiResult;
import com.message.transfer.service.SocketIOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SocketIOController {

    @Autowired
    private SocketIOService socketIOService;

    /**
     * 推送信息给指定客户端
     * @param userId
     * @param msgContent
     * @return
     */
    @PostMapping(value = "/pushMessage",produces = "application/json;charset=utf-8")
    public ApiResult pushMessageToUser(@RequestParam String userId, @RequestParam String msgContent) {
        socketIOService.pushMessageToUser(userId, msgContent);
        return ApiResult.ok();
    }
}
