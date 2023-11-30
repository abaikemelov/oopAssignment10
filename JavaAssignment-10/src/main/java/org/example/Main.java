package org.example;

public class Main {
    public static void main(String args[]){
        StringProcessor processor = new StringProcessor();

        boolean testing1 = processor.isStrongPassword("Qwerty1234#55");
        System.out.println(testing1);

        int testing2 = processor.calculateDigits("Hello2 13 World 2232");
        System.out.println(testing2);

        int testing3 = processor.calculateWords("Not my cup of tea");
        System.out.println(testing3);

        double testing4 = processor.calculateExpression("9999 + 1");
        System.out.println(testing4);

    }
}
