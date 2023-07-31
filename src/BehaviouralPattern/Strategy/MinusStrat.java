package BehaviouralPattern.Strategy;

public class MinusStrat implements CalcStrat{

    @Override
    public int compute(int a, int b) {
        return a - b;
    }
}
