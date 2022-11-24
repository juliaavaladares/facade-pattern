package main;

public class Iphone implements LojaMobile{
    private String modeloIphone;
    private float preco;
    
    @Override
    public String modelo() {
        return this.modeloIphone;       
    }

    @Override
    public float preco() {
        return this.preco;
    }
    
}
