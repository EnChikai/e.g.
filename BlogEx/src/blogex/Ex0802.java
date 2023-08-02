package blogex;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Ex0802 {

	public static void main(String[] args) {
		
		BufferedImage img = null;
		
		try {
			img = ImageIO.read(new File("./src/blogex/img.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
