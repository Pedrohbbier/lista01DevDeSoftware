public class Ex007 {
    public static void execute(){
        double n = Prompt.lerDecimal("Digite um número: ");
        if(n >= 100 && n <= 200){
            Prompt.imprimir("Está no intervalo entre 100 e 200");
        } else {
            Prompt.imprimir("Não está no intervalo entre 100 e 200");
        }
    }
}
