package com.gla.streamapi;

import java.util.*;
import java.util.function.Predicate;
class Alert {
    String type;
    int severity;
    String message;
    public Alert(String type, int severity, String message) {
        this.type = type;
        this.severity = severity;
        this.message = message;
    }
    @Override
    public String toString() {
        return type + " | Severity: " + severity + " | " + message;
    }
}
public class HospitalAlerts {
    public static void main(String[] args) {
        List<Alert> alerts = List.of(
                new Alert("EMERGENCY", 10, "Heart rate critical!"),
                new Alert("REMINDER", 3, "Take medicine"),
                new Alert("INFO", 2, "Daily checkup complete"),
                new Alert("EMERGENCY", 9, "Blood pressure high")
        );
        Predicate<Alert> emergencyOnly = a -> a.type.equals("EMERGENCY");
        Predicate<Alert> highSeverity = a -> a.severity >= 8;
        Predicate<Alert> emergencyAndSevere = emergencyOnly.and(highSeverity);
        System.out.println("Filtered Alerts:");
        filterAlerts(alerts, emergencyAndSevere);
    }
    public static void filterAlerts(List<Alert> alerts, Predicate<Alert> condition) {
        alerts.stream()
                .filter(condition)
                .forEach(System.out::println);
    }
}