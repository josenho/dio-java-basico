public class OperadoresRelacionais {
    public static void main(String[] args){
        String nome1 = "JOSÉ";
        String nome2 = new String("JOSÉ");

        System.out.println(nome1.equals(nome2));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println(numero1 + " é igual a " + numero2 + "? " + simNao);

        simNao = numero1 != numero2;
        System.out.println(numero1 + " é igual a " + numero2 + "? " + simNao);

        simNao = numero1 > numero2;
        System.out.println(numero1 + " é igual a " + numero2 + "? " + simNao);
    }
}
