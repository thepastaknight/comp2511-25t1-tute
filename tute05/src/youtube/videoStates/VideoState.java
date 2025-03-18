package youtube.videoStates;

import youtube.Video;

public interface VideoState {
    public VideoState lock();

    public VideoState play();

    public VideoState next();
}
