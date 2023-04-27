public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("A tv está: " + (smartTv.ligada ? "ligada" : "desligada"));
        System.out.println("A tv está no canal: " + smartTv.canal);
        System.out.println("A tv está com o volume: " + smartTv.volume);

        smartTv.ligar();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.mudarCanal(13);

        System.out.println("Novo estado:");

        System.out.println("A tv está: " + (smartTv.ligada ? "ligada" : "desligada"));
        System.out.println("A tv está no canal: " + smartTv.canal);
        System.out.println("A tv está com o volume: " + smartTv.volume);

        smartTv.desligar();

        System.out.println("Novo estado:");

        System.out.println("A tv está: " + (smartTv.ligada ? "ligada" : "desligada"));
        System.out.println("A tv está no canal: " + smartTv.canal);
        System.out.println("A tv está com o volume: " + smartTv.volume);

    }
}
