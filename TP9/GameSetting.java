package TP9;

import java.io.IOException;
import java.io.ObjectInputStream;

public class GameSetting implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int sound;
    private int bightness;
    private String difficultyLevel;

    private String userNote;

    public GameSetting(int sound, int bightness, String difficultyLevel, String userNote) {
        this.sound = sound;
        this.bightness = bightness;
        this.difficultyLevel = difficultyLevel;
        this.userNote = userNote;
    }

    public int getSound() {
        return sound;
    }

    public int getBightness() {
        return bightness;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public String getUserNote() {
        return userNote;
    }

    // Do not change name and parameter of this method.
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        ObjectInputStream.GetField fields = in.readFields();

        this.sound = fields.get("sound", 50);
        this.bightness = fields.get("bightness", 50);
        
        // Edit fields
        this.difficultyLevel = (String) fields.get("difficultyLevel", "Easy"); // Default
        if (this.difficultyLevel == null) {
            this.difficultyLevel = "Easy";
        }

        this.userNote = (String) fields.get("userNote", "Have fun!"); // Default
        if (this.userNote == null) {
            this.userNote = "Have fun!";
        }
    }
}
