package StreamAPIprod.Worker;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}