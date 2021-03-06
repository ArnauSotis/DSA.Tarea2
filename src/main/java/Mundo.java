import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Mundo {

   private List<Usuario> usuarioList = new ArrayList<Usuario>();

    public Mundo() {

    }

    public boolean crearUsuario(Usuario user) {
        int encontrado=0;
        for(int i=0; i<usuarioList.size();i++)
        {
            if (usuarioList.get(i)==user)
            encontrado=1;

        }

        if(encontrado==1)
            return false;
        else
        {
            usuarioList.add(user);
            return true;

        }

   }

    public boolean eliminarUsuario(String nombre) {

        for (int i = 0; i<usuarioList.size();i++) {
            if (usuarioList.get(i).getNom().equals(nombre)) {
                usuarioList.remove(i);
                return true;
            }

        }

        return false;

    }

    public Usuario consultarUsuario(String nombre) {
       int i=0;
       while(i<usuarioList.size())
        {
                if (usuarioList.get(i).getNom().equals(nombre)) {
                    return usuarioList.get(i);
                }
                i++;
        }
        return null;
    }

    public void añadirObjetoAUsuario(Usuario u, Objeto o){

            for(int i=0;i<usuarioList.size();i++)
            {
                if(usuarioList.get(i) == u)
                {
                   usuarioList.get(i).objetoList.add(o);
                }
            }
    }

    /*public <?> consultarObjetosDeUsuario(Usuario u){

        No queda claro como hacerlo, de todas formas, si sabes hacer los demás, este es fácil

    }*/

    public Objeto consultarObjetoDeUsuario(Usuario u, String nombreObjeto){

        for(int i=0;i<usuarioList.size();i++)
        {
            if(usuarioList.get(i)==u)
            {
                for(int j=0;j<usuarioList.get(i).objetoList.size();j++)
                    if(usuarioList.get(i).objetoList.get(j).getNombre().equals(nombreObjeto))
                    {
                        return usuarioList.get(i).objetoList.get(j);
                    }
            }


        }
            return null;
    }

    public boolean eliminarObjetosDeUsuario(Usuario u, String nombreObjeto){
        for(int i=0;i<usuarioList.size();i++)
        {
            if(usuarioList.get(i)==u)
            {
                for(int j=0;j<usuarioList.get(i).objetoList.size();j++) {
                    if(usuarioList.get(i).objetoList.get(j).getNombre().equals(nombreObjeto))
                    {
                        usuarioList.get(i).objetoList.remove(j);
                        return true;
                    }

                }
            }
        }
        return false;
    }

    public boolean transferirObjetoEntreUsuarios(Usuario origen, Usuario destino, Objeto o)
    {
        //he cambiado un void por el boolean para poder enviar un true o un false para ver si se ha transferido correctamente el objeto.
        int transf=0;
        for(int i=0;i<usuarioList.size();i++)
        {

            if(usuarioList.get(i)==origen)
            {
                for(int j=0;j<usuarioList.size();j++)
                {
                    if(usuarioList.get(j)==destino)
                    {
                        usuarioList.get(j).objetoList.add(o);
                        usuarioList.get(i).objetoList.remove(o);
                        transf=1;

                    }

                }

            }

        }
        if(transf==0)
            return false;
        else
            return true;


    }
}

