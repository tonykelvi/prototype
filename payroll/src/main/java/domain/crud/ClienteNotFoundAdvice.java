package domain.crud;

import org.springframework.http.HttpStatus;
// import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public class ClienteNotFoundAdvice {
    @ResponseBody
  @ExceptionHandler(ClienteNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String ClienteNotFoundHandler(ClienteNotFoundException ex) {
    return ex.getMessage();
  }
}
