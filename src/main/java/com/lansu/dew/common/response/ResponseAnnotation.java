package com.lansu.dew.common.response;

import java.lang.annotation.*;

/**
 * 响应注释
 *
 * @author sulan
 * @date 2023/08/06
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ResponseAnnotation {
}
