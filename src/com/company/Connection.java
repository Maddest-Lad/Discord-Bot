package com.company;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import javax.security.auth.login.LoginException;

public class Connection {
    public static void main(String[] args) {
        JDA discord = null;

        try {
            discord = new JDABuilder(AccountType.BOT).setToken("Nope").buildBlocking();
        } catch (LoginException | InterruptedException e) {
            e.printStackTrace();
        }

        assert discord != null;
        discord.addEventListener(new MessageResponder());
    }
}