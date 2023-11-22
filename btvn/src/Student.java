import java.util.Scanner;

public class Student extends Peson {
        private String studentId;
        private float examScore;
        private String email;

        // Ghi đè phương thức nhập thông tin
        @Override
        public void inputInfo() {
            super.inputInfo();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập mã sinh viên: ");
            this.studentId = scanner.nextLine();
            System.out.print("Nhập điểm thi: ");
            this.examScore = scanner.nextFloat();
            scanner.nextLine(); // Đọc bỏ dòng mới
            System.out.print("Nhập email: ");
            this.email = scanner.nextLine();
        }

        // Ghi đè phương thức in thông tin
        @Override
        public void printInfo() {
            super.printInfo();
            System.out.println("Mã sinh viên: " + studentId);
            System.out.println("Điểm thi: " + examScore);
            System.out.println("Email: " + email);
        }

        // Phương thức kiểm tra sinh viên có được học bổng không
        public boolean hasScholarship() {
            return examScore > 8.0;
        }
    }

