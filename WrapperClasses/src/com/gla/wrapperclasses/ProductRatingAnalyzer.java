package com.gla.wrapperclasses;
import java.util.*;
public class ProductRatingAnalyzer {
    public static void main(String[] args) {
        int[] ratingsArray = {5, 4, 3, 5};
        ArrayList<Integer> ratingsList = new ArrayList<>();
        ratingsList.add(4);
        ratingsList.add(null);
        ratingsList.add(5);
        ratingsList.add(2);
        ArrayList<Integer> combinedRatings = new ArrayList<>();
        for (int i = 0; i < ratingsArray.length; i++) {
            combinedRatings.add(ratingsArray[i]);
        }
        for (int i = 0; i < ratingsList.size(); i++) {
            Integer rating = ratingsList.get(i);
            if (Objects.nonNull(rating)) {
                combinedRatings.add(rating);
            }
        }
        int sum = 0;
        int count = 0;
        for (int i = 0; i < combinedRatings.size(); i++) {
            sum += combinedRatings.get(i);
            count++;
        }
        double average = 0.0;
        if (count > 0) {
            average = (double) sum / count;
        }
        System.out.println("Combined Ratings: " + combinedRatings);
        System.out.println("Average Rating: " + average);
    }
}
