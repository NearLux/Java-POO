
package clinicaveterinaria;

public class ClinicaVeterinaria {

    public static void main(String[] args) {
        Consulta p1 = new Consulta();
        p1.marcarConsulta("----------", "------------", "-------------", "----------", "-------");
        p1.renovarCadastro("----------", "---------", "---------", "--------");
        p1.setDataDaConsulta("---------");
        p1.exibirCadastro();
        
    }
    
}
