package com.gla.collections;

import java.time.LocalDate;
import java.util.*;
class Policy implements Comparable<Policy> {
    int policyNumber;
    String policyholderName;
    LocalDate expiryDate;
    String coverageType;
    double premiumAmount;

    public Policy(int policyNumber, String name, LocalDate expiryDate, String coverageType, double premium) {
        this.policyNumber = policyNumber;
        this.policyholderName = name;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premium;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Policy)) return false;
        Policy p = (Policy) o;
        return this.policyNumber == p.policyNumber;
    }
    @Override
    public int hashCode() {
        return Integer.hashCode(policyNumber);
    }
    @Override
    public int compareTo(Policy p) {
        return this.expiryDate.compareTo(p.expiryDate);
    }
    @Override
    public String toString() {
        return policyNumber+" "+policyholderName+" "+expiryDate+" "+coverageType+" "+premiumAmount;
    }
}
class PolicyManager {
    Set<Policy> hashSet = new HashSet<>();
    Set<Policy> linkedHashSet = new LinkedHashSet<>();
    Set<Policy> treeSet = new TreeSet<>();
    public void addPolicy(Policy p)
    {
        hashSet.add(p);
        linkedHashSet.add(p);
        treeSet.add(p);
    }
    public void displayAll() {
        System.out.println("All Unique Policies:");
        for (Policy p : hashSet) {
            System.out.println(p);
        }
    }
    public void expiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);
        System.out.println("Expiring within 30 days:");
        for (Policy p : treeSet) { // sorted helps
            if (!p.expiryDate.isBefore(today) && !p.expiryDate.isAfter(limit)) {
                System.out.println(p);
            }
        }
    }
    public void filterByCoverage(String type) {
        System.out.println("Coverage: " + type);
        for (Policy p : hashSet) {
            if (p.coverageType.equalsIgnoreCase(type)) {
                System.out.println(p);
            }
        }
    }
    public void findDuplicates(List<Policy> list) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (Policy p : list) {
            if (!seen.add(p.policyNumber)) {
                duplicates.add(p.policyNumber);
            }
        }
        System.out.println("Duplicate Policy Numbers: " + duplicates);
    }
}
public class InsurancePolicyManagementSystem {
    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();
        Policy p1 = new Policy(101, "Akshat", LocalDate.now().plusDays(10), "Health", 5000);
        Policy p2 = new Policy(102, "Rahul", LocalDate.now().plusDays(40), "Auto", 3000);
        Policy p3 = new Policy(103, "Amit", LocalDate.now().plusDays(20), "Home", 7000);
        Policy p4 = new Policy(101, "Duplicate", LocalDate.now().plusDays(15), "Health", 6000);
        manager.addPolicy(p1);
        manager.addPolicy(p2);
        manager.addPolicy(p3);
        manager.addPolicy(p4);
        manager.displayAll();
        manager.expiringSoon();
        manager.filterByCoverage("Health");
        List<Policy> list = Arrays.asList(p1, p2, p3, p4);
        manager.findDuplicates(list);
        long start, end;
        start = System.nanoTime();
        Set<Policy> hs = new HashSet<>();
        hs.addAll(list);
        end = System.nanoTime();
        System.out.println("HashSet Time: " + (end - start));
        start = System.nanoTime();
        Set<Policy> lhs = new LinkedHashSet<>();
        lhs.addAll(list);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Time: " + (end - start));
        start = System.nanoTime();
        Set<Policy> ts = new TreeSet<>();
        ts.addAll(list);
        end = System.nanoTime();
        System.out.println("TreeSet Time: " + (end - start));
    }
}
