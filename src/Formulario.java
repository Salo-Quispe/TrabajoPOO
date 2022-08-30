import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario extends JFrame implements ActionListener {

    private JMenuBar mb;
    private JMenu menu1, menu2, menu3, menu4, menu5;
    private JMenuItem abrir, salir, c1, c2, c3, c4, c5, c6, c7, c8, c9;

    public Formulario(){
        setLayout(null);
        mb=new JMenuBar();
        setJMenuBar(mb);
        menu1=new JMenu("Opciones");
        mb.add(menu1);
        menu2=new JMenu("Colores");
        mb.add(menu2);
        menu3 = new JMenu("Primarios");
        menu2.add(menu3);
        menu4 = new JMenu("Secundarios");
        menu3.add(menu4);
        menu5 = new JMenu("Terciarios");
        menu4.add(menu5);
        abrir = new JMenuItem("Abrir");
        menu1.add(abrir);
        salir= new JMenuItem("Salir");
        menu1.add(salir);
        c1 = new JMenuItem("Amarillo");
        menu3.add(c1);
        c2 = new JMenuItem("Azul");
        menu3.add(c2);
        c3 = new JMenuItem("Rojo");
        menu3.add(c3);
        c4 = new JMenuItem("Verde");
        menu4.add(c4);
        c5 = new JMenuItem("Naranja");
        menu4.add(c5);
        c6 = new JMenuItem("Purpura");
        menu4.add(c6);
        c7 = new JMenuItem("Turqueza");
        menu5.add(c7);
        c8 = new JMenuItem("Palo de rosa");
        menu5.add(c8);
        c9 = new JMenuItem("Cafe");
        menu5.add(c9);

        abrir.addActionListener(this);
        salir.addActionListener(this);
        c1.addActionListener(this);
        c2.addActionListener(this);
        c3.addActionListener(this);
        c4.addActionListener(this);
        c5.addActionListener(this);
        c6.addActionListener(this);
        c7.addActionListener(this);
        c8.addActionListener(this);
        c9.addActionListener(this);
    }

    public static void main(String[] args) {
        Formulario f = new Formulario();
        f.setBounds(300, 150, 640, 480);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Container c=getContentPane();
        if (e.getSource()==abrir){
            JOptionPane.showMessageDialog(null, "Si lo puedes imaginar, lo puedes programar  (￣ω￣●)");
        }
        if (e.getSource()==salir){
            setTitle("El programa se cerrara en 3 segundos");
            try{ Thread.sleep(3000);
                System.exit(0);
            } catch(Exception excep) { System.exit(0); }
        }
        if (e.getSource()==c1){
            c.setBackground(new Color(255,255,0));
        }
        if (e.getSource()==c2){
            c.setBackground(new Color(0,0,255));
        }
        if (e.getSource()==c3){
            c.setBackground(new Color(255,0,0));
        }
        if (e.getSource()==c4){
            c.setBackground(new Color(0,255,0));
        }
        if (e.getSource()==c5){
            c.setBackground(new Color(255,128,0));
        }
        if (e.getSource()==c6){
            c.setBackground(new Color(125,33,129));
        }
        if (e.getSource()==c7){
            c.setBackground(new Color(93,193,185));
        }
        if (e.getSource()==c8){
            c.setBackground(new Color(255,192,203));
        }
        if (e.getSource()==c9){
            c.setBackground(new Color(128,64,0));
        }
    }
}
