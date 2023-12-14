package com.sg.testing.dao.implementations;

import com.sg.testing.dao.implementations.buggy.*;
import com.sg.testing.model.Monster;
import com.sg.testing.model.MonsterType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AGoodMonsterDaoTest {


    //AGoodMonsterDao dao;

    BadMonsterDaoB dao;

    Monster monster;
    Monster monster2;

    @BeforeEach
    void setUp() {
         dao = new BadMonsterDaoB();
         monster = new Monster("Dallas", MonsterType.YETI,5,"Lizards");
         monster2 = new Monster("Duke", MonsterType.LIZARDMAN,7,"Humans");


    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addGetMonsterTest() {

        Monster addReturn = dao.addMonster(001,monster);
        Monster retrieved = dao.getMonster(001);
        Monster nullRetrieved = dao.getMonster(002);

        assertNull(addReturn,"addMonster should not return current monster");
        assertNull(nullRetrieved,"getMonster on false id should return null");


        assertNotNull(retrieved,"Retrieved Monster 002 is Null");
        assertEquals(retrieved.getFavoriteFood(),monster.getFavoriteFood(),"Favorite Food does not match");
        assertEquals(retrieved.getName(),monster.getName(),"Name does not match");
        assertEquals(retrieved.getType(),monster.getType(),"Type does not match");
        assertEquals(retrieved.getPeopleEaten(),monster.getPeopleEaten(),"Number of people eaten not match");

    }

    @Test
    void getNullMonsterTest() {

        Monster retrieved = dao.getMonster(001);
        Monster nullRetrieved = dao.getMonster(002);

        assertNull(nullRetrieved,"getMonster on false id should return null");
        assertNull(retrieved,"getMonster on false id should return null");


    }



    @Test
    void getAllMonstersTest() {


        dao.addMonster(001,monster);
        dao.addMonster(002,monster2);

        List<Monster> myList = dao.getAllMonsters();

        assertNotNull(myList,"Returned list should not be null");

        assertEquals(myList.get(0).getName(), monster.getName(), "Name not Equal");
        assertEquals(myList.get(0).getType(), monster.getType(), "Type not Equal");
        assertEquals(myList.get(0).getFavoriteFood(), monster.getFavoriteFood(), "Food not Equal");
        assertEquals(myList.get(0).getPeopleEaten(), monster.getPeopleEaten(), "Amount of people eaten not Equal");

        assertEquals(myList.get(1).getName(), monster2.getName(), "Name not Equal");
        assertEquals(myList.get(1).getType(), monster2.getType(), "Type not Equal");
        assertEquals(myList.get(1).getFavoriteFood(), monster2.getFavoriteFood(), "Food not Equal");
        assertEquals(myList.get(1).getPeopleEaten(), monster2.getPeopleEaten(), "Amount of people eaten not Equal");
    }

    @Test
    void getAllMonstersListNotNullTest() {


        List<Monster> myList = dao.getAllMonsters();
        assertNotNull(myList,"getAllAddress should never return null if empty");
        assertEquals(myList.size(),0,"Empty list should have size 0");
    }

    @Test
    void updateMonsterTest() {

        dao.addMonster(001,monster);
        dao.updateMonster(001,monster2);
        Monster retrieved = dao.getMonster(001);

        assertNotNull(retrieved,"Retrieved Monster is Null");
        assertEquals(retrieved.getFavoriteFood(),monster2.getFavoriteFood(),"Favorite Food does not match");
        assertEquals(retrieved.getName(),monster2.getName(),"Name does not match");
        assertEquals(retrieved.getType(),monster2.getType(),"Type does not match");
        assertEquals(retrieved.getPeopleEaten(),monster2.getPeopleEaten(),"Number of people eaten not match");

    }

    @Test
    void removeMonsterTest() {

        dao.addMonster(001,monster);
        Monster retrieved = dao.removeMonster(001);

        assertEquals(retrieved.getName(), monster.getName(), "Name not Equal");
        assertEquals(retrieved.getType(), monster.getType(), "Type not Equal");
        assertEquals(retrieved.getFavoriteFood(), monster.getFavoriteFood(), "Food not Equal");
        assertEquals(retrieved.getPeopleEaten(), monster.getPeopleEaten(), "Amount of people eaten not Equal");

        assertEquals(dao.getAllMonsters().size(),0,"After removing, list should be empty");


    }

    @Test
    void removeNullMonsterTest() {
        assertNull(dao.removeMonster(002),"Removing non-existent monster should return null");

    }


}