package services;

import models.User;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private List<User> subscribers;
    // Constructor to initialize subscriber list
    public NotificationService() {
        subscribers = new ArrayList<>();
    }
    // Method for users to subscribe to notifications
    public void subscribe(User user) {
        subscribers.add(user);
    }
    // Method to notify all subscribed users
    public void notify(String message) {
        subscribers.forEach(user -> System.out.println("Notification to " + user.getName() + ": " + message));
    }
}
