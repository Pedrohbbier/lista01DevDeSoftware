public class Ex001{
    public static void execute(){

        double n = Prompt.lerDecimal("Digite um número: ");

        if(n > 10){
            Prompt.imprimir("Número maior do que 10!");
        } else {
            Prompt.imprimir("Número menor ou igual a 10!");
        }

    }
}