class Imovel {
    protected String endereco;
    protected double preco;
    public Imovel(String endereco, double preco) {
        this.endereco = endereco;
        this.preco = preco;
    }
    public String getEndereco() {
        return endereco;
    }
    public double getPreco() {
        return preco;
    }
    public void exibirInformacoes() {
        System.out.println("Endereço: " + endereco);
        System.out.println("Preço: R$ " + preco);
    }
}