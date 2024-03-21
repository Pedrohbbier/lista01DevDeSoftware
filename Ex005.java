public class Ex005 {
    public static void execute(){
        double a = Prompt.lerDecimal("Digite valor de a : ");
        double b = Prompt.lerDecimal("Digite o valor de b: ");

        double aChange = a;
        double bChange = b;
        a = b;
        b = aChange;


        Prompt.imprimir("Valor de a antes da inversão: " + aChange);
        Prompt.imprimir("Valor de a depois da inversão: " + a);
        Prompt.imprimir("Valor de b antes da inversão: " + bChange);
        Prompt.imprimir("Valor de b depois da inversão: " + b);

    }
}
