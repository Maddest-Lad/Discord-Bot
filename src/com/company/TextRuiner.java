package com.company;

public class TextRuiner {

    public String Ruin(String message){

        int Temp = Select();

        message = message.substring(6);

        if(Temp==1) {return Spongebob(message);}
        if(Temp==2) {return Italicized(message);}
        if(Temp==3) {return Bold(message);}
        if(Temp==4) {return Combined(message);}
        if(Temp==5||Temp==6) {return Chaos(message);}

        return "Something Went Wrong";
    }

    //Does Some Jank Stuff For Discord
    private static String Chaos(String Input) {
        Input = Input.toLowerCase();
        char[] chars = Input.toCharArray();
        int Temp;
        String total = "";

        for(int i = 0; i < Input.length(); i++) {
            Temp = Select();

            if(chars[i]==' ') {total += " ";}

            else{
                if(Temp==1) {total += Character.toUpperCase(chars[i]);}
                if(Temp==2) {total += chars[i];}
                if(Temp==3) {total += " *"+chars[i]+"* ";}
                if(Temp==4) {total += " **"+chars[i]+"** ";}
                if(Temp==5) {total += " ***"+chars[i]+"*** ";}
                if(Temp==6) {total += chars[i];}
            }
        }
        return total;
    }


    //Alternates Caps and Lowercase
    private static String Spongebob(String Input) {
        Input = Input.toLowerCase();
        char[] chars = Input.toCharArray();

        String total = "";
        for(int i = 0; i < Input.length(); i++) {
            if(i % 2 == 0) {total += Character.toUpperCase(chars[i]);}
            else {total += chars[i];}
        }
        return total;
    }

    //Italicizes For Discord
    private static String Italicized(String Input) {
        return "*"+Input+"*";
    }

    //Bolds for Discord
    private static String Bold(String Input) {
        return  "**"+Input+"**";
    }

    //Bolds and Italicizes for Discord
    private static String Combined(String Input) {
        return "***"+Input+"***";
    }

    private static int Select() {
        return (int)(Math.random() * ((6 - 1) + 1)) + 1;
    }

}