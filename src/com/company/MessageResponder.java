package com.company;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class MessageResponder extends ListenerAdapter {
    public void onMessageReceived(MessageReceivedEvent event) {
        String message = event.getMessage().getContentDisplay();

        //D&D (Hard) Commands
        String dndMod = "!";
        if (message.startsWith(dndMod + "r")) {
            AdvancedDiceRoller dice = new AdvancedDiceRoller();
            event.getTextChannel().sendMessage(dice.Roll(message)).queue();
        }

        if (message.startsWith(dndMod + "d")) {
            BasicDiceRoller dice = new BasicDiceRoller();
            event.getTextChannel().sendMessage(dice.Roll(message)).queue();
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
        if (message.startsWith(gameMod + " Civ")) {
            event.getTextChannel().sendMessage(Jack+" "+Sam+" "+Nathan+" "+Charlie+", Civilization Anyone?").queue();
        }

        if (message.startsWith(gameMod + " Hoi4")) {
            event.getTextChannel().sendMessage(Jack+" "+Sam+" "+Thomas+", Hearts of Iron 4 Anyone?").queue();
        }

        if (message.startsWith(gameMod + " Stellaris")) {
            event.getTextChannel().sendMessage(Jack+" "+Sam+" "+Nathan+", Stellaris Anyone?").queue();
        }

        if (message.startsWith(gameMod + " Fallout")) {
            event.getTextChannel().sendMessage(Jack+" "+Sam+" Fallout 76 Anyone?").queue();
        }


        //Text (Soft) Commands
        if (message.startsWith("gn")) {
            event.getTextChannel().sendMessage("goodnight").queue();
        }

        //Auto Mod Swear Prevention
        //TODO the Auto Part
        if (message.startsWith("WTF")) {
            event.getTextChannel().sendMessage("Don't Use That Fucking Language Here").queue();
        }

        if (message.startsWith("Fuck")) {
            event.getTextChannel().sendMessage("Don't Use That Fucking Language Here").queue();
        }

        if (message.startsWith("Shit")) {
            event.getTextChannel().sendMessage("Don't Use That Fucking Language Here").queue();
        }

        if (message.startsWith("Damn")) {
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

        if (message.startsWith("rip")) {
            event.getTextChannel().sendMessage("f").queue();
        }
    }
}







