package controller;

import domain.Employee;
import service.InternService;

public class InternController {
    InternService internService=new InternService();
    public void showInfo(Employee employee){
        internService.showInfo(employee);
    }
}
