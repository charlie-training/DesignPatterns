package BehaviouralPattern.Strategy;

public class Strategy {
    CalcStrat calc;

    public Strategy(CalcStrat calc) {
        this.calc = calc;
    }

    public int doTask(int a, int b) {
        return calc.compute(a, b);
    }
}
