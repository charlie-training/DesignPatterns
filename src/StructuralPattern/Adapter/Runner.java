package StructuralPattern.Adapter;

public class Runner {

    public static void main (String[] args) {
        Duck duck1 = new Mallard();
        DuckAdapter duckadapter1 = new DuckAdapter(duck1);

        duckadapter1.gobble();
    }
}
