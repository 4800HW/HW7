import java.io.Serializable;

public class CharacterStyle implements Serializable {
    private static final long serialVersionUID = 1L;

    private String font;
    private String color;
    private int size;

    public CharacterStyle(String font, String color, int size) {
        this.font = font;
        this.color = color;
        this.size = size;
    }

    // Getters
    public String getFont() {
        return font;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }
}