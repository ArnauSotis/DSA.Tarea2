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
        int encontrado = 0;

        for (int i = 0; i<usuarioList.size();i++)
        {
            if(usuarioList.get(i).getNom()==nombre)
            {
                usuarioList.remove(i);
                encontrado=1;
            }


        }
        if(encontrado==0)
            return false;
        else
            return true;
    }

    public Usuario consultarUsuario(String nombre){
       int encontrado=0;
       int i=0;
       while(i<usuarioList.size()&&encontrado==0)
        {
                if (usuarioList.get(i).getNom() == nombre) {
                    encontrado=1;
                }
                i++;
        }
        if (encontrado==0)
            return null;
        else
            return usuarioList.get(i);

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
                    if(usuarioList.get(i).objetoList.get(j).getNombre()==nombreObjeto)
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
                    if(usuarioList.get(i).objetoList.get(j).getNombre()==nombreObjeto)
                    {
                        usuarioList.get(i).objetoList.remove(j);
                        return true;
                    }

                }
            }
        }
        return false;
    }

    public void transferirObjetoEntreUsuarios(Usuario origen, Usuario destino, Objeto o)
    {
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

                    }

                }

            }

        }


    }
}

