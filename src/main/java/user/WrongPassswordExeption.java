package user;

public class WrongPassswordExeption extends RuntimeException {
    public WrongPasswordException(String message) {
        super(message);
    }
}
