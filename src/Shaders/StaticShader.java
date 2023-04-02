package Shaders;

public class StaticShader extends ShaderProgram {
		
	private static final String vertexFile= "C:/Users/Usuario/Documents/voxel/src/Shaders/shaders/vertexShader.txt";
	private static final String fragmentFile= "C:/Users/Usuario/Documents/voxel/src/Shaders/shaders/fragmentShader.txt";
	
	public StaticShader() {
		super(vertexFile, fragmentFile);
	}

	@Override
	protected void bindAttributes() {
		
		super.bindAttribute("position", 0);
		super.bindAttribute("textureCoords", 1);
		
	}

}
