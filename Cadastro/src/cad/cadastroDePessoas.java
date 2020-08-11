package cad;

public class cadastroDePessoas {

    public static void main(String[] args) {
        cadastro p1 = new cadastro();
        p1.adicionarPessoa("Armando", 18, "04/06/2002", 1.70f, "888888-1","999999999-99");
        p1.perfil();
        p1.atualizarCadastro("Armando Luz Borges", 18, "04/Jun/2002", 1.70f, "444444-2", "098765432-10");
        p1.perfil();
    }
    
    
}

