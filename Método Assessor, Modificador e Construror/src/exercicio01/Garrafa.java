package exercicio01;
public class Garrafa {
    //------------------------------------------------
    //Atributos
    private String cor;
    private String material;
    private String modelo;
    private boolean tampada;
    private boolean alca;
    //------------------------------------------------
    public Garrafa (String c, String mm, String m, boolean t, boolean a){ //Método contrutor
        this.cor = c;
        this.material = mm;
        this.modelo = m;
        this.tampada = t;
        this.alca = a;
    }
    //------------------------------------------------
    public String getModelo(){ //Método getter
        return this.modelo;
    }
    public void setModelo(String m){ //Método setter
        this.modelo = m;
    }
    //------------------------------------------------
    public String getMaterial(){ //Método getter
        return this.material;
    }
    public void setMaterial(String mm){ //Método setter
        this.material = mm;
    }
    //-------------------------------------------------
    public String getCor(){ //Método getter
        return this.cor;
    }
    public void setCor(String c){ // Método setter
        this.cor = c;
    }
    //-------------------------------------------------
    public boolean getTampada(){ // Método getter
        return this.tampada;
    }
    public void setTampada(boolean t){ // Método setter
        this.tampada = t;
    }
    //-------------------------------------------------
    public boolean getAlca(){ // Método getter
        return this.alca;
    }
    public void setAlca(boolean a){ // Método setter
        this.alca = a;
    }
    //--------------------------------------------------
    public void status(){ // Método normal
        System.out.println("SOBRE A GARRAFA: ");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cor: " + getCor());
        System.out.println("Tampada: " + getTampada());
        System.out.println("Com alça: " + getAlca());
    }
    
    
}
