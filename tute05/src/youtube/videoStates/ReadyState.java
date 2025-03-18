package youtube.videoStates;

public class ReadyState implements VideoState {

    @Override
    public VideoState lock() {
        return new LockedState(this);
    }

    @Override
    public VideoState play() {
        return new PlayingState();
    }

    @Override
    public VideoState next() {
        return new ReadyState();
    }

}
