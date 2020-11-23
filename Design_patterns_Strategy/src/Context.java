
class Context {
    private final strategy strategy;

    public Context(strategy strategy) {
        this.strategy = strategy;
    }

    public void arrange(int[] input) {
        strategy.sort(input);
    }
}

