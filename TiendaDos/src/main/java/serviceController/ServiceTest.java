package serviceController;

import model.Employee;

public class ServiceTest {

    public static void main(String[] args) {

        /*Category category = new Category();
        CategoryService cs = new CategoryService();
//        cs.createCategory(category);
//        cs.selectCategory();
 //       System.out.println("Ingrese el id de la catergoria a eliminar");
        int id = 2;

        cs.deleteCategory(id);*/

        Employee employee = new Employee();
        EmployeeService es = new EmployeeService();
        es.createEmployee(employee);
        es.selectEmployee();
 //       System.out.println("Ingrese el id del empleado");


    }

}
