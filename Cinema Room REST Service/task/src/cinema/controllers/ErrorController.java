package cinema.controllers;

import cinema.ErrorDTO;
import cinema.exception.BusinessException;
import cinema.exception.Unauthorized;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class ErrorController {
    @ExceptionHandler(BusinessException.class)
    ResponseEntity<ErrorDTO> badRequestHandler(BusinessException ex){
        log.info(ex.getMessage());
        return ResponseEntity.badRequest().body(new ErrorDTO(ex.getMessage()));
    }

    @ExceptionHandler(Unauthorized.class)
    ResponseEntity<ErrorDTO> unauthorizedHandler(Unauthorized ex){
        log.info(ex.getMessage());
        return ResponseEntity.status(401).body(new ErrorDTO(ex.getMessage()));
    }
}
