public class Usuario {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        SmartTv smartTv = new SmartTv();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println(" Canal atual:" + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println(" Canal atual:" + smartTv.canal);

        System.out.println("Volume Atual : " + smartTv.volume);

        

        System.out.println("TV ligada ? " + smartTv.ligada);
       
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> Tv ligada ? " + smartTv.ligada);


        
        smartTv.desligar();
        System.out.println("Novo Status -> Tv ligada ? " + smartTv.ligada);





    }
}
