package BehaviouralPattern.Strategy;

public class Runner {

    public static void main (String[] args) {
        Strategy context = new Strategy(new AddStrat());
        System.out.println(context.doTask(1, 2));

    }
}
