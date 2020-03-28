package com.message.transfer.bean;


import java.io.Serializable;

/**
 * <p> API返回参数 </p>
 */
public class ApiResult implements Serializable {

    private Integer code;

    private String message;

    private Object data;

    /**
     * 过期
     */
    public static ApiResult expired(String message) {
        return new ApiResult(0, message, null);
    }

    public static ApiResult fail(String message) {
        return new ApiResult(-1, message, null);
    }

    /**
     * 自定义错误返回码
     */
    public static ApiResult fail(Integer code, String message) {
        return new ApiResult(code, message, null);
    }

    public static ApiResult ok() {
        return new ApiResult(1, "发送成功", null);
    }

    public static ApiResult ok(String message) {
        return new ApiResult(1, message, null);
    }

    public static ApiResult ok(Object data) {
        return new ApiResult(1, "发送成功", data);
    }

    public static ApiResult ok(String message, Object data) {
        return new ApiResult(1, message, data);
    }

    /**
     * 自定义返回码
     */
    public static ApiResult ok(Integer code, String message) {
        return new ApiResult(code, message);
    }

    /**
     * 自定义
     *
     * @param code：验证码
     * @param message：返回消息内容
     * @param data：返回数据
     * @return: com.zhengqing.modules.common.dto.output.ApiResult
     */
    public static ApiResult ok(Integer code, String message, Object data) {
        return new ApiResult(code, message, data);
    }

    public ApiResult() {
    }

    public ApiResult(Integer code, String msg, Object data) {
        this.code = code;
        this.message = msg;
        this.data = data;
    }

    public ApiResult(Object data) {
        this.code = 1;
        this.message ="发送成功";
        this.data = data;
    }

    public ApiResult(String message) {
        this(1, message, null);
    }

    public ApiResult(String message, Integer code) {
        this.message = message;
        this.code = code;
    }

    public ApiResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
