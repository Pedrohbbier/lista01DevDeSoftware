public class Ex002 {
    public static void execute(){
        double n1 = Prompt.lerDecimal("Digite o primeiro número: ");
        double n2 = Prompt.lerDecimal("Digite o segundo número: ");

        double soma = n1 + n2;

        Prompt.imprimir("Soma: " + soma);
    }
}
