import java.util.Scanner;

public class Peson {
        private String name;
        private String gender;
        private String dateOfBirth;
        private String address;

        // Constructor không tham số
        public Peson() {}

        // Constructor đủ tham số
        public Peson(String name, String gender, String dateOfBirth, String address) {
            this.name = name;
            this.gender = gender;
            this.dateOfBirth = dateOfBirth;
            this.address = address;
        }

        // Getter và Setter
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        // Phương thức nhập thông tin
        public void inputInfo() {
           Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập tên: ");
            this.name = scanner.nextLine();
            System.out.print("Nhập giới tính: ");
            this.gender = scanner.nextLine();
            System.out.print("Nhập ngày sinh: ");
            this.dateOfBirth = scanner.nextLine();
            System.out.print("Nhập địa chỉ: ");
            this.address = scanner.nextLine();
        }

        // Phương thức in thông tin
        public void printInfo() {
            System.out.println("Tên: " + name);
            System.out.println("Giới tính: " + gender);
            System.out.println("Ngày sinh: " + dateOfBirth);
            System.out.println("Địa chỉ: " + address);
        }
    }


