package youtube.videoStates;

public class LockedState implements VideoState {
    private VideoState previousState;

    public LockedState(VideoState videoState) {
        this.previousState = videoState;
    }

    @Override
    public VideoState lock() {
        return previousState;
    }

    @Override
    public VideoState play() {
        throw new UnsupportedOperationException("Unimplemented method 'play'");
    }

    @Override
    public VideoState next() {
        throw new UnsupportedOperationException("Unimplemented method 'next'");
    }

}
