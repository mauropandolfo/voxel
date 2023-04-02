package Shaders;

public class StaticShader extends ShaderProgram {
	
	public static String vertexFile = "#version 400 core\r\n"
			+ "\r\n"
			+ "in vec3 position;\r\n"
			+ "\r\n"
			+ "out vec3 colour;\r\n"
			+ "\r\n"
			+ "void main(void) {\r\n"
			+ "\r\n"
			+ "	gl_Position = vec4(position, 1.0);\r\n"
			+ "	colour = vec3(position.x+ 0.5, position.y + 0.5, position.z +0.5);\r\n"
			+ "	\r\n"
			+ "}";
	
	public static String fragmentFile = "#version 400 core\r\n"
			+ "\r\n"
			+ "in vec3 colour;\r\n"
			+ "\r\n"
			+ "out vec4 out_Color;\r\n"
			+ "\r\n"
			+ "void main(void){\r\n"
			+ "	out_Color = vec4(colour, 1.0);\r\n"
			+ "}";
	
	/*
	 * DESCUBRIR COMO ESCRIBIR LA RUTA CORRECTAMENTE PARA QUE EL SHADER SEA CARGADO DESDE UN ARCHIVO Y NO DESDE UN STRING
	private static final String vertexFile= "C:/Users/Usuario/Documents/voxel/src/Shaders/shaders/vertexShader.txt";
	private static final String fragmentFile= "C:/Users/Usuario/Documents/voxel/src/Shaders/shaders/fragmentShader.txt";
	*/
	public StaticShader() {
		super(vertexFile, fragmentFile);
	}

	@Override
	protected void bindAttributes() {
		
		super.bindAttribute("position", 0);
		super.bindAttribute("textureCoords", 1);
		
	}

}
