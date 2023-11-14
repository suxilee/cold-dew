package com.lansu.dew.common.response;

import lombok.Getter;

/**
 * 结果码enum
 *
 * @author sulan
 * @date 2023/08/06
 */
@Getter
public enum ResultCodeEnum {

    USER_PASSWORD_ERROR(1001, "用户名或密码错误"),
    USER_NOT_FOUND(1002, "用户不存在"),
    TOKEN_EXPIRED(1003, "token已过期"),
    TOKEN_INVALID(1004, "token无效"),
    CSRF(403, "跨域请求保护"),
    ACCESS_DENIE(403, "权限不足,拒绝访问"),
    AUTHENTICATION(401, "身份验证异常"),
    USERNAME_NOT_FOUND(401, "用户名不存在"),
    USER_DISABLE(401, "用户已禁用"),
    OUT_SUCCESS(200, "退出成功")
    ;
    private final Integer code;
    private final String message;

    ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}
