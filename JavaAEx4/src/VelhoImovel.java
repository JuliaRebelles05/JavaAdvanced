class VelhoImovel extends Imovel {
    private double descontoPreco;
    public VelhoImovel(String endereco, double preco, double descontoPreco) {
        super(endereco, preco);
        this.descontoPreco = descontoPreco;
    }
    public double getPrecoFinal() {
        return preco - descontoPreco;
    }
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Desconto no preço: R$ " + descontoPreco);
        System.out.println("Preço final: R$ " + getPrecoFinal());
    }
}