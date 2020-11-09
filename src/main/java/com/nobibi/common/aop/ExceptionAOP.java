package com.nobibi.common.aop;

import com.nobibi.common.bean.ResultBean;
import com.nobibi.common.bean.ResultCode;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAOP<T> {
    private final static HttpStatus _500 = HttpStatus.INTERNAL_SERVER_ERROR;

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResultBean<T>> Exception(Exception e) {
        // TODO: Print exception log
        return new ResponseEntity<>(ResultBean.error(ResultCode.Exception.getCode(), ResultCode.Exception.getMessage()), _500);
    }
}
