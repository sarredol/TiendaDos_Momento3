package daoController;

import conexion.Conexion;
import model.Costumer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CostumerDao {


    public static void createCostumerDao(Costumer costumer){

        Conexion conexion = new Conexion();

        try(Connection connect = conexion.getConnectDB()){

            PreparedStatement ps = null;

            try {

                String query = "INSERT INTO costumer(idCostumer, name, last_name, phone, mail, passw, type) VALUES(?,?,?,?,?,?,?)";
                ps = connect.prepareStatement(query);
                //ps.setString(1, costumer.getCostumerName());
                ps.setInt(1, costumer.getIdCostumer());
                ps.setString(2, costumer.getCostumerName());
                ps.setString(3, costumer.getLastName());
                ps.setString(4, costumer.getPhone());
                ps.setString(5, costumer.getMail());
                ps.setString(6, costumer.getPassw());
                ps.setString(7, costumer.getType());
                ps.executeUpdate();


            }catch(SQLException e){
                System.out.println(e);
            }

        }catch (SQLException e){
            System.out.println(e);
        }

    }



    public static void selectCostumerDao(){

        Conexion conexion = new Conexion();

        PreparedStatement ps = null;

        ResultSet rs = null;

        try(Connection connect = conexion.getConnectDB()){

            String query = "SELECT * FROM costumer";
            ps = connect.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){

                System.out.println("ID" + rs.getInt("idCostumer"));
                System.out.println("Cliente" + rs.getString("name"));
                System.out.println("Apellido" + rs.getString("last_name"));
                System.out.println("Telefono" + rs.getString("phone"));
                System.out.println("E-mail" + rs.getString("mail"));
                System.out.println("Contraseña" + rs.getString("passw"));
                System.out.println("Tipo cliente" + rs.getString("type"));

            }

        }catch (SQLException e){
            System.out.println(e);
        }

    }

    public static void deleteCostumerDao(int idCostumer){

        Conexion conexion = new Conexion();

        try(Connection connect = conexion.getConnectDB()){

            PreparedStatement ps = null;

            try {

                String query = "DELETE FROM costumer WHERE costumer.idCostumer=?";
                ps = connect.prepareStatement(query);
                ps.setInt(1, idCostumer);
                ps.executeUpdate();
                System.out.println("Se ha eliminado el cliente correctamente");

            }catch (SQLException e){
                System.out.println(e);
            }

        }catch (SQLException e){
            System.out.println(e);
        }

    }



}
