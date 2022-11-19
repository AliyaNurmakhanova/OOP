package Patterns;

public class Follower implements Observer{
    private String followerName;

    public Follower(String followerName) {
        this.followerName = followerName;
    }

    @Override
    public void update(String celebrityName, String post) {
        System.out.println(followerName + " has received "
                + celebrityName + "'s post: " + post);
    }

    @Override
    public String toString() {
        return followerName;
    }
}
