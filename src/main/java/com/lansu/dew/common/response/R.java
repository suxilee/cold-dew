package com.lansu.dew.common.response;


import java.io.Serializable;
import java.util.HashMap;
import java.util.UUID;

/**
 * r
 *
 * @author sulan
 * @date 2023/10/30
 */
public class R extends HashMap<String, Object> implements Serializable {


    private static final String RESPONSE_CODE = "code";

    private static final String RESPONSE_MESSAGE = "message";

    private static final String RESPONSE_DATA = "data";

    private static final String MESSAGE_ID = "messageId";

    private R() {
    }

    /**
     * 请求成功
     *
     * @return {@link R}
     */
    public static R ok() {
        R r = new R();
        r.put(RESPONSE_CODE, 200);
        r.put(RESPONSE_MESSAGE, "成功");
        r.put(MESSAGE_ID, UUID.randomUUID());
        return r;
    }

    /**
     * 请求失败
     *
     * @return {@link R}
     */
    public static R failed() {
        R r = new R();
        r.put(RESPONSE_CODE, 400);
        r.put(RESPONSE_MESSAGE, "系统繁忙！请稍后再试。");
        r.put(MESSAGE_ID, UUID.randomUUID());
        return r;
    }

    /**
     * 响应结果
     *
     * @return {@link R}
     */
    public static R result() {
        return new R();
    }

    /**
     * 数据
     *
     * @param data 数据
     * @return {@link R}
     */
    public R data(Object data) {
        this.put(RESPONSE_DATA, data);
        return this;
    }

    /**
     * 数据
     *
     * @param key   键
     * @param value 值
     * @return {@link R}
     */
    public R data(String key, Object value) {
        this.put(key, value);
        return this;
    }

    /**
     * 自定义响应码
     *
     * @param code 代码
     * @return {@link R}
     */
    public R code(ResultCodeEnum code) {
        this.put(RESPONSE_CODE, code.getCode());
        this.put(RESPONSE_MESSAGE, code.getMessage());
        return this;
    }

    public R setMessageId(String messageId) {
        this.put("messageId", messageId);
        return this;
    }


}
