public class Usuario {

    String Nombre;
    String Password;
    int Vida;
    int Ataque;
    int Defensa;
    int Resistencia;



    public Usuario(String nombre, String password,int vida, int ataque, int defensa, int resistencia){
        this.Nombre = nombre;
        this.Password = password;
        this.Vida = vida;
        this.Ataque = ataque;
        this.Defensa = defensa;
        this.Resistencia = resistencia;
    }



    public double getNom() {

        return Nombre;
    }

    public void setNom(String Nom) {

        this.Nombre = Nom;
    }

    public double getPass() {

        return Password;
    }

    public void setPass(String Pass) {

        this.Password = Pass;
    }

    public double getVida() {

        return Vida;
    }

    public void setVida(int vida) {

        this.Vida = vida;
    }

    public double getAtaque() {

        return Ataque;
    }

    public void setAtaque(int atac) {

        this.Ataque = atac;
    }

    public double getDefensa() {

        return Defensa;
    }

    public void setDefensa(int Defen) {

        this.Defensa = Defen;
    }

    public double getResistencia() {

        return Resistencia;
    }

    public void setResistencia(int Resis) {

        this.Resistencia = Resis;
    }

}

