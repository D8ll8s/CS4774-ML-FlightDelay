package com.sg.View;

import com.sg.Dao.VendingMachineDao;
import com.sg.Dao.VendingMachineDaoImpl;
import com.sg.Dto.Item;
import com.sg.UserIOConsoleImpl;

import java.util.HashMap;

public class VendingMachineView {

    private UserIOConsoleImpl io = new UserIOConsoleImpl();

    private VendingMachineDaoImpl dao = new VendingMachineDaoImpl();
    public int printMenuAndGetSelection(double money) {
        io.print("Main Menu");
        io.print("1. Deposit Money");
        io.print("2. Buy Something");
        io.print("3. Exit");
        io.print("");
        io.print("You have $"+ money);


        return io.readInt("Please select from the above choices.", 1, 3);

    }

    public void displayUnknownCommandBanner() {
        io.print("Unknown Command");
    }

    public void displayExitBanner() {
        io.print("GoodBye");
    }

    public int displayBuyItem(HashMap<Integer,Item> machine) {

        for(Integer i : machine.keySet()){
            System.out.printf("%d - %s - $ %f",i,machine.get(i).getItemName(),machine.get(i).getItemPrice());
            System.out.println();
        }


        int select = io.readInt("Enter a number to buy item");

        return select;
    }

    public int displayGetMoney() {
        int money = io.readInt("How much money do you want to put in?");
        return money;
    }

    public void displayBalance(double money){
        io.print("You have $"+ money);
    }

    public void printInsufficientFunds() {
        io.print("Insufficient Funds");
    }

    public void displayGoBack() {
        io.readInt("Press any to go back");
    }
}
