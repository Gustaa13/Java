package DAO;

import java.util.ArrayList;
import model.*;

public class BibliotecaDAO{

    ArrayList<Material> material;

    private static BibliotecaDAO banco;

    private BibliotecaDAO(){
        material = new ArrayList<>();
    }

    public static BibliotecaDAO getInstance(){
        if(banco == null){
            banco = new BibliotecaDAO();
        }
        return banco;
    }

    public ArrayList<Material> getArMateriais(){
        return material;
    }
}

//Escreva aqui todo o código