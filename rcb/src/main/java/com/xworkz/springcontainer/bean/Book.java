package com.xworkz.springcontainer.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Properties;

@Component
public class Book {

public Book()
{
    System.out.println("No parameter in book");
}

//manualy generate the object
    @Bean
    public String name()
    {
        System.out.println("Name");
        return  "name";
    }

    @Bean
    public char[] letters()
    {
        System.out.println("Characters");
        return new char[]{'l','k'};
    }

    @Bean
public LinkedList<String> compiler()
{
    System.out.println("This is compiler method");
    return  new LinkedList<>();
}

@Bean
public Map plain()
{
    System.out.println("plain method");
    return new HashMap<>();
}

@Bean
public Properties print()
{
    System.out.println("no parameter in print method");
    return  new Properties();
}

@Bean
public Temple god()
{
    System.out.println("No parameter in god method");
    return  new Temple();
}

@Bean
public Mug drink()
{
    System.out.println("drink method");
    return  new Mug();
}

@Bean
public Spoon eat()
{
    System.out.println("No parameter in  Spoon method");
    return  new Spoon();
}

@Bean
public Snake bite()
{
    System.out.println("No parameter in Snake method");
    return  new Snake();
}


    @Component
    public static class Snake {

        public  Snake()
        {
            System.out.println("No parameter in Snake");
        }
    }
}
