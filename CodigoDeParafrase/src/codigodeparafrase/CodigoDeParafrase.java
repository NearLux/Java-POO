package codigodeparafrase;
public class CodigoDeParafrase {
    public static void main(String[] args) {
        String[] wordListOne = {
            "24/7", "chamadas","20.000 pés"," BeeTooBeeToo", "Todo mundo vai perder","não acho que quem ganhar",
            "ou quem perder","nem quem ganhar", "nem perder","vai ganhar", "ou perder","vai todo mundo perder"
        };
        
        String[] wordListTwo = {
          "habilitado","vai dar ruim","centro","garota do papai","ken", "te perguntou",
            "101", "pinto"
        };
        
        String[] wordListThree = {
            "processo", "vila","troca","tapa","portal","viagem","nú", "tempo", "é muito", "é massa", "hehahaheheheaaa"
        };
        
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
        
        String frase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        
        System.out.println("Precisamos de " + frase);
    }
    
}
