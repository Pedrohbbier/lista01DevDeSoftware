public class Ex008 {
    public static void execute(){
        double n = Prompt.lerDecimal("Digite um número");

        if(n >= 50){
            Prompt.imprimir("Número maior ou igual a 50");
        } else {
            Prompt.imprimir("Número menor ou igual a 50");
        }
    }
}
