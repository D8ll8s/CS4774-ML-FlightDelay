package Controller;

import Dao.ClassRosterPersistenceException;
import Dto.Item;
import Service.VendingMachineServiceLayer;
import View.VendingMachineView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class VendingMachineController {


    private VendingMachineView view;
    private VendingMachineServiceLayer service;
    @Autowired
    public VendingMachineController(VendingMachineServiceLayer service, VendingMachineView view) {
        this.service = service;
        this.view = view;
    }

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        try {
            while (keepGoing) {

                menuSelection = getSelection();

                switch (menuSelection) {
                    case 1:
                        getMoney();
                        break;
                    case 2:
                        buyItem();
                        break;
                    case 3:
                        keepGoing = false;
                        break;
                    default:
                        unknownCommand();
                }

            }
            exitMessage();
        } catch (Exception e) {
            //view.displayErrorMessage(e.getMessage());
            System.out.println("error");
        }
    }

    private void buyItem() throws ClassRosterPersistenceException {


        int selection = view.displayBuyItem(service.getAllItems());
        Item purchased = service.buyItem(selection);
        if (purchased == null){
            view.printInsufficientFunds();
            view.displayGoBack();
        }
        else{
            view.displayGoBack();
        }


    }

    private void getMoney() {
        int money = view.displayGetMoney();
        service.deposit(money);
        view.displayGoBack();

    }

    private void exitMessage() {
        view.displayExitBanner();
    }
    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }
    private int getSelection() {
        return view.printMenuAndGetSelection(service.getBalance());
    }
}
