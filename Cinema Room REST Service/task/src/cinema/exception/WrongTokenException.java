package cinema.exception;

public class WrongTokenException extends BusinessException {
    public WrongTokenException() {
        super("Wrong token!");
    }
}
