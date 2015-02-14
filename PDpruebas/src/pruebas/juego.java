package pruebas;
 
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
 
/**
 *
 * @author whiteskull
 */
public class juego extends Canvas implements KeyListener {
        // TODO code application logic here
    private Frame ventana;
    //private Sprite sprite;
    private PersonajeJugable otroSprite;
    long tiempo=System.currentTimeMillis();
 
    public juego(){
        //sprite=new Sprite();
        otroSprite=new PersonajeJugable();    
        ventana=new Frame();
 
        ventana.setSize(650,650);
        ventana.add(this);
        ventana.setVisible(true);
        ventana.addWindowListener(new WindowAdapter(){ public void windowClosing(WindowEvent e){  System.exit(0); } });
 
        //sprite.setSprite("/Imagenes/personaje.png");
        //sprite.setY(this.getHeight()/2);
        otroSprite.setSprite("/Imagenes/navesita.png");
        otroSprite.setY(this.getHeight()/2);
        // ATENCION ATENCION *************************************************
        this.requestFocus(); // Focalizamos hacia nuestro objeto 
        this.addKeyListener(otroSprite); // Direccionamos la captura a nuestro Pj
        // *******************************************************************
        while(true) // BUCLE INFINITO DEL JUEGO
        {         
            if (System.currentTimeMillis()-tiempo>25) { // actualizamos cada 25 milisegundos
                otroSprite.actualiza(); // Mueve nuestro Pj 
 
                //if (sprite.getX()>this.getWidth()) sprite.setX(0);
                //else sprite.setX(sprite.getX()+1);
 
                dibuja(this.getGraphics());
                tiempo=System.currentTimeMillis();
            }
        }
    }
    public int getHeight(){
        return getSize().height;
    }
    
    public int getwidth(){
        return getSize().width;
    }
    
    public void dibuja(Graphics grafico)
    {
        // El Begin de OpenGL o DirectX
        BufferedImage pantalla=new BufferedImage(this.getWidth(),this.getHeight(), BufferedImage.TYPE_INT_RGB );
 
        //sprite.putSprite(pantalla.getGraphics(), sprite.getX(), sprite.getY());
        otroSprite.putSprite(pantalla.getGraphics(), otroSprite.getX(), otroSprite.getY());
 
        // El ENd
        grafico.drawImage(pantalla, 0, 0, this);
    }
 
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
 
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
 
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static void main (String args[]){
     juego play= new juego();
     
    }
}
 
