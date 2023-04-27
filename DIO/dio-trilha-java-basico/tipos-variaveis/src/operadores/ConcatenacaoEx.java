package operadores;

public class ConcatenacaoEx {

    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM " + "JAVA";

        System.out.println(nomeCompleto);

        String Concatenacao = "?";

        System.out.println(Concatenacao);

        Concatenacao = 1 + 1 + 1 + "1";

        System.out.println(Concatenacao);

        Concatenacao = 1 + "1" + 1 + 1;

        System.out.println(Concatenacao);

        Concatenacao = 1 + "1" + 1 + "1";

        System.out.println(Concatenacao);

        Concatenacao = "1" + 1 + 1 + 1;

        System.out.println(Concatenacao);

        Concatenacao = "1" + (1 + 1 + 1);

        System.out.println(Concatenacao);

    }

}
