import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 19.05.2022
 * @author 
 */

public class Trollgame extends JFrame {
  // Anfang Attribute
  private JButton jButton1 = new JButton();
  private Random rd = new Random();
  int height;
  int width;
  // Ende Attribute
  
  public Trollgame() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 627; 
    int frameHeight = 512;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Trollgame");
    setResizable(true);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jButton1.setBounds(23, 21, 235, 249);
    jButton1.setText("jButton1");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    jButton1.addMouseListener(new MouseAdapter() { 
      public void mouseEntered(MouseEvent evt) { 
        jButton1_MouseEntered(evt);
      }
    });
    jButton1.addMouseListener(new MouseAdapter() { 
      public void mouseClicked(MouseEvent evt) { 
        jButton1_MouseClicked(evt);
      }
    });
    cp.add(jButton1);
    // Ende Komponenten
    
    
    height = frameHeight;
    width = frameWidth;
    setVisible(true);
  } // end of public Trollgame
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Trollgame();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of jButton1_ActionPerformed

  public void jButton1_MouseEntered(MouseEvent evt) {
    // TODO hier Quelltext einfügen
    int xb = jButton1.getLocation().x;
    int yb = jButton1.getLocation().x;
    //Höhe und Breite des Buttons
    int w = jButton1.getWidth();
    int h = jButton1.getHeight();
    //Position des Cursors (aus dem MouseEvent evt)
    int xm = xb+evt.getX();
    int ym = yb+evt.getY();
    
    int x,y;
    
    do {
      x = rd.nextInt(width-w-5);
      y = rd.nextInt(height-h-25);
    } while (!(x<xm-w) && !(x>xm) && !(y<ym-h) && !(y>ym) ); // end of do-while
    
    //int x = rd.nextInt(width-w-5);
    //int y = rd.nextInt(height-h-25);
    jButton1.setLocation(x,y);
  } // end of jButton1_MouseEntered

  public void jButton1_MouseClicked(MouseEvent evt) {
    // TODO hier Quelltext einfügen
    System.out.println("Göttliches Aim, Mashallah");
    System.exit(0);
  } // end of jButton1_MouseClicked

  // Ende Methoden
} // end of class Trollgame

