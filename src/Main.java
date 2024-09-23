import java.util.Scanner;

/**
 * Programa que lê quatro notas do usuário, calcula a média
 * e exibe a situação do aluno com base na média.
 * <p>
 * Autor: Lucas Jardim
 */
public class Main {

    /**
     * O método principal do programa. Lê quatro notas inseridas pelo usuário,
     * calcula a média e imprime o resultado indicando se o aluno foi aprovado,
     * está em recuperação ou foi reprovado.
     *
     * @param args Argumentos de linha de comando (não utilizados neste programa).
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] notas = new int[4];
        int soma = 0;
        int media;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = s.nextInt();
            soma += notas[i];
        }

        media = soma / notas.length;

        if (media >= 7) {
            System.out.println("Sua nota é: " + media + "\nAPROVADO");
        } else if (media >= 5) {
            System.out.println("Sua nota é: " + media + "\nEM RECUPERAÇÃO");
        } else {
            System.out.println("Sua nota é: " + media + "\nREPROVADO");
        }
    }
}
