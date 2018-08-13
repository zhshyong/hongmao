package com.hongmao.common.enums;

/**
 *提示消息枚举类
 * @author
 * @version
 */
public enum Message {
    LOGIN_FAILURE("0","登陆失败"),
    LOGIN_SUCCESS("1","登陆成功");

    private String code;

    private String message;

    Message(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
