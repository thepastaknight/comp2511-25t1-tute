package youtube;

import youtube.videoStates.VideoState;
import youtube.videoStates.ReadyState;

public class Video {
    private String title;
    private VideoState state = new ReadyState();

    public Video(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void play() {
        state = state.play();
    };

    public void next() {
        state = state.next();
    }

    public void lock() {
        state = state.lock();
    }

}
