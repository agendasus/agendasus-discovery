package br.com.agendasus.discovery;

import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.text.SimpleDateFormat;
import java.util.Date;

@Configuration
public class SystemInicialization {

    @PostConstruct
    public void inicialization() {
        showSystemInfo();
    }

    private void showSystemInfo() {
        System.out.println("#--------------- INITIALIZING SYSTEM ---------------#");
        System.out.println("     ___       _______  _______ .__   __.  _______       ___           _______. __    __       _______.");
        System.out.println("    /   \\     /  _____||   ____||  \\ |  | |       \\     /   \\         /       ||  |  |  |     /       |");
        System.out.println("   /  ^  \\   |  |  __  |  |__   |   \\|  | |  .--.  |   /  ^  \\       |   (----`|  |  |  |    |   (----`");
        System.out.println("  /  /_\\  \\  |  | |_ | |   __|  |  . `  | |  |  |  |  /  /_\\  \\       \\   \\    |  |  |  |     \\   \\ ");
        System.out.println(" /  _____  \\ |  |__| | |  |____ |  |\\   | |  '--'  | /  _____  \\  .----)   |   |  `--'  | .----)   |");
        System.out.println("/__/     \\__\\ \\______| |_______||__| \\__| |_______/ /__/     \\__\\ |_______/     \\______/  |_______/ ");
        System.out.println("");
        System.out.println("#--------------- SYSTEM STARTED ---------------#");
        System.out.println("Current Date: " + new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
        System.out.println("Service: AgendaSUS-Discovery");
        System.out.println("Running on port: " + (System.getenv("APP_DISCOVERY_PORT")!=null ? System.getenv("APP_DISCOVERY_PORT") : "8761"));
    }

}

