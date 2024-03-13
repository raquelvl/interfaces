package interfaces.figuras;

import java.util.Scanner;

public class MainFiguras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RepositorioDeFiguras figuras = new RepositorioDeFiguras();
        int opcao;

        do {
            imprimeMenu();
            opcao = recebeInteiro(sc);
            switch (opcao) {
                case 1:
                    adicionaCirculo(figuras);
                    break;
                case 2:
                    adicionaQuadrado(figuras);
                    break;
                case 3:
                    adicionaRetangulo(figuras);
                    break;
            }
        } while(opcao == 1 || opcao == 2 || opcao == 3);

        descreveFiguras(figuras);
    }

    private static void descreveFiguras(RepositorioDeFiguras figuras) {
        for (FiguraGeometrica2D figura : figuras) {
            System.out.println(figura.descricao());
            System.out.println("Perimetro: " + figura.calculaPerimetro());
            System.out.println("Area: " + figura.calculaArea());
        }
    }

    private static int recebeInteiro(Scanner sc) {
        return Integer.parseInt(sc.nextLine());
    }

    private static void imprimeMenu() {
        System.out.println("1 - para inserir um circulo");
        System.out.println("2 - para inserir um quadrado");
        System.out.println("3 - para inserir um retangulo");
        System.out.println("4 - para sair");
    }

}
