import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Document {
    private List<Character> characters = new ArrayList<>();

    public void addCharacter(char value, CharacterStyle style) {
        characters.add(new Character(value, style));
    }

    //display each character with its properties
    public void display() {
        for (Character character : characters) {
            character.display();
        }
    }

    //save and load functions
    public void saveToFile(String filename) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(filename);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(characters);
        objectOutputStream.close();
        fileOutputStream.close();
        System.out.println("Document saved to " + filename);
    }

    public void loadFromFile(String filename) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(filename);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        characters = (List<Character>) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        System.out.println("Document loaded from " + filename);
    }
}