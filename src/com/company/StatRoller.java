package com.company;

public class StatRoller {

    public String CreateCharacter() {
        return "```"+GenerateStats()+"```";
    }

    //Generates Stats, Adds Tag + Stats + Mod + Recommendation + Point-Diffs To Response
    private String GenerateStats() {
        String response = "";
        int[] stats = new int[6];
        String[] Ability = {"Str: ","Int: ","Wis: ","Dex: ","Con: ","Chr: "};

        for(int i = 0; i < 6; i++)
        {
            //Everything Important Happens Here (Adding Ability Tag + Ability Value + Modifier To Response)
            stats[i] = RollStat();
            response += Ability[i]+stats[i]+Mod(stats[i])+"\n";
        }

        //Here is where Recommendation and Point-Diffs Are Added
        String[] classes = {"Barbarian, Fighter or Paladin", "Wizard", "Cleric, Druid, Monk or Ranger", "Rogue, Ranger, Monk or Fighter", "Fighter, Paladin or Barbarian", "Bard, Sorcerer, Paladin or Warlock"};
        int max = 0; //Finds Indices Of Highest Stat
        int sum = 0; //Finds Total Number of Points

        for (int i = 0; i < stats.length; i++)
        {
            max = (stats[i] > stats[max]) ? i : max;
        }

        for(int i : stats) {
            sum += i;
        }

        response += "You Could Be A Good " + classes[max]+"\n";
        if(sum-70!=Math.abs(sum-70)) {response += "You Have "+sum+" Points, "+(sum-70)+" Less Than Normal"+"\n";}
        else {response += "You Have "+sum+" Points, "+(sum-70)+" More Than Normal"+"\n";}

        System.out.println(response);
        return response;
    }

    //Finds + Returns Stat Modifier
    private String Mod(int statValue) {
        int modifier = (statValue/2)-5;
        if(modifier >= 0) {return " +"+Integer.toString(modifier);}
        else {return " "+Integer.toString(modifier);}
    }

    //Rolls 4 Dice and Subtracts Ignores Value
    private int RollStat() {
        int first = (int)(Math.random() * ((6 - 1) + 1)) + 1;
        int second = (int)(Math.random() * ((6 - 1) + 1)) + 1;
        int third = (int)(Math.random() * ((6 - 1) + 1)) + 1;
        int fourth = (int)(Math.random() * ((6 - 1) + 1)) + 1;

        int min = Math.min(Math.min(first,second),Math.min(third,fourth));

        return first+second+third+fourth-min;
    }
}