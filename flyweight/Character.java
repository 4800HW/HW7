import java.io.Serializable;

public class Character implements Serializable {
    private static final long serialVersionUID = 1L;

    private char value;
    private CharacterStyle style;

    public Character(char value, CharacterStyle style) {
        this.value = value;
        this.style = style;
    }

    public void display() {
        System.out.println("Character: " + value + ", Font: " + style.getFont() + ", Color: " + style.getColor() + ", Size: " + style.getSize());
    }
}