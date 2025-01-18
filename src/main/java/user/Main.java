package user;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserRole role = null;
        while (role == null) {
            System.out.println("Введите логин:");
            String login = scanner.nextLine();

            if ("exit".equalsIgnoreCase(login)) {
                System.out.println("exit");
                return;
            }

            System.out.println("Введите пароль:");
            String password = scanner.nextLine();


            try {
                role = CheckUser.userCheck(login, password);
                if (role == null) {
                    System.out.println("Неверный логин или пароль, попробуйте снова.");
                }
            } catch (WrongLoginException | WrongPasswordException e) {
                System.out.println(e.getMessage());
            }

        }

        if (role == UserRole.ADMIN) {
            showAdminMenu(scanner);
        } else if (role == UserRole.USER) {
            showUserMenu(scanner);
        }
        scanner.close();
    }

    private static void showAdminMenu(Scanner scanner) {
        while (true) {
            System.out.println("ADMIN Menu:");
            System.out.println("1. File");
            System.out.println("2. Create new user");
            System.out.println("3. Exit");
            break;

        }
    }

    private static void showUserMenu(Scanner scanner) {
        while (true) {
            System.out.println("USER Menu:");
            System.out.println("1. File");
            System.out.println("2. Get play list");
            System.out.println("3. exit");
            break;

        }
    }
}

