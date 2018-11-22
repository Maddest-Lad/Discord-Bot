package com.company;

public class BasicDiceRoller {

    public static String Roll(String message) {
        return BasicRoll(message);
    }

    public static String BasicRoll(String input) {
        System.out.println(input);

        if(input.equals("!d4")) return Integer.toString(randomRoll(4));

        if (input.equals("!d6")) return Integer.toString(randomRoll(6));

        if (input.equals("!d8")) return Integer.toString(randomRoll(8));

        if(input.equals("!d10")) return Integer.toString(randomRoll(10));

        if(input.equals("!d12")) return Integer.toString(randomRoll(12));

        if(input.equals("!d20")) return Integer.toString(randomRoll(20));

        if(input.equals("!d100")) return Integer.toString(randomRoll(100));

        return "You Did It Wrong";
    }

    public static int randomRoll(int max) {
        int roll = (int) (Math.random() * ((max - 1) + 1)) + 1;
        return roll;
    }
}
