public class Ex004 {
    public static void execute(){
        double n1 = Prompt.lerDecimal("Digite o primeiro número: ");
        double n2 = Prompt.lerDecimal("Digite o segundo número: ");

        Prompt.imprimir(n1 + " + " + n2 + " = " + (n1 + n2));

        Prompt.imprimir(n1 + " - " + n2 + " = " + (n1 - n2));

        Prompt.imprimir(n1 + " * " + n2 + " = " + (n1 * n2));

        Prompt.imprimir(n1 + " / " + n2 + " = " + (n1 / n2));

    }
}
