package main;

public class Samsung implements LojaMobile{
    private String modeloSamsung;
    private float preco;

    @Override
    public String modelo() {
        return this.modeloSamsung;
    }

    @Override
    public float preco() {
        return this.preco;
    }
    
}
