public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv SmartTv = new SmartTv ();


         SmartTv.diminuirVolume();
         SmartTv.diminuirVolume();
         SmartTv.diminuirVolume();
         SmartTv.aumentarVolume();
         System.out.println("Volume Atual : " + SmartTv.volume);


        System.out.println("TV Ligada ? " + SmartTv.ligada);
        System.out.println("Volume atual : " + SmartTv.volume);

        System.out.println("Canal Atual :" + SmartTv.canal);
        SmartTv.mudarCanal(14);
        System.out.println("Canal Atual :" + SmartTv.canal);

        SmartTv.ligar ();
        System.out.println("Novo status -> TV Ligada ? " + SmartTv.ligada);

        SmartTv.desligar();
        System.out.println("Novo status -> TV Ligada ? " + SmartTv.ligada);


        System.out.println("Canal Atual :" + SmartTv.canal);
        SmartTv.mudarCanal(14);
        System.out.println("Canal Atual :" + SmartTv.canal);
    }
}
