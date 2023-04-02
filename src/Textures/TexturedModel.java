package Textures;

import Models.RawModel;

public class TexturedModel {
	
	RawModel model;
	ModelTexture texture;
	
	public TexturedModel(RawModel model, ModelTexture texture) {
		super();
		this.model = model;
		this.texture = texture;
	}

	public RawModel getModel() {
		return model;
	}

	public void setModel(RawModel model) {
		this.model = model;
	}

	public ModelTexture getTexture() {
		return texture;
	}

	public void setTexture(ModelTexture texture) {
		this.texture = texture;
	}
}
