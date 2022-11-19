package Patterns;

import java.util.ArrayList;

public class Celebrity implements Subject{
    private String celebrityName;
    private ArrayList<Observer> followers;

    public Celebrity(String celebrityName) {
        this.celebrityName = celebrityName;
        followers = new ArrayList<Observer>();
    }

    @Override
    public void addObserver(Observer observer) {
        followers.add(observer);
        System.out.println(observer + " has started following "
                + celebrityName);
    }

    @Override
    public void removeObserver(Observer observer) {
        followers.remove(observer);
        System.out.println(observer + " has stopped following "
                + celebrityName);
    }

    @Override
    public void notifyObservers(String post) {
        for(Observer follower: followers) {
            follower.update(celebrityName, post);
        }
    }

    public void post(String post) {
        System.out.println(celebrityName + "has posted: " + post);
        notifyObservers(post);
    }
}
