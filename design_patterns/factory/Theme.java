package javabootcamp.design_patterns.factory;

public abstract class Theme {
	
	private Text text;

	public Text getText() {
		return text;
	}

	public void setText(Text text) {
		this.text = text;
	}
	
	

}
