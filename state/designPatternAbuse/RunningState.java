package state.designPatternAbuse;

public class RunningState implements State{
    private Stopwatch stopwatch;

    public RunningState(Stopwatch stopwatch) {
        this.stopwatch = stopwatch;
    }

    public void click() {
        stopwatch.setState(new StoppedState(stopwatch));
        System.out.println("Stopped");
    }

}
