
public class Main {
    public static void main(String[] args) {
        Imovel ImovelPadrao = new Imovel("Rua Osasco, 123", 250000);
        NovoImovel novoImovel = new NovoImovel("Rua Carapicuíba, 456", 300000, 50000);
        VelhoImovel velhoImovel = new VelhoImovel("Rua Cotia, 789", 200000, 30000);
        System.out.println("== Imóvel Padrão ==");
        ImovelPadrao.exibirInformacoes();
        System.out.println("\n== Novo Imóvel ==");
        novoImovel.exibirInformacoes();
        System.out.println("\n== Velho Imóvel ==");
        velhoImovel.exibirInformacoes();
    }
}