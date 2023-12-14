package com.sg.Dao;

import com.sg.Dto.Change;
import com.sg.Dto.Item;

import java.io.*;
import java.util.*;

public class VendingMachineDaoImpl implements VendingMachineDao {


    private static final String ROSTER_FILE = "C:\\Users\\18048\\OneDrive\\Documents\\Wiley\\VendingMachine\\src\\Machine.txt";
    HashMap<Integer,Item> vendingMachine = new HashMap<>();
    HashMap<Integer,Integer> quantity = new HashMap<>();

    public static final String DELIMITER = "::";




    @Override
    public Item buyItem(int selection) throws ClassRosterPersistenceException {

        loadRoster();
        int newCount = quantity.get(selection);

        Item purchased;
        if (newCount - 1 != 0) {
            quantity.put(selection, newCount - 1);
            purchased = vendingMachine.get(selection);



        }
        else{
            purchased = vendingMachine.get(selection);
            vendingMachine.remove(selection);
        }

        writeRoster();

        return purchased;
    }

    @Override
    public void addItem(int id, Item item) {
        vendingMachine.put(id,item);
        int previousQuantity = quantity.get(id);
        quantity.put(id,previousQuantity + 1);
    }

    @Override
    public HashMap<Integer, Item> getAllItem() throws ClassRosterPersistenceException {

        loadRoster();
        writeRoster();
        return vendingMachine;

    }

    public void readFile(){
        try {
            File myObj = new File("C:\\Users\\18048\\OneDrive\\Documents\\Wiley\\VendingMachine\\src\\Machine.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] split = data.split(":");


                int id = Integer.parseInt(split[0]);
                String itemName = split[1];
                double itemPrice = Double.parseDouble(split[2]);
                int count = Integer.parseInt(split[3]);

                Item newItem = new Item(itemName,itemPrice);
                vendingMachine.put(id,newItem);
                quantity.put(id,count);

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


    private void unmarshallStudent(String itemList){
        // studentAsText is expecting a line read in from our file.
        // For example, it might look like this:
        // 1234::Ada::Lovelace::Java-September1842
        //
        // We then split that line on our DELIMITER - which we are using as ::
        // Leaving us with an array of Strings, stored in studentTokens.
        // Which should look like this:
        // ______________________________________
        // |    |   |        |                  |
        // |1234|Ada|Lovelace|Java-September1842|
        // |    |   |        |                  |
        // --------------------------------------
        //  [0]  [1]    [2]         [3]
        String[] listTokens = itemList.split(DELIMITER);

        // Given the pattern above, the student Id is in index 0 of the array.
        String itemId = listTokens[0];

        // Which we can then use to create a new Student object to satisfy
        // the requirements of the Student constructor.
        Item itemFromFile = new Item(listTokens[1],Double.parseDouble(listTokens[2]));

        // However, there are 3 remaining tokens that need to be set into the
        // new student object. Do this manually by using the appropriate setters.

        vendingMachine.put(Integer.valueOf(itemId),itemFromFile);

        quantity.put(Integer.valueOf(itemId), Integer.valueOf(listTokens[3]));


    }

    private void loadRoster() throws ClassRosterPersistenceException {
        Scanner scanner;

        try {
            // Create Scanner for reading the file
            scanner = new Scanner(
                    new BufferedReader(
                            new FileReader(ROSTER_FILE)));
        } catch (FileNotFoundException e) {
            throw new ClassRosterPersistenceException(
                    "-_- Could not load roster data into memory.", e);
        }
        // currentLine holds the most recent line read from the file
        String currentLine;

        while (scanner.hasNextLine()) {
            // get the next line in the file
            currentLine = scanner.nextLine();
            // unmarshall the line into a Student
            unmarshallStudent(currentLine);

        }
        // close scanner
        scanner.close();
    }

    private String marshallStudent(int itemId){
        // We need to turn a Student object into a line of text for our file.
        // For example, we need an in memory object to end up like this:
        // 4321::Charles::Babbage::Java-September1842

        // It's not a complicated process. Just get out each property,
        // and concatenate with our DELIMITER as a kind of spacer.


        Item retrieved = vendingMachine.get(itemId);
        // Start with the student id, since that's supposed to be first.
        String result = itemId + DELIMITER;

        // add the rest of the properties in the correct order:

        // FirstName
        result += retrieved.getItemName() + DELIMITER;

        // LastName
        result += retrieved.getItemPrice() + DELIMITER;

        // Cohort - don't forget to skip the DELIMITER here.
        result += quantity.get(itemId);

        // We have now turned a student to text! Return it!
        return result;
    }

    /**
     * Writes all students in the roster out to a ROSTER_FILE.  See loadRoster
     * for file format.
     *
     * @throws ClassRosterPersistenceException if an error occurs writing to the file
     */
    private void writeRoster() throws ClassRosterPersistenceException {
        // NOTE FOR APPRENTICES: We are not handling the IOException - but
        // we are translating it to an application specific exception and
        // then simple throwing it (i.e. 'reporting' it) to the code that
        // called us.  It is the responsibility of the calling code to
        // handle any errors that occur.
        PrintWriter out;

        try {
            out = new PrintWriter(new FileWriter(ROSTER_FILE));
        } catch (IOException e) {
            throw new ClassRosterPersistenceException(
                    "Could not save student data.", e);
        }

        // Write out the Student objects to the roster file.
        // NOTE TO THE APPRENTICES: We could just grab the student map,
        // get the Collection of Students and iterate over them but we've
        // already created a method that gets a List of Students so
        // we'll reuse it.
        String studentAsText;
        Set<Integer> keyset = vendingMachine.keySet();
        for (int id : keyset) {
            // turn a Student into a String
            studentAsText = marshallStudent(id);
            // write the Student object to the file
            out.println(studentAsText);
            // force PrintWriter to write line to the file
            out.flush();
        }
        // Clean up
        out.close();
    }


    public Item getItem(int selection) throws ClassRosterPersistenceException {

        loadRoster();
        return vendingMachine.get(selection);
    }
}
