public class Main {
    public static void main(String[] args) {
        Forma circulo = new Circulo("Vermelho", 5);
        Forma quadrado = new Quadrado("Azul", 4);
        Forma retangulo = new Retangulo("Verde", 6, 3);
        Forma triangulo = new Triangulo("Amarelo", 8, 4);
        System.out.println("Círculo - Cor: " + circulo.getCor() + ", Área: " + circulo.calcularArea());
        System.out.println("Quadrado - Cor: " + quadrado.getCor() + ", Área: " + quadrado.calcularArea());
        System.out.println("Retângulo - Cor: " + retangulo.getCor() + ", Área: " + retangulo.calcularArea());
        System.out.println("Triângulo - Cor: " + triangulo.getCor() + ", Área: " + triangulo.calcularArea());
    }
}
