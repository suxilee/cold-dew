package com.lansu.dew.common.exception;


import com.lansu.dew.common.response.R;
import com.lansu.dew.util.ExceptionUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * 全局异常处理程序
 *
 * @author sulan
 * @date 2023/08/06
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 通用异常处理
     *
     * @param e e
     * @return {@link R}
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R error(Exception e) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (attributes != null) {
            log.error("响应异常: {},uri: {}, ex: {}", attributes.getSessionId()
                    , attributes.getRequest().getRequestURI(), ExceptionUtils.getMessage(e));
        }
        log.error("响应异常: ex: {}", ExceptionUtils.getMessage(e));
        return R.failed();
    }

}
