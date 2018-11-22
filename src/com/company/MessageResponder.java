package com.company;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class MessageResponder extends ListenerAdapter {
    public void onMessageReceived(MessageReceivedEvent event) {
        String message = event.getMessage().getContentDisplay();

        //Convert Everything To Lowercase
        message = message.toLowerCase();

        //D&D (Hard) Commands
        String dndMod = "!";
        if (message.startsWith(dndMod + "r")) {
            event.getTextChannel().sendMessage(AdvancedDiceRoller.Roll(message)).queue();
        }

        if (message.startsWith(dndMod + "d")) {
            event.getTextChannel().sendMessage(BasicDiceRoller.Roll(message)).queue();
        }

        if (message.startsWith(dndMod + "stats")) {
            StatRoller stats = new StatRoller();
            event.getTextChannel().sendMessage(stats.CreateCharacter()).queue();
        }

        //User Id's
        String Sam = "<@!165971552771244033>";
        String Jack = "<@312274227468435466>";
        String Charlie = "<@231957170948800512>";
        String Nathan = "<@!283102414553481216>";
        String Thomas = "<@314487656056619010>";

        //Game Group Commands
        String gameMod = "!g";
        if (message.startsWith(gameMod + " civ")) {
            event.getTextChannel().sendMessage(Jack+" "+Sam+" "+Nathan+" "+Charlie+", Civilization Anyone?").queue();
        }

        if (message.startsWith(gameMod + " hoi4")) {
            event.getTextChannel().sendMessage(Jack+" "+Sam+" "+Thomas+", Hearts of Iron 4 Anyone?").queue();
        }

        if (message.startsWith(gameMod + " stellaris")) {
            event.getTextChannel().sendMessage(Jack+" "+Sam+" "+Nathan+", Stellaris Anyone?").queue();
        }

        if (message.startsWith(gameMod + " fallout")) {
            event.getTextChannel().sendMessage(Jack+" "+Sam+" Fallout 76 Anyone?").queue();
        }


        //Text (Soft) Commands
        if (message.startsWith("gn")) {
            event.getTextChannel().sendMessage("goodnight").queue();
        }

        //Auto Mod Swear Prevention
        //TODO the Auto Part
        if (message.contains("wtf")) {
            event.getTextChannel().sendMessage("Don't Use That Fucking Language Here").queue();
        }

        if (message.contains("fuck")) {
            event.getTextChannel().sendMessage("Don't Use That Fucking Language Here").queue();
        }

        if (message.contains("shit")) {
            event.getTextChannel().sendMessage("Don't Use That Fucking Language Here").queue();
        }

        if (message.contains("damn")) {
            event.getTextChannel().sendMessage("Don't Use That Fucking Language Here").queue();
        }

        //Help Commands
        if (message.startsWith("!help")) {
            Help helper = new Help();
            event.getTextChannel().sendMessage(helper.sendHelp()).queue();
        }

        //Fun Commands
        if (message.startsWith("!chaos")) {
            TextRuiner rip = new TextRuiner();
            event.getTextChannel().sendMessage(rip.Ruin(message)).queue();
        }

        if (message.contains("rip")) {
            event.getTextChannel().sendMessage("f").queue();
        }
    }
}







