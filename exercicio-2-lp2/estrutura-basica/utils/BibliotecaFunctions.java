package utils;

import model.*;
import DAO.BibliotecaDAO;

public abstract class BibliotecaFunctions {

    private static BibliotecaDAO banco = BibliotecaDAO.getInstance();

    public static void pesquisarMaterial(String titulo){

        Material mt = buscaPorNome(titulo);
        if(Isnull(mt)) return;
        mt.exibirDetalhes();
    }

    public static void exibirListaMateriais(){
        for(Material mt : banco.getArMateriais()){
            mt.exibirDetalhes();
        }
    }

    public static void cadastarMaterial(String titulo, String autor, int anoLancamento, String edicao){
        Livro livro = new Livro(titulo, autor, anoLancamento, edicao);
        banco.getArMateriais().add(livro);
    }

    public static void cadastarMaterial(String titulo, String editora, int numeroPaginas){
        Revista revista = new Revista(titulo, editora, numeroPaginas);
        banco.getArMateriais().add(revista);
    }

    public static void removerMaterial(String titulo){
        Material mt = buscaPorNome(titulo);
        if(Isnull(mt)) return;
        banco.getArMateriais().remove(mt);
    }

    private static Material buscaPorNome(String titulo){
        
        for(Material mt : banco.getArMateriais()){
            if(mt instanceof Revista){
                Revista rv = (Revista) mt;
                if(rv.getTitulo() == titulo){
                    return rv;
                }
            }else{
                Livro lv = (Livro) mt;
                if(lv.getTitulo() == titulo){
                    return lv;
                }
            }
        }

        return null;
    }

    private static Boolean Isnull(Material mt){
        if(mt == null){
            System.out.println("Material não existe!");
            return true;
        }
        return false;
    }
} 
