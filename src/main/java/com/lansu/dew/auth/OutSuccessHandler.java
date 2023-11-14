package com.lansu.dew.auth;


import com.alibaba.fastjson2.JSONObject;
import com.lansu.dew.common.response.R;
import com.lansu.dew.common.response.ResultCodeEnum;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author sulan
 */
@Component
public class OutSuccessHandler implements LogoutSuccessHandler {
    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        SecurityContextHolder.clearContext();
        // 设置响应头
        response.setContentType("application/json;charset=utf-8");
        // 返回
        R r = R.result().code(ResultCodeEnum.OUT_SUCCESS);
        response.getWriter().write(JSONObject.toJSONString(r));
    }
}
