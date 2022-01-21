package service;

import domain.Employee;
import domain.Fresher;
import view.Configs;

public class FresherService implements IEmployee{

    @Override
    public void showInfo(Employee employee) {
        System.out.println("Nhap  graduationDate");
        String graduationDate = Configs.scanner.nextLine();
        System.out.println("Nhap graduationRank");
        String graduationRank = Configs.scanner.nextLine();
        System.out.println("Nhap education ");
        String education = Configs.scanner.nextLine();
        Fresher fresher=new Fresher(employee.getId(),employee.getFullName()
                ,employee.getBirthDay(),employee.getPhone(),employee.getEmail(),graduationDate,graduationRank,education);
        Configs.fresherList.add(fresher);
    }
}
