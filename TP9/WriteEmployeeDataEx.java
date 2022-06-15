package TP9;

import java.io.*;
import java.util.Date;

public class WriteEmployeeDataEx {

    // Windows: C:/Data/test/employees.data
    private static String file_path = "/Volumes/Data/test/employees.data";

    public static void main(String[] args) throws IOException {
        File outFile = new File(file_path);

        outFile.getParentFile().mkdirs();

        Employee e1 = new Employee("Tom", 1000f);
        Employee e2 = new Employee("Jerry", 2000f);
        Employee e3 = new Employee("Donald", 1200f);

        Employee[] employees = new Employee[] { e1, e2, e3 };

        OutputStream os = new FileOutputStream(outFile);
        ObjectOutputStream oos = new ObjectOutputStream(os);

        System.out.println("Writing file: " + outFile.getAbsolutePath());

        oos.writeObject(new Date());
        oos.writeUTF("Employee data"); // Some informations.

        oos.writeInt(employees.length); // Number of Employees

        for (Employee e : employees) {
            oos.writeObject(e);
        }
        oos.close();
        System.out.println("Finished!");
    }
}
