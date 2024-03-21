public class Ex009 {
    public static void execute(){

        double n1 = Prompt.lerDecimal("Digite o número 1: ");
        double n2 = Prompt.lerDecimal("Digite o número 2: ");

        if(n1 == n2){
            Prompt.imprimir(n1 + " e " + n2 + " são iguais");
        } else {
            Prompt.imprimir("São diferentes");
            if(n1 > n2 ){
                Prompt.imprimir(n1 + " é maior que " + n2);
            } else {
                Prompt.imprimir(n2 + " é maior que " + n1);
            }
        }

    }
}
