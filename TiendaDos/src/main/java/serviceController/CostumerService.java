package serviceController;

import daoController.CostumerDao;
import model.Costumer;

import java.util.Scanner;

public class CostumerService {


    Scanner sc = new Scanner(System.in);

    public void createCostumer(Costumer costumer){

        System.out.println("Ingrese el id del cliente");
        int idCostumer = sc.nextInt();
        costumer.setIdCostumer(idCostumer);
        sc.nextLine();

        System.out.println("Ingrese el nombre del cliente");
        String costumerName = sc.nextLine();
        costumer.setCostumerName(costumerName);

        System.out.println("Ingrese el apellido del cliente:");
        String lastName = sc.nextLine();
        costumer.setLastName(lastName);

        System.out.println("Ingrese el telefono del cliente:");
        String phone = sc.nextLine();
        costumer.setPhone(phone);

        System.out.println("Ingrese el e-mail del cliente:");
        String mail = sc.nextLine();
        costumer.setMail(mail);

        System.out.println("Ingrese la contraseña:");
        String passw = sc.nextLine();
        costumer.setPassw(passw);

        System.out.println("Ingrese el tipo de cliente:");
        String type = sc.nextLine();
        costumer.setType(type);

        CostumerDao.createCostumerDao(costumer);

    }

    public void selectCostumer(){

        CostumerDao.selectCostumerDao();

    }

    public void deleteCostumer(int idCostumer){

        System.out.println("Indique el id del cliente a borrar");
        int id_Costumer = sc.nextInt();

        CostumerDao.deleteCostumerDao(idCostumer);

    }


}
