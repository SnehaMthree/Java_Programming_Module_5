package com.healthtrack.user_profile_management;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Alice", 25, "alice@example.com");
        PremiumUser premiumUser1 = new PremiumUser("Bob", 30, "bob@example.com", "Gold");

        user1.displayInfo();
        System.out.println();
        premiumUser1.displayInfo();
    }
}
