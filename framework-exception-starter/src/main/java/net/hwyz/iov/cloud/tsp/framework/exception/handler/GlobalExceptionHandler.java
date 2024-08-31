package net.hwyz.iov.cloud.tsp.framework.exception.handler;

import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import net.hwyz.iov.cloud.tsp.framework.commons.exception.BaseException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理
 *
 * @author hwyz_leo
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler({BaseException.class})
    public Object serviceException(HttpServletResponse response, Throwable ex) {
        response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        BaseException baseException = (BaseException) ex;
        return baseException;
    }

}
