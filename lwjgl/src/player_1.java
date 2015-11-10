
import org.lwjgl.*;
import org.lwjgl.opengl.*;
import static org.lwjgl.opengl.GL11.*;
import org.lwjgl.util.vector.*;
import java.lang.Math;
import java.awt.geom.*;

public class player_1 {
	public void payer_1()
	{
		float angulo;
		int i; 
		glBegin(GL_LINES);
		for (i=0; i<360; i+=3)
		{
		      angulo = (float)i*3.14159f/180.0f; // grados a radianes
		      glVertex3f(0.0f, 0.0f, 0.0f);
		      glVertex3f((float)Math.cos(angulo), (float)Math.sin(angulo), 0.0f);
		}
		glEnd();
	}
}
