package com.gs.web.handler;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.gs.common.model.BaseResult;

/**
 * 异常统一处理
 * 
 * @author gaoshaozhen
 *
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private Logger log = LoggerFactory.getLogger(getClass());

    /**
     * 未知的严重异常
     * 
     * @param ex
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Object exceptionHandleError(Exception ex) {
        log.error("err", ex);
        return BaseResult.fail(ex.getMessage());
    }

    @ExceptionHandler(IncorrectCredentialsException.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Object incorrectCredentialsExceptionHandleError(IncorrectCredentialsException ex) {
    	log.error("err", ex.getMessage());
    	return BaseResult.fail("密码错误");
    }

    @ExceptionHandler(NullPointerException.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Object nullPointerExceptionHandleError(NullPointerException ex) {
    	log.error("参数错误", ex.getMessage());
    	return BaseResult.fail("参数错误");
    }
}
