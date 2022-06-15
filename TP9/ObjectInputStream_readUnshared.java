package TP9;

import java.io.*;
import java.util.ArrayList;

public class ObjectInputStream_readUnshared {

    // Windows: C:/Data/test/test1.data
    private static String file_path = "/Volumes/Data/test/test.data";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writeUnsharedTest();
        
        readUnsharedTest();
    }
    
    private static void writeUnsharedTest() throws IOException  {
        File file = new File(file_path);
        file.getParentFile().mkdirs();
        
        ArrayList<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        
        OutputStream os = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        
        oos.writeUnshared(list); // Write the first time
        oos.writeUnshared(list); // Write the second time
        oos.close();
    }

    @SuppressWarnings({ "unchecked" })
    private static void readUnsharedTest() throws IOException, ClassNotFoundException  {
        File file = new File(file_path);
        
        ArrayList<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        
        InputStream is = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(is);
        
        ArrayList<String> list1 = (ArrayList<String>) ois.readUnshared();  
        ArrayList<String> list2 = (ArrayList<String>) ois.readUnshared();  
        
        System.out.println("list1 == list2? " + (list1 == list2));
        
        ois.close();
    }
}
