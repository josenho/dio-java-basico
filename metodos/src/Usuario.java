public class Usuario {
    public static void main(String[] args) throws Exception{

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);

        smartTv.ligar();
        System.out.println("Novo Status -> Tv ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.println("Em qual canal: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Em qual canal: " + smartTv.canal);
    }
}
