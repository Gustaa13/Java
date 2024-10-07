class Carro{
    private int qt_rodas;
    private int qt_portas;
    private float velocidade;
    private String marca;
    private String nome;
    private Boolean ligado = false;

    Carro(){}

    Carro(int qt_rodas, int qt_portas, float velocidade, String marca, String nome){
        this.qt_rodas = qt_rodas;
        this.qt_portas = qt_portas;
        this.velocidade = velocidade;
        this.marca = marca;
        this.nome = nome;
    }

    int getRodas(){
        return qt_rodas;
    }

    int getPortas(){
        return qt_portas;
    }

    float getVelocidade(){
        return velocidade;
    }

    String getMarca(){
        return marca;
    }

    String getNome(){
        return nome;
    }

    boolean getLigado(){
        return ligado;
    }

    boolean ligar(){
        System.out.println("O carro está ligando...");
        return ligado = true;
    }
}

class PrimeiraClasse {
    public static void main(String[] args){
        Carro uno = new Carro(4, 4, 200, "Fiat", "Uno");

        System.out.println("O carro ligou? " + uno.getLigado());
        
        uno.ligar();

        System.out.println("O carro ligou? " + uno.getLigado());
        System.out.println("Marca e nome do carro: " + uno.getMarca() + " " + uno.getNome());
        System.out.println("Velocidade do carro: " + uno.getVelocidade());
    }

}



