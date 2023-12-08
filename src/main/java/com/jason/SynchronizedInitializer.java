package com.jason;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SynchronizedInitializer {

    static volatile boolean isInitialized = false;
    int callCount = 0;

    synchronized void initialize() {
        if (!isInitialized) {
            initializationLogic();
            isInitialized = true;
        }
    }

//    private void initializationLogic() {
//        callCount++;
//    }

    private void initializationLogic() {
        try {
            File myObj = new File("src/main/java/com/jason/filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
            callCount++;
        } catch(FileNotFoundException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}
