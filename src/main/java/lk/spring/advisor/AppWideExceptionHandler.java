package lk.spring.advisor;

import lk.spring.util.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author : M-Prageeth
 * @created : 24/09/2022 - 6:46 PM
 **/
@CrossOrigin
@RestControllerAdvice
public class AppWideExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({Exception.class})
    public ResponseUtil exceptionHandler(Exception e) {
        return new ResponseUtil(500, e.getMessage(), null);
    }
}
