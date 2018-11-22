package com.company;

public class Help {

    public String sendHelp() {
        String help = "=======================\n" +
                "Commands:\n" +
                "    Dungeons and Dragons:\n" +
                "        !r <Dice To Roll>D<Max Of Dice Range>+<Any Modifier>\n" +
                "            Advanced dice rolling command for anything to complicated for a simple roll\n" +
                "            Example: !r 12D6+2\n" +
                "\n" +
                "        !d<4,6,8,10,12,20,100>\n" +
                "            Rolls one of the specified dice \n" +
                "            Example: !d12 \n" +
                "\n" +
                "        !stats \n" +
                "            Rolls Random Stats For You\n" +
                "\n" +
                "    Game Groups:\n" +
                "        These Commands Just Mention Regular Players Of Different Games\n" +
                "            !g Civ\n" +
                "            !g Hoi4\n" +
                "            !g Stellaris\n" +
                "            !g Fallout\n" +
                "\n" +
                "    Funny Commands\n" +
                "        !chaos <Sometext>\n" +
                "            Randomly converts text to something worse\n" +
                "=======================";

        return help;
    }

}
