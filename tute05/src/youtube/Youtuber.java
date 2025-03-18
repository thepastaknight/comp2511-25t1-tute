package youtube;

import java.util.ArrayList;
import java.util.List;

public class Youtuber extends User {
    private List<Video> videos = new ArrayList<>();
    private List<User> subscribers = new ArrayList<>();

    public void post(Video video) {
        videos.add(video);
        subscribers.forEach(s -> s.notify(video));
    }

    public void addSubscriber(User user) {
        subscribers.add(user);
    }

    public static void main(String[] args) {
        Youtuber y = new Youtuber();
        User u1 = new User();
        User u2 = new User();
        y.addSubscriber(u1);
        y.addSubscriber(u2);
        y.post(new Video("this is a title"));
    }
}
