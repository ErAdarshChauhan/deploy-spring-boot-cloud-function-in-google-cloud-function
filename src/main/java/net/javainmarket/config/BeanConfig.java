package net.javainmarket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class BeanConfig {

    @Bean
    public Function<String,String> uppercase(){
        return (input)-> input.toUpperCase();
    }

}
