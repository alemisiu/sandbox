import java.util.Scanner;

public class WordStatistics {
    public static void main(String[] args) {
        String word = readWordFromUser();
        int digits = countDigits(word);
        System.out.println("liczba cyfr w tekscie:" + digits);
        int letters = countLetters(word);
        System.out.println("liczba liter w tekscie :" + letters);
        try {
            int biggestDigitInText = findBiggestDigit(word);
            System.out.println("najwieksza cyfra w tekscie to" + biggestDigitInText);
        } catch (DigitNotFoundException e) {
            System.out.println("w tekscie nie znajdowala sie zadna cyfra");
        }
    }


    private static String readWordFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolny wyraz:");
        return scanner.nextLine();
    }

    private static int countDigits(String word) {
        char[] chars = word.toCharArray();
        int digits = 0;
        for (char aChar : chars) {
            if (Character.isDigit(aChar))
                digits++;
        }
        return digits;

    }

    private static int countLetters(String word) {
        char[] chars = word.toCharArray();
        int letters = 0;
        for (char aChar : chars) {
            if (Character.isLetter(aChar))
                letters++;
        }
        return letters;
    }

    private static int findBiggestDigit(String word) {
        char[] chars = word.toCharArray();
        final int notFound = -1;
        int biggestNumber = notFound;
        for (char aChar : chars) {
            if (Character.isDigit(aChar)) {
                int digit = Character.getNumericValue(aChar);
                biggestNumber = Integer.max(biggestNumber, digit);
            }
        }
        if (biggestNumber == notFound)
            throw new DigitNotFoundException();
        return biggestNumber;
    }

    private static class DigitNotFoundException extends RuntimeException {

    }
}

