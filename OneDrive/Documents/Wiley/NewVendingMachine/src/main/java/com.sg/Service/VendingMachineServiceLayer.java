package com.sg.Service;

import com.sg.Dao.ClassRosterPersistenceException;
import com.sg.Dao.VendingMachineDaoImpl;
import com.sg.Dto.Item;

import java.util.HashMap;


public class VendingMachineServiceLayer {



    private double balance = 0;

    VendingMachineDaoImpl dao;

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


    public Item buyItem(int selection) throws ClassRosterPersistenceException {
        Item purchased = dao.getItem(selection);
        if (balance - purchased.getItemPrice() < 0){
            return null;
        }
        else{
            balance = balance - purchased.getItemPrice();
            return dao.buyItem(selection);
        }
    }
}
