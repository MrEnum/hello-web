package kr.co.acomp.hello.controller;

import kr.co.acomp.hello.exception.BizException;
import org.mybatis.spring.MyBatisSystemException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice//컨트롤러이면서 예외를 처리할 수 있는 빈이 됨
public class GlobalExceptionHandler {

    @ExceptionHandler(BizException.class)
    public String handleBizException(Exception e, Model model){
        model.addAttribute("type", e.getClass().getSimpleName());
        model.addAttribute("msg", e.getMessage());
        return "error";
    }

    @ExceptionHandler(MyBatisSystemException.class)
    public String handleMBSException(Exception e, Model model){
        model.addAttribute("type", e.getClass().getSimpleName());
        model.addAttribute("msg", e.getMessage());
        return "error";
    }
}
