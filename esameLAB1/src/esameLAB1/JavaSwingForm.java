package esameLAB1;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class JavaSwingForm {
    private JFrame frame;
    private JTextField matricolaField;
    private JTextField cognomeField;
    private JTextField nomeField;
    private ArrayList<Studente> studenti;

    public void initialize() {
        frame = new JFrame("Java Swing Form");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel matricolaLabel = new JLabel("Matricola:");
        matricolaField = new JTextField();
        matricolaField.setSize(100, 30);
        
        JLabel cognomeLabel = new JLabel("Cognome:");
        cognomeField = new JTextField();
        cognomeField.setSize(1000, 30);
       
        JLabel nomeLabel = new JLabel("Nome:");
        nomeField = new JTextField();
        nomeField.setSize(100, 30);

        
        
        studenti = new ArrayList<>();

        JButton inserisciStudenteButton = new JButton("Inserisci studente");
        inserisciStudenteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int matricola = Integer.parseInt(matricolaField.getText());
                String cognome = cognomeField.getText();
                String nome = nomeField.getText();
                Studente studente = new Studente(matricola, cognome, nome);
                studenti.add(studente);
                matricolaField.setText("");
                cognomeField.setText("");
                nomeField.setText("");
            }
        });


        JButton stampaButton = new JButton("Stampa");
        stampaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent k) {
                for (Studente studente : studenti) {
                    studente.chiSono();
                }
            }
        });

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(matricolaLabel);
        frame.add(matricolaField);
        frame.add(cognomeLabel);
        frame.add(cognomeField);
        frame.add(nomeLabel);
        frame.add(nomeField);
        frame.add(inserisciStudenteButton);
        frame.add(stampaButton);
        
        frame.setVisible(true);
    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        try {
            JavaSwingForm window = new JavaSwingForm();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Create the application.
     */
    public JavaSwingForm() {
        initialize();
    }
}
