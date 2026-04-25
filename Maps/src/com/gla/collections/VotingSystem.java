package com.gla.collections;

import java.util.*;

public class VotingSystem {

    public static void main(String[] args) {

        Map<String, Integer> votes = new HashMap<>();
        String[] castVotes = {"Aman","Riya","Aman","Neha","Riya","Aman","Neha","Riya","Riya","Aman"};
        for (String candidate : castVotes) {
            votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
        }
        System.out.println(" Vote Count:");
        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        String winner = null;
        int maxVotes = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }
        System.out.println("\n Winner: " + winner + " with " + maxVotes + " votes");
    }
}
