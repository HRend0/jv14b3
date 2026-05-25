import java.util.Scanner;

public class Mainnn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        taiKhoan account = new taiKhoan();

        System.out.println("=== HỆ THỐNG ATM MÔ PHỎNG ===");
        System.out.printf("Số dư hiện tại: %,.0f đồng%n", account.getBalance());

        while (true) {
            System.out.print("\nNhập số tiền muốn rút (hoặc nhập 'exit' để thoát): ");

            String input = scanner.next();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Cảm ơn bạn đã sử dụng dịch vụ!");
                break;
            }

            try {
                double amount = Double.parseDouble(input);

                account.withdraw(amount);

            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập một số hợp lệ!");
            }
        }

        scanner.close();
    }
}