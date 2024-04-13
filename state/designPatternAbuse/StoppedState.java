package state.designPatternAbuse;

public class StoppedState {
    private Stopwatch stopwatch;

    public StoppedState(Stopwatch stopwatch) {
        this.stopwatch = stopwatch;
    }

    public void click() {
        stopwatch.setState(new RunningState(stopwatch));
        System.out.println("Running");
    }

}
