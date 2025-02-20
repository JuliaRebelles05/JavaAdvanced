abstract class Forma {
    protected String cor;
    public Forma(String cor) {
        this.cor = cor;
    }
    public abstract double calcularArea();
    public String getCor() {
        return cor;
    }
}

