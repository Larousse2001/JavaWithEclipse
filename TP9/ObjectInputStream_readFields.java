package TP9;

import java.io.*;
import java.util.Date;


public class ObjectInputStream_readFields {

    // Windows: C:/Data/test/game_setting.data
    private static String file_path = "/Volumes/Data/test/game_setting.data";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        GameSetting setting = new GameSetting(10, 80, null, null);

        writeGameSetting(setting);
        readGameSetting();
    }

    private static void writeGameSetting(GameSetting setting) throws IOException {
        File file = new File(file_path);
        file.getParentFile().mkdirs();

        OutputStream os = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(os);

        // Write a String
        oos.writeUTF("Game Settings, Save at " + new Date());
        // Write Object
        oos.writeObject(setting);

        oos.close();
    }

    private static void readGameSetting() throws IOException, ClassNotFoundException {
        File file = new File(file_path);
        file.getParentFile().mkdirs();

        InputStream is = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(is);

        // Read a String
        String info = ois.readUTF();

        // Read fields
        GameSetting setting = (GameSetting) ois.readObject();

        System.out.println("sound: " + setting.getSound());
        System.out.println("bightness: " + setting.getBightness());
        System.out.println("difficultyLevel: " + setting.getDifficultyLevel());
        System.out.println("userNote: " + setting.getUserNote());  // null.

        ois.close();
    }
}
