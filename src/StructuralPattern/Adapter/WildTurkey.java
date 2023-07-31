package StructuralPattern.Adapter;

public class WildTurkey implements Turkey {

    @Override
    public void gobble(){
        System.out.println("gobblé");
    }

    @Override
    public void fly(){
        System.out.println("i am doing a sm0l fly, because i'm bige");
    }
}
