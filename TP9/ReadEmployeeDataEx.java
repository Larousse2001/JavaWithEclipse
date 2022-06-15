package TP9;

import java.io.*;
import java.util.Date;


public class ReadEmployeeDataEx {

    // Windows: C:/Data/test/employees.data
    private static String file_path = "/Volumes/Data/test/employees.data";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File inFile = new File(file_path);
 

        InputStream is = new FileInputStream(inFile);
        ObjectInputStream ois = new ObjectInputStream(is);

        System.out.println("Reading file: " + inFile.getAbsolutePath());
        System.out.println();

        Date date = (Date) ois.readObject();
        String info = ois.readUTF();
        
        System.out.println(date);
        System.out.println(info);
        System.out.println();
        
        int employeeCount = ois.readInt();
        
        for(int i=0; i< employeeCount; i++) {
            Employee e = (Employee) ois.readObject();
            System.out.println("Employee Name: " + e.getFullName() +" / Salary: " + e.getSalary());
        }
        ois.close();
    }
}
