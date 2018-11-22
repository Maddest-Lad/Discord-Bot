package com.company;

public class AdvancedDiceRoller {

    public static String Roll(String message) {
        System.out.println(message);
        return Parse(message);
    }

    public static String Parse(String message) {
        String[] rollInfo = new String[3];
        String command = message.substring(3);
        //System.out.println(command);

        //Split Into Info
        String[] parts = command.split("D");
        String part1 = parts[0];
        String part2 = parts[1];
        String[] parts2 = part2.split("\\+");
        String part3 = parts2[0];
        String part4 = parts2[1];
        //System.out.println(part1 + " and " + part3 + " and " + part4);

        //Assign These To Usefully Named Array
        rollInfo[0] = part1; //How Many
        rollInfo[1] = part3; //Max
        rollInfo[2] = part4; //Modifier

        int total = 0;

        for(int i = 0; i < Integer.parseInt(rollInfo[0]); i++) {
            total += randomRoll(Integer.parseInt(rollInfo[1]));
        }
        total += Integer.parseInt(rollInfo[2]);
        return Integer.toString(total);
    }

    public static int randomRoll(int max) {
        int roll = (int) (Math.random() * ((max - 1) + 1)) + 1;
        return roll;
    }
}
