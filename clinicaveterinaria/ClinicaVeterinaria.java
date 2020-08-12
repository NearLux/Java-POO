
package clinicaveterinaria;

public class ClinicaVeterinaria {

    public static void main(String[] args) {
        Consulta p1 = new Consulta();
        p1.marcarConsulta("12/08/2020", "Armando Luz", "000000000-00", "Gato", "Desconhecido");
        p1.exibirCadastro();
        p1.setMedico("Luiz");
        p1.sessao("Pata quebrada.", "Sem exames por enquanto.");
        p1.exibirConsulta();
        
        
        
        
    }
    
}
