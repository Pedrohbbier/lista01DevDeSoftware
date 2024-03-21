public class Ex013 {
    public static void execute(){
        double n1 = Prompt.lerDecimal("Digite o primeiro número: ");
        double n2 = Prompt.lerDecimal("Digite o segundo número: ");
        String op = Prompt.lerLinha("Digite a operação desejada (+, -, *, /): ");

        if(op.equals("+")){
            Prompt.imprimir("A soma é: " + (n1 + n2));
        } else if(op.equals("-")){
            Prompt.imprimir("A subtração é: " + (n1 - n2));
        } else if(op.equals("*")){
            Prompt.imprimir("A multiplicação é: " + (n1 * n2));
        } else if(op.equals("/")){
            if(n2 == 0){
                Prompt.imprimir("Não é possível dividir por zero");
            } else {
                Prompt.imprimir("A divisão é: " + (n1 / n2));
            }
        } else {
            Prompt.imprimir("Operação inválida");
        }
    }
}
