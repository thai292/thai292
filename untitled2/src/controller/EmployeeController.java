package controller;

import domain.Employee;
import service.EmployeeService;

public class EmployeeController {
    EmployeeService employeeService=new EmployeeService();
    public void showInfo(Employee employee){
        employeeService.showInfo(employee);

    }
}
