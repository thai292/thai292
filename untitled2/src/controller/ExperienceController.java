package controller;

import domain.Employee;
import service.ExperienceService;

public class ExperienceController {
    ExperienceService experienceService=new ExperienceService();
    public void showInfo(Employee employee){
        experienceService.showInfo(employee);
    }
}
