package RenderEngine;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

import Models.RawModel;

public class EntityRenderer {
	
	public static void render(RawModel model) {
		GL30.glBindVertexArray(model.getVaoID());
		GL20.glEnableVertexAttribArray(0);
		GL11.glDrawArrays(GL11.GL_TRIANGLES, 0, model.getVertexCount());
		GL30.glBindVertexArray(0);
	}

}
