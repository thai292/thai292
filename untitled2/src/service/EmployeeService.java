package service;

import domain.Employee;
import view.Configs;

public class EmployeeService implements IEmployee{
    @Override
    public void showInfo(Employee employee) {
        System.out.println("Nhap ma nhan vien");
        employee.setId(Configs.scanner.nextLine());
        System.out.println("Nhap ten nhan vien");
        employee.setFullName(Configs.scanner.nextLine());
        System.out.println("Nhap ngay sinh");
        employee.setBirthDay(Configs.scanner.nextLine());
        System.out.println("Nhap so dien thoai");
        employee.setPhone(Configs.scanner.nextLine());
        System.out.println("Nhap email");
        employee.setEmail(Configs.scanner.nextLine());
    }
}
