class NovoImovel extends Imovel {
    private double adicionalPreco;
    public NovoImovel(String endereco, double preco, double adicionalPreco) {
        super(endereco, preco);
        this.adicionalPreco = adicionalPreco;
    }
    public double getPrecoFinal() {
        return preco + adicionalPreco;
    }
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Adicional no preço: R$ " + adicionalPreco);
        System.out.println("Preço final: R$ " + getPrecoFinal());
    }
}