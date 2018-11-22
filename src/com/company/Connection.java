package com.company;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import javax.security.auth.login.LoginException;

public class Connection {
    public static void main(String[] args) {
        JDA discord = null;

        try {
            discord = new JDABuilder(AccountType.BOT).setToken("NDgxOTA2ODg5NjA5OTY5NjY2.Dl9lGg.CVdiSzlB2_vUMoZgOdWdBvoLpzo").buildBlocking();
        } catch (LoginException | InterruptedException e) {
            e.printStackTrace();
        }

        assert discord != null;
        discord.addEventListener(new MessageResponder());
    }
}