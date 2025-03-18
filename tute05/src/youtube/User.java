package youtube;

public class User {
    private String name;

    public void subscribe(Youtuber youtuber) {
        youtuber.addSubscriber(this);
    }

    public void notify(Video video) {
        System.out.println("Watching " + video.getTitle());
    }
}
