package BridgePattern.ex2;

public abstract class Exercise {
    private ExerciseHandler exerciseHandler;

    public Exercise(ExerciseHandler exerciseHandler) {
        this.exerciseHandler = exerciseHandler;
    }

    public void warmUp() {
        exerciseHandler.warmUp();
    }

    public void exercise() {
        exerciseHandler.exercise();
    }

    public void coolDown() {
        exerciseHandler.coolDown();
    }

    public abstract void start();
}
