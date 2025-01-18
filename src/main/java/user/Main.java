package user;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        String password = scanner.nextLine();

        try {
            Role role = userCheck(login, password);
        } catch (WrongLoginException e) {
            System.out.println("Неверный логин");;
        } catch (WrongPasswordException e) {
            System.out.println("Неверный пароль");;
        } catch (WrongPasswordOrLoginException e) {
            System.out.println("Неверный логин или пароль");
        }

    }
    public static Role userCheck (String login, String password) throws WrongLoginException, WrongPasswordException, WrongPasswordOrLoginException {
        return null;

    }
}
