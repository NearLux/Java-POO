package diasvividos;
import java.util.Scanner;

public class Dias {
    private int ano;
    private int mes;
    private int dia;
    private int anos;
    private int total;
    
    Scanner ler = new Scanner(System.in);
    
    public void lerData(){
        System.out.println("Qual o ano em que você nasceu ?\n");
        ano = ler.nextInt();
        System.out.println("Qual o mês em que você nasceu ?\n");
        mes = ler.nextInt();
        System.out.println("Qual o dia em que você nasceu ?\n");
        dia = ler.nextInt();
    }
    
    public void calcularDias(){
        anos = 2020 - ano;
        System.out.println("Sua idade é: " + anos + " anos;");
        anos *= 365;
        mes -= 1;
        mes *= 30;
        total = anos + mes + dia;
        System.out.println("Você ja viveu " + total + " dias");
        
        
        
        
        
        
        
    }
}
