package Dao;


import Dto.Change;
import Dto.Item;

import java.util.HashMap;

public interface VendingMachineDao {


    Item buyItem(int selection) throws ClassRosterPersistenceException;

    void addItem(int id, Item item);

    HashMap<Integer,Item> getAllItem() throws ClassRosterPersistenceException;




}
