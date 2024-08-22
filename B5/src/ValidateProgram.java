import java.util.Scanner;
import java.util.regex.Pattern;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ValidateProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kiểm tra số điện thoại
        String phoneNumber;
        while (true) {
            try {
                System.out.print("Phone number: ");
                phoneNumber = scanner.nextLine();
                if (!Pattern.matches("\\d{10}", phoneNumber)) {
                    throw new IllegalArgumentException("Phone number must be 10 digits and numeric.");
                }
                break; // Thoát vòng lặp nếu kiểm tra thành công
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        // Kiểm tra email
        String email;
        while (true) {
            try {
                System.out.print("Email: ");
                email = scanner.nextLine();
                if (!Pattern.matches("^[\\w-\\.]+@[\\w-]+\\.[a-z]{2,4}$", email)) {
                    throw new IllegalArgumentException("Email must be in correct format.");
                }
                break; // Thoát vòng lặp nếu kiểm tra thành công
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        // Kiểm tra ngày tháng
        String date;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false); // Không cho phép những ngày tháng không hợp lệ
        while (true) {
            try {
                System.out.print("Date (dd/MM/yyyy): ");
                date = scanner.nextLine();
                sdf.parse(date); // Thử parse ngày tháng để kiểm tra định dạng
                break; // Thoát vòng lặp nếu kiểm tra thành công
            } catch (ParseException e) {
                System.out.println("Date must be in correct format (dd/MM/yyyy).");
            }
        }

        // Hiển thị thông tin đã nhập
        System.out.println("Validated information:");
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Date: " + date);
    }
}
