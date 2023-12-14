package com.sg;

import com.sg.Controller.VendingMachineController;
import com.sg.Dao.VendingMachineDaoImpl;
import com.sg.Service.VendingMachineServiceLayer;
import com.sg.View.VendingMachineView;

public class App {

    public static void main(String[]  args){
        VendingMachineDaoImpl dao = new VendingMachineDaoImpl();
        VendingMachineView view = new VendingMachineView();
        VendingMachineServiceLayer service = new VendingMachineServiceLayer(dao);
        VendingMachineController controller = new VendingMachineController(service,view);


        controller.run();
    }

}
