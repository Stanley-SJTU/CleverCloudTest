package com.emse.spring.faircorp;

import com.emse.spring.faircorp.hello.ConsoleGreetingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FaircorpApplicationConfig {

    @Bean
    public CommandLineRunner greetingCommandLine(ConsoleGreetingService gs) { // (3)method argument
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                // (4)call service to output "Hello, Spring"
                gs.greet("Spring");
            }
        };
    }
}
