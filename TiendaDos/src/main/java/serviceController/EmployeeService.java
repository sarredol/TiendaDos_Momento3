package serviceController;

import daoController.EmployeeDao;
import model.Employee;

import java.util.Scanner;

public class EmployeeService {


    Scanner sc = new Scanner(System.in);

    public void createEmployee(Employee employee){

        System.out.println("Ingrese el nombre del empleado");
        String employeeName = sc.nextLine();
        employee.setEmployeeName(employeeName);

        EmployeeDao.createEmployeeDao(employee);

    }

    public void selectEmployee(){

        EmployeeDao.selectEmployeeDao();

    }

    public void deleteEmployee(int idEmployee){

        System.out.println("Indique el id del empleado a borrar");
        int id_Employee = sc.nextInt();

        EmployeeDao.deleteEmployeeDao(idEmployee);

    }


}
