package com.github.thisguy_cinsea.chorechart;

import com.github.thisguy_cinsea.chorechart.model.User;
import com.github.thisguy_cinsea.chorechart.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChoreChartApplication implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(ChoreChartApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userRepository.save(new User("Will", "Ancona", "w.ancona@gmail.com", "w.ancona", "password123"));
        userRepository.save(new User("Breanna", "Thompson", "b.thompson@gmail.com", "b.thompson", "password123"));
        userRepository.save(new User("Nakayla", "Ancona", "k.ancona@gmail.com", "k.ancona", "password123"));
        userRepository.save(new User("Nadya", "Ancona", "n.ancona@gmail.com", "n.ancona", "password123"));
        userRepository.save(new User("Bria", "Ancona", "b.ancona@gmail.com", "b.ancona", "password123"));
        userRepository.save(new User("Will", "Ancona", "jr.ancona@gmail.com", "jr.ancona", "password123"));
    }
}
