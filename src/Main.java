import java.util.Scanner;

public class Main {

    public static Mundo mun = new Mundo();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("QUE QUIERES HACER?:");
            System.out.println("1 : Crear Usuario");
            System.out.println("2 : Eliminar Usuario");
            System.out.println("3 : Consultar Usuario");
            System.out.println("4 : Añadir objeto a un Usuario");
            System.out.println("5 : Consultar Objeto de un Usuario");
            System.out.println("6 : Eliminar Objetos de un Usuario");
            System.out.println("7 : Tranferir un Objeto entre Usuarios");
            System.out.println("0 : Salir de la Aplicación");

            String input = scan.nextLine();
            int choice = 0;
            try {
                choice = Integer.parseInt(input);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                choice = -1;
            }
            switch (choice) {
                case -1: {
                    System.out.println("Numero inválido");
                    break;
                }
                case 0: {
                    return;
                }
                case 1: {
                    System.out.print("Nombre: ");
                    String nombre = scan.nextLine();
                    System.out.print("Password: ");
                    String passwordd = scan.nextLine();
                    int Vida = 0;
                    int ataque = 0;
                    int defensa = 0;
                    int resistencia= 0;
                    while (true) {
                        try {
                            System.out.print("Vida: ");
                            String vid = scan.nextLine();
                            Vida = Integer.parseInt(vid);
                            System.out.print("Ataque: ");
                            String atac = scan.nextLine();
                            ataque = Integer.parseInt(atac);
                            System.out.print("Defensa: ");
                            String defens = scan.nextLine();
                            defensa = Integer.parseInt(defens);
                            System.out.print("Resistencia: ");
                            String resis = scan.nextLine();
                            resistencia = Integer.parseInt(resis);
                            break;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    Usuario u = new Usuario(nombre, passwordd, Vida, ataque, defensa, resistencia);
                    if (mun.crearUsuario(u) != false)
                        System.out.println("Usuario añadido.");
                    else
                        System.out.println("Usuario con nombre " + nombre + " ya existe.");
                    break;
                }
                case 2: {
                    System.out.print("Nombre de usuario que desea eliminar eliminar: ");
                    String nombre = scan.nextLine();
                    if(mun.eliminarUsuario(nombre) == true)
                        System.out.println("Usuario eliminado");
                    else
                        System.out.println("El usuario que desea eliminar no existe");
                    break;
                }
                case 3:{
                    System.out.print("Nombre de usuario a consultar: ");
                    String nombre = scan.nextLine();
                    Usuario u = mun.consultarUsuario(nombre);
                    if(u == null){
                        System.out.println("Usuario no existente");
                        break;
                    }
                    System.out.println(u.toString());
                }
                case 4:{
                    System.out.print("Nombre de usuario a añadir el objeto: ");
                    String nombre = scan.nextLine();
                    Usuario u = mun.consultarUsuario(nombre);
                    if(u == null){
                        System.out.println("Usuario no existente");
                        break;
                    }
                    System.out.print("Objeto que desea añadir");
                    String objeto =scan.nextLine();
                    String Tipo;
                    String Descripcion;
                    int valor;
                    int coste;

                    System.out.print("Tipo: ");
                    Tipo = scan.nextLine();
                    System.out.print("Descripcion: ");
                    Descripcion = scan.nextLine();
                    System.out.print("Valor: ");
                    String val = scan.nextLine();
                    valor = Integer.parseInt(val);
                    System.out.print("Coste: ");
                    String cost = scan.nextLine();
                    coste = Integer.parseInt(cost);
                    Objeto o=new Objeto(objeto, Tipo, Descripcion, valor, coste);

                    mun.añadirObjetoAUsuario( u, o);
                        System.out.println("Realizado con exito");
                        break;

            }
        }
    }
}
}