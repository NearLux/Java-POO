package pkg99.cervejas;
public class Cervejas {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "garrafas";
        
        while (beerNum > 0) {
            
            if (beerNum == 1) {
                word = "garrafa";
            }
            System.out.println(beerNum + " " + word + " de cerveja na parede.");
            System.out.println(beerNum + " " + word + " de cerveja.");
            System.out.println("Derrubar uma.");
            System.out.println("Passe por ai.");
            beerNum = beerNum  -1;
            
            if (beerNum == 0) {
                System.out.println("Não há mais garrafas de cerveja na parede.");
            }
        }
    }
    
}
