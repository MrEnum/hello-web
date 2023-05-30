package kr.co.acomp.hello.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HttpServletBean;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MeasuringInterceptor extends HandlerInterceptorAdapter {

    Logger log = LoggerFactory.getLogger(MeasuringInterceptor.class);

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
        long beginTime = (long) request.getAttribute("mi.beginTime");
        long endtime = System.currentTimeMillis();
        log.debug(request.getRequestURI()+ "실행시간 : " + (endtime - beginTime));
    }
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        request.setAttribute("mi.beginTime", System.currentTimeMillis());
        return true;
    }

}
