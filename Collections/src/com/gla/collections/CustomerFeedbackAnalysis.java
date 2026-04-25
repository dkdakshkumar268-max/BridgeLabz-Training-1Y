package com.gla.collections;

import java.util.*;

public class CustomerFeedbackAnalysis {
    public static void main(String[] args) {
        List<String> allFeedback = new ArrayList<>();
        Set<String> uniqueFeedback = new LinkedHashSet<>();
        Queue<String> feedbackQueue = new LinkedList<>();
        Stack<String> recentStack = new Stack<>();
        allFeedback.add("Good service");
        allFeedback.add("Fast delivery");
        allFeedback.add("Good service");
        allFeedback.add("Excellent support");
        allFeedback.add("Fast delivery");
        uniqueFeedback.addAll(allFeedback);
        for (String feedback : uniqueFeedback) {
            feedbackQueue.add(feedback);
        }
        System.out.println("Processing Feedback:");
        while (!feedbackQueue.isEmpty()) {
            String fb = feedbackQueue.poll();
            System.out.println("Processing: " + fb);
            recentStack.push(fb);
        }
        System.out.println("\n Most Recent Feedbacks:");
        int count = 3;
        while (!recentStack.isEmpty() && count-- > 0) {
            System.out.println(recentStack.pop());
        }
    }
}