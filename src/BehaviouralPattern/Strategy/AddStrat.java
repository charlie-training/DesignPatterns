package BehaviouralPattern.Strategy;

public class AddStrat implements CalcStrat {

    @Override
    public int compute(int a, int b) {
        return a + b;
    }

}
