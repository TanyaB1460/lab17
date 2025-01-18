package user;

public class CheckUser {
    private static final String ADMIN_LOGIN = "Admin_tatyana@gmail.com";
    private static final String ADMIN_PASSWORD = "AdminBob_14";
    private static final String USER_LOGIN = "User_bbybyyb@gmail.com";
    private static final String USER_PASSWORD = "UserByb_06";

    private static String previousLogin = null;
    private static String previousPassword = null;

    public static UserRole userCheck(String login, String password)
            throws WrongLoginException, WrongPasswordException {

        if (previousLogin != null && !login.equals(previousLogin)) {
            throw new WrongLoginException("Неверный логин или пароль");
        }
        if (previousPassword != null && !password.equals(previousPassword)) {
            throw new WrongLoginException("Неверный логин или пароль");
        }

        String loginRegex = "^[a-zA-Z0-9@._-]{20,}$";
        String passwordRegex = "^[a-zA-Z0-9{}()\\[\\],.;&?!_\\-\\+]{8,}$";

        if (!login.matches(loginRegex)) {
            throw new WrongLoginException("Неверный логин");
        }
        if (!password.matches(passwordRegex)) {
            throw new WrongPasswordException("Неверный пароль");
        }

        if (!password.matches(".*[A-Z].*") || !password.matches(".*[a-z].*") || !password.matches(".*\\d.*")) {
            throw new WrongPasswordException("Пароль должен содержать одну прописную букву, одну строчную букву и одну цифру.");
        }

        if (login.equals(ADMIN_LOGIN) && password.equals(ADMIN_PASSWORD)){
            previousLogin = login;
            previousPassword = password;
            return UserRole.ADMIN;
        } else if (login.equals(USER_LOGIN) && password.equals(USER_PASSWORD)){
            previousLogin = login;
            previousPassword = password;
            return UserRole.USER;
        } else {
            previousLogin = null;
            previousPassword = null;
            return null;
        }
    }
}