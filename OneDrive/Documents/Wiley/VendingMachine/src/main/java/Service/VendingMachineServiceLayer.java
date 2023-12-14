package Service;

import Dao.ClassRosterPersistenceException;
import Dao.VendingMachineDaoImpl;
import Dto.Change;
import Dto.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;


@Component
public class VendingMachineServiceLayer {



    private double balance = 0;

    VendingMachineDaoImpl dao;

    @Autowired
    public VendingMachineServiceLayer(VendingMachineDaoImpl dao) {
        this.dao = dao;
    }

    public HashMap<Integer, Item> getAllItems() throws ClassRosterPersistenceException {
        return dao.getAllItem();


    }



    public void deposit(int money) {
        balance += money;
    }

    public double getBalance(){
        return balance;
    }


    public Change buyItem(int selection) throws ClassRosterPersistenceException {
        Item purchased = dao.getItem(selection);

        if (balance - purchased.getItemPrice() < 0){
            return null;
        }
        else{
            balance = balance - purchased.getItemPrice();


            while(balance > 0){

            }
            return dao.buyItem(selection);
        }
    }
}
