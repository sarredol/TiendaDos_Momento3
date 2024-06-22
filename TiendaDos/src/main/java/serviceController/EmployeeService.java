package serviceController;

import daoController.EmployeeDao;
import model.Employee;

import java.util.Scanner;

public class EmployeeService {


    Scanner sc = new Scanner(System.in);

    public void createEmployee(Employee employee){

        System.out.println("Ingrese el id del empleado");
        int idEmployee = sc.nextInt();
        employee.setIdEmployee(idEmployee);
        sc.nextLine();

        System.out.println("Ingrese el nombre del empleado");
        String employeeName = sc.nextLine();
        employee.setEmployeeName(employeeName);

        System.out.println("Ingrese el apellido del empleado:");
        String lastName = sc.nextLine();
        employee.setLastName(lastName);

        System.out.println("Ingrese el telefono del empleado:");
        String phone = sc.nextLine();
        employee.setPhone(phone);

        System.out.println("Ingrese el e-mail del empleado:");
        String mail = sc.nextLine();
        employee.setMail(mail);

        System.out.println("Ingrese la contraseña:");
        String passw = sc.nextLine();
        employee.setPassw(passw);

        System.out.println("Ingrese la posicion empleado:");
        String position = sc.nextLine();
        employee.setPosition(position);

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
