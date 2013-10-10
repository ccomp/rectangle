public  class Rectangle	{
	
	// state
	private int length;
	private int width;

	// constructor
	
	public Rectangle(int length, int width) {
		setLength(length);
		setWidth(width);
	}

	// behaviour
	
	public void draw() {
		String line = "*";
		for (int i = 0; i<length; i++) {
			if (length > 0) {
				System.out.print(line);

			}
			if (width >0) {
				System.out.println(line);
			}
		}
	}


	public int length() {
		return length;
	}

	// length conditions
	public void setLength(int length) {
		if (length > 0) {
			this.length = length;
		}
	}

	public int width() {
		return width;
	}

	// width conditions
	public void setWidth(int width) {
		if (width > 0) {
			this.width = width;
		}
	}

}