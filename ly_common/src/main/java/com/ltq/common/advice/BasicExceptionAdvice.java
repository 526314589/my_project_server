package com.ltq.common.advice;

import com.ltq.common.enums.ExceptionEnum;
import com.ltq.common.exception.LyException;
import com.ltq.common.exception_result.ExceptionResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Author: liutieqiang
 * @Date: 2019-12-23 14:22
 * @Description: SpringMVC提供的统一异常拦截器,所有controller的环绕切面
 */
@ControllerAdvice
public class BasicExceptionAdvice {
   @ExceptionHandler(LyException.class)
    public ResponseEntity<ExceptionResult> lyException(LyException e){
       return ResponseEntity.status(ExceptionEnum.BAN_PARAM.getStatus()).body(new ExceptionResult(e));
   }
}
