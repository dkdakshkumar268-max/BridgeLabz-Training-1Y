package com.gla.collections;

import java.util.*;
    class Account {
        private int accountId;
        public Account(int accountId) {
            this.accountId = accountId;
        }
        public int getAccountId() {
            return accountId;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Account)) return false;
            Account acc = (Account) o;
            return accountId == acc.accountId;
        }
        @Override
        public int hashCode() {
            return Objects.hash(accountId);
        }
    }
    class Transaction {
        private int transactionId;
        private int accountId;
        private double amount;
        public Transaction(int transactionId, int accountId, double amount) {
            this.transactionId = transactionId;
            this.accountId = accountId;
            this.amount = amount;
        }
        public int getTransactionId() {
            return transactionId;
        }
        public int getAccountId() {
            return accountId;
        }
        public double getAmount() {
            return amount;
        }
        @Override
        public String toString() {
            return "Transaction ID: " + transactionId +
                    ", Account ID: " + accountId +
                    ", Amount: " + amount;
        }
    }
    public class BankingTransactionSystem {
        public static void main(String[] args) {
            List<Transaction> completedTransactions = new ArrayList<>();
            Queue<Transaction> pendingTransactions = new LinkedList<>();
            Set<Account> validAccounts = new HashSet<>();
            Stack<Transaction> rollbackStack = new Stack<>();
            validAccounts.add(new Account(101));
            validAccounts.add(new Account(102));
            validAccounts.add(new Account(103));
            pendingTransactions.add(new Transaction(1, 101, 500));
            pendingTransactions.add(new Transaction(2, 104, 1000));
            pendingTransactions.add(new Transaction(3, 102, 700));
            while (!pendingTransactions.isEmpty()) {
                Transaction t = pendingTransactions.poll();
                Account tempAccount = new Account(t.getAccountId());
                if (validAccounts.contains(tempAccount)) {
                    System.out.println("Processing: " + t);
                    completedTransactions.add(t);
                    rollbackStack.push(t);
                } else {
                    System.out.println("Invalid Account. Transaction Failed: " + t);
                }
            }
            if (!rollbackStack.isEmpty()) {
                Transaction last = rollbackStack.pop();
                completedTransactions.remove(last);
                System.out.println("\nRolled Back Transaction: " + last);
            }
            System.out.println("\nFinal Transactions:");
            for (Transaction t : completedTransactions) {
                System.out.println(t);
            }
        }
    }
