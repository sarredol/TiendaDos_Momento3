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

                String query = "INSERT INTO employee(id_employee,name,last_name,phone,mail,passw,position) VALUES(?,?,?,?,?,?,?)";
                ps = connect.prepareStatement(query);
                ps.setInt(1, employee.getIdEmployee());
                ps.setString(2, employee.getEmployeeName());
                ps.setString(3, employee.getLastName());
                ps.setString(4, employee.getPhone());
                ps.setString(5, employee.getMail());
                ps.setString(6, employee.getPassw());
                ps.setString(7, employee.getPosition());
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
                System.out.println("Empleado" + rs.getString("employeeName"));
                System.out.println("Apellido" + rs.getString("last_name"));
                System.out.println("Telefono" + rs.getString("phone"));
                System.out.println("E-mail" + rs.getString("mail"));
                System.out.println("Contraseña" + rs.getString("passw"));
                System.out.println("Posicion" + rs.getString("position"));

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
