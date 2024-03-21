public class Ex003 {
    public static void execute(){
        int n1 = Prompt.lerInteiro("Digite o primeiro número: ");
        int n2 = Prompt.lerInteiro("Digite o segundo número: ");
        if(n1 > n2)
        {
            Prompt.imprimir(n1 + " é maior que " + n2);
        } else if (n2 > n1){
            Prompt.imprimir(n2 + " é maior que " + n1);
        } else {
            Prompt.imprimir("Números inválidos, não podem ser iguais!");
        }
     }
}
