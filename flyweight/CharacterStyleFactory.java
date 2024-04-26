import java.util.HashMap;
import java.util.Map;

public class CharacterStyleFactory {
    private Map<String, CharacterStyle> characterStyles = new HashMap<>();

    public CharacterStyle getCharacterStyle(String font, String color, int size) {
        String key = font + color + size;
        if (!characterStyles.containsKey(key)) {
            characterStyles.put(key, new CharacterStyle(font, color, size));
        }
        return characterStyles.get(key);
    }
}