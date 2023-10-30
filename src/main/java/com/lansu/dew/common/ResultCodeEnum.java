package com.lansu.dew.common;

/**
 * 结果码enum
 *
 * @author sulan
 * @date 2023/08/06
 */
public enum ResultCodeEnum{

    USER_PASSWORD_ERROR(1001,"用户名或密码错误"),
    USER_NOT_FOUND(1002,"用户不存在"),
    TOKEN_EXPIRED(1003,"token已过期"),
    TOKEN_INVALID(1004,"token无效"),
    ;
    private final Integer code;
    private final String message;

     ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }



    public Integer getCode() {
        return code;
    }


    public String getMessage() {
        return message;
    }
}
