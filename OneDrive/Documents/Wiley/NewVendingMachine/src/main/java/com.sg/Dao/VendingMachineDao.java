package com.sg.Dao;


import com.sg.Dto.Change;
import com.sg.Dto.Item;

import java.util.HashMap;

public interface VendingMachineDao {


    Item buyItem(int selection) throws ClassRosterPersistenceException;

    void addItem(int id, Item item);

    HashMap<Integer,Item> getAllItem() throws ClassRosterPersistenceException;




}
