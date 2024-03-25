public class Ex014 {
    public static void execute(){
        double a1 = Prompt.lerDecimal("Digite o primeiro termo (a1): ");

        double n =Prompt.lerDecimal("Digite o número do termo a ser encontrado (n)");

        double r = Prompt.lerDecimal("Digite o valor da razão (r): ");

        double an = a1 + (n - 1) * r;

        Prompt.imprimir("O " + n + "-ésimo termo da progressão aritmética é: " + an);

    }
}
