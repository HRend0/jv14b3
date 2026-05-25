public class taiKhoan {
    private double balance = 1000000;
    private final double MIN_BALANCE = 50000;

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Lỗi: Số tiền rút phải lớn hơn 0 đồng!");
            return;
        }

        if (amount > balance) {
            System.out.println("Lỗi: Số tiền rút vượt quá số dư!");
            return;
        }

        if (balance - amount < MIN_BALANCE) {
            System.out.println("Lỗi: Tài khoản phải duy trì số dư tối thiểu 50.000 đồng!");
            return;
        }

        balance -= amount;
        System.out.println("--- GIAO DỊCH THÀNH CÔNG ---");
        System.out.printf("Số tiền đã rút: %,.0f đồng%n", amount);
        System.out.printf("Số dư còn lại trong tài khoản: %,.0f đồng%n", balance);
    }

    public double getBalance() {
        return balance;
    }
}