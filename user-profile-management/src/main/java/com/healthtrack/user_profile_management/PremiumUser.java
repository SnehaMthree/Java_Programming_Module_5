package com.healthtrack.user_profile_management;

public class PremiumUser extends User {
    private String subscriptionLevel;

    public PremiumUser(String name, int age, String email, String subscriptionLevel) {
        super(name, age, email);
        this.subscriptionLevel = subscriptionLevel;
    }

    public String getSubscriptionLevel() {
        return subscriptionLevel;
    }

    public void setSubscriptionLevel(String subscriptionLevel) {
        this.subscriptionLevel = subscriptionLevel;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subscription Level: " + subscriptionLevel);
    }
}
