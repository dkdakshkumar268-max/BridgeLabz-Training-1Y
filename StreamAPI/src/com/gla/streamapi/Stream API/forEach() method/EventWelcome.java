package com.gla.streamapi;

import java.util.*;
public class EventWelcome {
    public static void main(String[] args) {
        List<String> attendees = Arrays.asList("Akshat","Shikhar","Amit","Praveen");
        attendees.forEach(name->System.out.println("Welcome to the event, " + name + "!"));
    }
}
