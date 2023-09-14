import java.util.Scanner;

public class CarregamentoDireto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a média do aluno (0 a 10): ");
        double media = scanner.nextDouble();
        
        int indiceConselho;

        switch ((int) media) {
            case 0:
            case 1:
            case 2:
                indiceConselho = 0;
                break;
            case 3:
            case 4:
                indiceConselho = 1;
                break;
            default:
                indiceConselho = 2;
                break;
        }

        String resultado;
        switch (indiceConselho) {
            case 0:
                resultado = "Reprovado";
                break;
            case 1:
                resultado = "Aprovado pelo Conselho";
                break;
            default:
                resultado = "Aprovado";
                break;
        }

        System.out.println("Índice do conselho: " + indiceConselho);
        System.out.println("Resultado: " + resultado);
    }
}
