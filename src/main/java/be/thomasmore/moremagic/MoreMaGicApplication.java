package be.thomasmore.moremagic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class MoreMaGicApplication {
    public static void main(String[] args) {
        SpringApplication.run(MoreMaGicApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/users/*").allowedOrigins("http://localhost:3000");
                registry.addMapping("/scryfall/*").allowedOrigins("http://localhost:3000");
                registry.addMapping("/cardlist/*").allowedOrigins("http://localhost:3000");

            }
        };
    }

}
