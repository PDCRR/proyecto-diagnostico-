package pruebas;
 
import java.awt.event.*;
/**
 * @author whiteskull
 */
public class PersonajeJugable extends Sprite implements KeyListener {
 
    private boolean arriba, abajo, izquierda, derecha;
    public void actualiza() {
        if(arriba==true){
            if(this.getY()>0)
                this.setY(this.getY()-10);
        }
        if(abajo==true){
            if(this.getY()<550)
                this.setY(this.getY()+10);
        }
        if(izquierda==true){
            if(this.getX()>0)
                this.setX(this.getX()-10);
        }
        if(derecha==true){
            if(this.getX()<550)
                this.setX(this.getX()+10);
        }
    }
    // tecla sin pulsar
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_DOWN:
                abajo = false;
                break;
            case KeyEvent.VK_UP:
                arriba = false;
                break;
            case KeyEvent.VK_LEFT:
                izquierda = false;
                break;
            case KeyEvent.VK_RIGHT:
                derecha = false;
                break;
        }
    }
 
    //tecla presionada
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                arriba = true;
                break;
            case KeyEvent.VK_LEFT:
                izquierda = true;
                break;
            case KeyEvent.VK_RIGHT:
                derecha = true;
                break;
            case KeyEvent.VK_DOWN:
                abajo = true;
                break;
        }
    }
 
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
