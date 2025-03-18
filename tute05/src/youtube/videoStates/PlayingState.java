package youtube.videoStates;

public class PlayingState implements VideoState {
    @Override
    public VideoState lock() {
        return new LockedState(this);
    }

    @Override
    public VideoState play() {
        return new ReadyState();
    }

    @Override
    public VideoState next() {
        return new ReadyState();
    }
}
