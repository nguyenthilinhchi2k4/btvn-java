import java.util.Scanner;

public   class GiaoVien extends Peson{
        private String classList;
        private double salary;
        private int numOfSubjects;
        private String[] subjects;

        // Ghi đè phương thức nhập thông tin
        @Override
        public void inputInfo() {
            super.inputInfo();
          Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập danh sách lớp giảng dạy: ");
            this.classList = scanner.nextLine();
            System.out.print("Nhập mức lương: ");
            this.salary = scanner.nextDouble();
            System.out.print("Nhập số môn giảng dạy: ");
            this.numOfSubjects = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng mới
            this.subjects = new String[numOfSubjects];
            for (int i = 0; i < numOfSubjects; i++) {
                System.out.print("Nhập môn giảng dạy thứ " + (i + 1) + ": ");
                this.subjects[i] = scanner.nextLine();
            }
        }

        // Ghi đè phương thức in thông tin
        @Override
        public void printInfo() {
            super.printInfo();
            System.out.println("Danh sách lớp giảng dạy: " + classList);
            System.out.println("Mức lương: " + salary);
            System.out.println("Số môn giảng dạy: " + numOfSubjects);
            System.out.print("Các môn giảng dạy: ");
            for (int i = 0; i < numOfSubjects; i++) {
                System.out.print(subjects[i] + " ");
            }
            System.out.println();
        }
}
