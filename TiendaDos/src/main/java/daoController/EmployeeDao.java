package daoController;

import conexion.Conexion;
import model.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDao {


    public static void createEmployeeDao(Employee employee){

        Conexion conexion = new Conexion();

        try(Connection connect = conexion.getConnectDB()){

            PreparedStatement ps = null;

            try {

                String query = "INSERT INTO employee(name) VALUES(?)";
                ps = connect.prepareStatement(query);
                ps.setString(1, employee.getEmployeeName());
                ps.executeUpdate();


            }catch(SQLException e){
                System.out.println(e);
            }

        }catch (SQLException e){
            System.out.println(e);
        }

    }

    public static void selectEmployeeDao(){

        Conexion conexion = new Conexion();

        PreparedStatement ps = null;

        ResultSet rs = null;

        try(Connection connect = conexion.getConnectDB()){

            String query = "SELECT * FROM employee";
            ps = connect.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){

                System.out.println("ID" + rs.getInt("id_employee"));
                System.out.println("Empleado" + rs.getString("employee_name"));

            }

        }catch (SQLException e){
            System.out.println(e);
        }

    }

    public static void deleteEmployeeDao(int idEmployee){

        Conexion conexion = new Conexion();

        try(Connection connect = conexion.getConnectDB()){

            PreparedStatement ps = null;

            try {

                String query = "DELETE FROM employee WHERE employee.id_employee=?";
                ps = connect.prepareStatement(query);
                ps.setInt(1, idEmployee);
                ps.executeUpdate();
                System.out.println("Se ha eliminado el empleado correctamente");

            }catch (SQLException e){
                System.out.println(e);
            }

        }catch (SQLException e){
            System.out.println(e);
        }

    }


}
