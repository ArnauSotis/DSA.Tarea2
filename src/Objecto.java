public class Objecto {

    String Nombre;
    String Tipo;
    String Descripcion;
    int Valor;
    int Coste;

    public Objeto(String nombre, String tipo, String descripcion, int valor, int coste) {
        this.Nombre = nombre;
        this.Tipo = tipo;
        this.Descripcion = descripcion;
        this.Valor = valor;
        this.Coste = coste;

    }

    public double getNom() {

        return Nombre;
    }

    public void setNom(String Nom) {

        this.Nombre = Nom;
    }

    public double getTipo() {

        return Tipo;
    }

    public void setTipo(String Tip) {

        this.Tipo = Tip;
    }

    public double getDescripcion() {

        return Descripcion;
    }

    public void setDescripcion(String Des) {

        this.Descripcion = Des;
    }

    public double getValor() {

        return Valor;
    }

    public void setValor(int valor) {

        this.Valor = valor;
    }

    public double getCoste() {

        return Coste;
    }

    public void setCoste(int coste) {

        this.Coste = coste;
    }
}