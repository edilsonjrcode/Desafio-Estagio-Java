package Atividade2.Main;

import Atividade2.Classe.Media;

public class Main {

    public static void main(String[] args) {
        Media media1 = new Media();

        int media456 = media1.media(media1.getQuatro(), media1.getCinco(), media1.getSeis());
        int media789 = media1.media(media1.getSete(), media1.getOito(), media1.getNove());

        System.out.println("Média dos números 4,5 e 6 = " + media456);
        System.out.println("Média dos números 7,8 e 9 = " + media789);

        System.out.println("A soma das duas médias é = " + media1.somaMedia(media456, media789));
        System.out.println("A média das médias é: " + media1.mediaDaMedia(media456, media789));

    }
}
