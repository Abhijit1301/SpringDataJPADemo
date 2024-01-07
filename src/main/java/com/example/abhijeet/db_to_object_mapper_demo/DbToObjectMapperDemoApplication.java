package com.example.abhijeet.db_to_object_mapper_demo;

import com.example.abhijeet.db_to_object_mapper_demo.model.Bots;
import com.example.abhijeet.db_to_object_mapper_demo.model.Players;
import com.example.abhijeet.db_to_object_mapper_demo.repository.BotsRepo;
import com.example.abhijeet.db_to_object_mapper_demo.repository.PlayersRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

@SpringBootApplication(scanBasePackages = {"com.example"})
public class DbToObjectMapperDemoApplication {

    private PlayersRepo playerRepository;
    private BotsRepo botRepository;

    public DbToObjectMapperDemoApplication(PlayersRepo playerRepository, BotsRepo botRepository) {
        this.playerRepository = playerRepository;
        this.botRepository = botRepository;
    }

    public static void main(String[] args) {
        ApplicationContext context  =
                SpringApplication.run(DbToObjectMapperDemoApplication.class, args);
        DbToObjectMapperDemoApplication app = context.getBean(DbToObjectMapperDemoApplication.class);
        app.populateDB();
    }


    void populateDB() {
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.println("Enter x to exit.... or...");
            System.out.println("Enter player details.");
            String name = reader.nextLine();
            if (name.equalsIgnoreCase("x")) break;
            String age = reader.nextLine();
            if (name.equalsIgnoreCase("x")) break;
            int age_int = 0;
            try {
                age_int = Integer.parseInt(age);
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
            Players player = new Players();
            player.setName(name);
            player.setAge(age_int);
            playerRepository.save(player);
        }

        while (true) {
            System.out.println("Enter x to exit.... or...");
            System.out.println("Enter Bot Details");
            String name = reader.nextLine();
            if (name.equalsIgnoreCase("x")) break;
            String age = reader.nextLine();
            if (name.equalsIgnoreCase("x")) break;

            String rank = reader.nextLine();
            if (name.equalsIgnoreCase("x")) break;

            int age_int = 0;
            int rank_int = 1;
            try {
                age_int = Integer.parseInt(age);
                rank_int = Integer.parseInt(rank);
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
            Bots bot = new Bots();
            bot.setAge(age_int);
            bot.setName(name);
            bot.setBot_rank(rank_int);
            try {
                botRepository.save(bot);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
