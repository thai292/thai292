package controller;

import domain.Employee;
import service.FresherService;

public class FresherController {
    FresherService fresherService=new FresherService();
    public void showInfo(Employee employee){
        fresherService.showInfo(employee);
    }
}
