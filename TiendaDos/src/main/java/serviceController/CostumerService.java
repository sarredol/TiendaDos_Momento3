package serviceController;

import daoController.CostumerDao;
import model.Costumer;

import java.util.Scanner;

public class CostumerService {


    Scanner sc = new Scanner(System.in);

    public void createCostumer(Costumer costumer){

        System.out.println("Ingrese el nombre del cliente");
        String costumerName = sc.nextLine();
        costumer.setCostumerName(costumerName);

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
