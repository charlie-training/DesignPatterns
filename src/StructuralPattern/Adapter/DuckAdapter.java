package StructuralPattern.Adapter;

public class DuckAdapter extends WildTurkey {
    private final Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

}
