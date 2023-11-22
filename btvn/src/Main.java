import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Tạo đối tượng Person và nhập thông tin
            Peson peson = new Peson();
            System.out.println("Nhập thông tin của người:");
            peson.inputInfo();

            // Tạo đối tượng Student và nhập thông tin
            Student student = new Student();
            System.out.println("Nhập thông tin của sinh viên:");
            student.inputInfo();

            // Tạo đối tượng GiaoVien và nhập thông tin
            GiaoVien giaoVien = new GiaoVien();
            System.out.println("Nhập thông tin của giáo viên:");
            giaoVien.inputInfo();

            // In thông tin của các đối tượng
            System.out.println("\nThông tin của người:");
            peson.printInfo();

            System.out.println("\nThông tin của sinh viên:");
            student.printInfo();
            System.out.println("Sinh viên có được học bổng không? " + (student.hasScholarship() ? "Có" : "Không"));

            System.out.println("\nThông tin của giáo viên:");
            giaoVien.printInfo();
        }
    }

