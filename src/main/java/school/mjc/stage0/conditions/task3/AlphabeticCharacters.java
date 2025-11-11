package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {

        if (!((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z'))) {
            System.out.println("wrong alphabet!");
        }
        // Проверяем, является ли символ гласной
        else if (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U' ||
                character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
            System.out.println("Vowel");
        }
        // Остальные буквы — согласные
        else {
            System.out.println("Consonant");
        }


    }
}
