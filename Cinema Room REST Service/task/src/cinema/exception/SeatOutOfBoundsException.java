package cinema.exception;

public class SeatOutOfBoundsException extends BusinessException{
    public SeatOutOfBoundsException() {
        super("The number of a row or a column is out of bounds!");
    }
}
