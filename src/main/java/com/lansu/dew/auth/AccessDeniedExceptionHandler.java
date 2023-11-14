package com.lansu.dew.auth;


import com.lansu.dew.common.response.R;
import com.lansu.dew.common.response.ResultCodeEnum;
import com.lansu.dew.util.ExceptionUtils;
import com.lansu.dew.util.HttpUtils;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.csrf.CsrfException;

import java.io.IOException;

/**
 * 拒绝访问异常处理程序
 *
 * @author sulan
 * @date 2023/08/05
 */
@Slf4j
public class AccessDeniedExceptionHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
        log.error(ExceptionUtils.getMessage(accessDeniedException));
        //CsrfException
        if (accessDeniedException instanceof CsrfException) {
            //Csrf异常
            //使用json序列化返回，状态码200
            HttpUtils.responseJson(response, R.result().code(ResultCodeEnum.CSRF));
            return;
        }
        //CsrfException
        if (accessDeniedException instanceof org.springframework.security.web.server.csrf.CsrfException) {
            //Csrf异常
            //使用json序列化返回，状态码200
            HttpUtils.responseJson(response, R.result().code(ResultCodeEnum.CSRF));
            return;
        }
        //AuthorizationServiceException null
        if (accessDeniedException instanceof org.springframework.security.access.AuthorizationServiceException) {
            //授权服务异常
            //使用json序列化返回，状态码200
            HttpUtils.responseJson(response, R.result().code(ResultCodeEnum.ACCESS_DENIE));
            return;
        }
        //拒绝访问
        //使用json序列化返回，状态码200
        HttpUtils.responseJson(response, R.result().code(ResultCodeEnum.ACCESS_DENIE));
    }
}
