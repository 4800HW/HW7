import java.io.IOException;

public class driver {
    public static void main(String[] args) {
        CharacterStyleFactory styleFactory = new CharacterStyleFactory();

        Document document = new Document();

        //add each character with different properties
        document.addCharacter('H', styleFactory.getCharacterStyle("Arial", "Red", 12));
        document.addCharacter('e', styleFactory.getCharacterStyle("Calibri", "Blue", 14));
        document.addCharacter('l', styleFactory.getCharacterStyle("Verdana", "Black", 16));
        document.addCharacter('l', styleFactory.getCharacterStyle("Arial", "Red", 12));
        document.addCharacter('o', styleFactory.getCharacterStyle("Calibri", "Blue", 14));
        document.addCharacter('C', styleFactory.getCharacterStyle("Verdana", "Black", 16));
        document.addCharacter('S', styleFactory.getCharacterStyle("Arial", "Red", 12));
        document.addCharacter('5', styleFactory.getCharacterStyle("Calibri", "Blue", 14));
        document.addCharacter('8', styleFactory.getCharacterStyle("Verdana", "Black", 16));
        document.addCharacter('0', styleFactory.getCharacterStyle("Arial", "Red", 12));
        document.addCharacter('0', styleFactory.getCharacterStyle("Calibri", "Blue", 14));

        // System.out.println("Document content:");
        // document.display();

        //save
        try {
            document.saveToFile("document.txt");
            System.out.println("document has been saved\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //load and display
        try {
            Document loadedDocument = new Document();
            loadedDocument.loadFromFile("document.txt");
            System.out.println("\nLoaded Document content:");
            loadedDocument.display();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}