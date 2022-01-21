package view;

import controller.EmployeeController;
import controller.ExperienceController;
import controller.FresherController;
import controller.InternController;
import domain.Employee;
import domain.Experience;
import domain.Fresher;
import domain.Intern;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static InternController internController = new InternController();
    static FresherController fresherController = new FresherController();
    static ExperienceController experienceController = new ExperienceController();
    static EmployeeController employeeController = new EmployeeController();

    public static void main(String[] args) {
        menu();
    }

    static public void menu(){
        int choice;
        while(true){
            do{

                System.out.println("***   Chuong trinh quan ly nhan vien   ***");
                System.out.println("***   0. Thoat                         ***");
                System.out.println("***   1. Nhap thong tin nhan vien      ***");
                System.out.println("***   2. Xuat thong tin nhan vien      ***");

                System.out.println("Nhap lua chon: ");
                choice = sc.nextInt();
                switch (choice){
                    case 0:
                        return;
                    case 1:
                        menuInputEmployee();
                        break;
                    case 2:
                        menuOutputEmployee();
                        break;
                    default:
                        System.out.println("Loi, kiem tra lai");
                        break;
                }

            }while(choice<1 || choice>3);
        }
    }

    static public void menuInputEmployee(){
         int employeeType;
        do{

            System.out.println("***   Nhap thong tin nhan vien       ***");
            System.out.println("***   0. Tro lai menu                ***");
            System.out.println("***   1. Nhap thong tin Intern       ***");
            System.out.println("***   2. Nhap thong tin Fresher      ***");
            System.out.println("***   3. Nhap thong tin Experience   ***");

            System.out.println("Nhap  type: ");
            employeeType = Configs.scanner.nextInt();
            switch (employeeType){
                case 0:
                    return;
                case 1:
                    System.out.println("1. Nhap thong tin Intern");
                    Employee employee = new Employee();
                    Configs.scanner.nextLine();
                    employeeController.showInfo(employee);
                    internController.showInfo(employee);

                    break;
                case 2:
                    System.out.println("2. Nhap thong tin Fresher");
                    Employee employee1 = new Employee();
                    Configs.scanner.nextLine();
                    employeeController.showInfo(employee1);
                    fresherController.showInfo(employee1);
                    break;
                case 3:
                    System.out.println("2. Nhap thong tin Experience");
                    Employee employee2 = new Employee();
                    Configs.scanner.nextLine();
                    employeeController.showInfo(employee2);
                    experienceController.showInfo(employee2);
                    break;
                default:
                    System.out.println("Loi, kiem tra lai");
                    break;
            }
        }while (employeeType<1 || employeeType>3);
    }

    static void menuOutputEmployee(){
        int choice;
        do{

            System.out.println("***   Xuat thong tin nhan vien       ***");
            System.out.println("***   0. Tro lai menu                ***");
            System.out.println("***   1. Xuat thong tin Intern       ***");
            System.out.println("***   2. Xuat thong tin Fresher      ***");
            System.out.println("***   3. Xuat thong tin Experience   ***");

            System.out.println("Nhap lua chon: ");
            choice = Configs.scanner.nextInt();
            switch (choice){
                case 0:
                    return;
                case 1:
                    System.out.println("1. Xuat thong tin Intern");

                    for(Intern intern : Configs.internList){
                        System.out.println("Ma nhan vien: " + intern.getId());
                        System.out.println("Ten nhan vien: " + intern.getFullName());
                        System.out.println("Ngay sinh: " + intern.getBirthDay());
                        System.out.println("So dien thoai: " + intern.getPhone());
                        System.out.println("Email: " + intern.getEmail());
                        System.out.println("Chuyen nganh: " + intern.getMajor());
                        System.out.println("Hoc ky: " + intern.getSemester());
                        System.out.println("Truong: " + intern.getUniversityName());
                        System.out.println("So luong Intern: "+Configs.internList.size());
                    }
                    break;
                case 2:
                    System.out.println("2. Xuat thong tin Fresher");

                    for(Fresher freshers : Configs.fresherList){
                        System.out.println("Ma nhan vien: " + freshers.getId());
                        System.out.println("Ten nhan vien: " + freshers.getFullName());
                        System.out.println("Ngay sinh: " + freshers.getBirthDay());
                        System.out.println("So dien thoai: " + freshers.getPhone());
                        System.out.println("Email: " + freshers.getEmail());
                        System.out.println("date : " + freshers.getGraduationDate());
                        System.out.println("rank: " + freshers.getGraduationRank());
                        System.out.println("education: " + freshers.getEducation());
                        System.out.println("So luong Fresher: "+Configs.fresherList.size());
                    }
                    break;
                case 3:
                    System.out.println("3. Xuat thong tin Experience");

                    for(Experience experiences : Configs.experienceList){
                        System.out.println("Ma nhan vien: " + experiences.getId());
                        System.out.println("Ten nhan vien: " + experiences.getFullName());
                        System.out.println("Ngay sinh: " + experiences.getBirthDay());
                        System.out.println("So dien thoai: " + experiences.getPhone());
                        System.out.println("Email: " + experiences.getEmail());
                        System.out.println("year : " + experiences.getYearOfExperience());
                        System.out.println("skill: " + experiences.getProSkill());
                        System.out.println("So luong Experience: "+Configs.experienceList.size());
                    }
                    break;
                default:
                    System.out.println("Loi, kiem tra lai");
                    break;
            }
        }while (choice<1 || choice>3);
    }
}
