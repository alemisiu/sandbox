import  java.util.Random;

class NumberInfo {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(10000);
        System.out.println("Wylosowana liczba: " + randomInt);

        NumberUtils numberUtils = new NumberUtils();
        numberUtils.compareNumberAndPrint(randomInt, 5000);
        numberUtils.printOddOrEven(randomInt);
        System.out.println("Uzupełniona do 4 cyfr: " + numberUtils.getFourDigitNumber(randomInt));
    }
}