package esameLAB1;

public class Studente {
    private int matricola;
    private String cognome;
    private String nome;
  

    public Studente(int matricola, String cognome, String nome) {
        this.matricola = matricola;
        this.cognome = cognome;
        this.nome = nome;
        
    }

    public void chiSono() {
    
        System.out.println("Cognome: " + cognome );
        System.out.println("Nome: " + nome );
        System.out.println("Qualifica: " + "STUDENTE" );
        System.out.println("Matricola: " + matricola );
        System.out.println("");
    }
}