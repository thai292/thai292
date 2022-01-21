package service;

import domain.Employee;
import domain.Intern;
import view.Configs;

public class InternService implements IEmployee{
    @Override
    public void showInfo(Employee employee) {
        System.out.println("Nhap chuyen nganh");
        String major = Configs.scanner.nextLine();
        System.out.println("Nhap ky dang hoc");
        String semester = Configs.scanner.nextLine();
        System.out.println("Nhap truong hoc");
        String universityName = Configs.scanner.nextLine();
        Intern intern=new Intern(employee.getId(),employee.getFullName(),
                employee.getBirthDay(),employee.getPhone(),employee.getEmail(),major,semester,universityName);
        Configs.internList.add(intern);

    }

}
