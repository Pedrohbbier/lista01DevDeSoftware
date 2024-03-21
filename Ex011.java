public class Ex011 {
    public static void execute(){
        int a = Prompt.lerInteiro("Digite o primeiro número: ");
        int b = Prompt.lerInteiro("Digite o segundo número: ");
        int c = Prompt.lerInteiro("Digite o terceiro número: ");

        int toChange;
        if (a > b) {
            toChange = a;
            a = b;
            b = toChange;
        }

        if (b > c) {
            toChange = b;
            b = c;
            c = toChange;
        }

        if (a > b) {
            toChange = a;
            a = b;
            b = toChange;
        }

        System.out.println("Os números em ordem crescente são:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    
}
