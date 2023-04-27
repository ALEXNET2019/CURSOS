package operadores;

public class OperadoresRelacionais {
    public static void main(String[] args) {

        String nomeUm = "Alex";
        String nomeDois = new String("Alex");

        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("Numero um é igual a numero dois ? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("Numero um é diferente a numero dois ? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("Numero um é maior a numero dois ? " + simNao);

        simNao = numero1 < numero2;

        System.out.println("Numero um é menor a numero dois ? " + simNao);

        simNao = numero1 <= numero2;

        System.out.println("Numero um é menor ou igual a numero dois ? " + simNao);

        simNao = numero1 >= numero2;

        System.out.println("Numero um é maior ou igual a numero dois ? " + simNao);
    }
}
