package main;

public class Xiomi implements LojaMobile{
    private String modeloXiomi;
    private float preco;

    @Override
    public String modelo() {
        return this.modeloXiomi;
    }

    @Override
    public float preco() {
        return this.preco;
    }
}
