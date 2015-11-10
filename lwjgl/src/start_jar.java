
import org.lwjgl.*;
import org.lwjgl.opengl.*;
import static org.lwjgl.opengl.GL11.*;

public class start_jar {
	public void start() {
        try {
	        Display.setDisplayMode(new DisplayMode(800, 600));
	        Display.create();
	    } catch (LWJGLException e) {
	        e.printStackTrace();
	        System.exit(0);
	    }
 
        // init OpenGL here
 
        while (!Display.isCloseRequested()) {
        	
        	//you cab put input and render things here
        	
        	//Sets the window settings
        	glMatrixMode(GL_PROJECTION);
        	glLoadIdentity(); // Resets any previous projection matrices
        	glOrtho(0, 800, 600, 0, 1, -1);
        	glMatrixMode(GL_MODELVIEW);
        	
        	//prints the player
        	player_1 player = new player_1();
        	player.payer_1();
        	
        	Display.update();
        }
 
        Display.destroy();
    }
 
    
 
    public static void main(String[] argv) {
        start_jar inputExample = new start_jar();
        inputExample.start();
    }
}
