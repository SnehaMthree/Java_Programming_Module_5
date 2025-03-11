package com.healthtrack.user_profile_management;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    @Test
    public void testUserCreation() {
        User user = new User("Alice", 25, "alice@example.com");
        assertEquals("Alice", user.getName());
        assertEquals(25, user.getAge());
        assertEquals("alice@example.com", user.getEmail());
    }

    @Test
    public void testPremiumUserCreation() {
        PremiumUser premiumUser = new PremiumUser("Bob", 30, "bob@example.com", "Gold");
        assertEquals("Bob", premiumUser.getName());
        assertEquals(30, premiumUser.getAge());
        assertEquals("bob@example.com", premiumUser.getEmail());
        assertEquals("Gold", premiumUser.getSubscriptionLevel());
    }

    @Test
    public void testSetters() {
        User user = new User("Charlie", 40, "charlie@example.com");
        user.setName("Charles");
        user.setAge(41);
        user.setEmail("charles@example.com");
        
        assertEquals("Charles", user.getName());
        assertEquals(41, user.getAge());
        assertEquals("charles@example.com", user.getEmail());
    }
}

