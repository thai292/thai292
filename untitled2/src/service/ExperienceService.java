package service;

import domain.Employee;
import domain.Experience;
import view.Configs;

public class ExperienceService implements IEmployee{
    @Override
    public void showInfo(Employee employee) {
        System.out.println("Nhap  yearOfExperience");
        String yearOfExperience = Configs.scanner.nextLine();
        System.out.println("Nhap proSkill");
        String proSkill = Configs.scanner.nextLine();
        Experience experience=new Experience(employee.getId()
                ,employee.getFullName(),employee.getBirthDay(),employee.getPhone(),employee.getEmail(),yearOfExperience,proSkill);
        Configs.experienceList.add(experience);
    }
}
