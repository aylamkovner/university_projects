/*
 * University of Central Florida
 * COP 3330 - Fall 2018
 * Authors: Ayla Kovner, Jordan Johnson
 */

import blobz.GUI;
import blob.SandBox;
import blobz.SandBoxMode;
import java.util.Random;

public class AsteroidField implements BlubGUI{
	private static int numOfAsteroids;
	private static SandBox sb;
	private static final Random NUM = new Random();
	private static final double Rotation[] = {-.1,.1};
	private static void main(String[] args) {
		new AsteroidField(Integer.parseInt(args[0]));
	}
	public AsteroidField(int a) {
		numOfAsteroids = a;
		sb = new Sandbox();
		sb.setSandBoxMode(SandBoxMode.FLOW);
		sb.setFrameRate(15);
		sb.init(this);
	}
	public void generate() {
		for(int i=0; i<numOfAsteroids; i++) {
			int xv = NUM.nextInt((3+(-3)+1)+(-3));
			int yv = NUM.nextInt((3+(-3)+1)+(-3));
			
			while(xv==0)
				xv = NUM.nextInt((3+(-3)+1)+(-3));
			while(yv==0)
				yv = NUM.nextInt((3+(-3)+1)+(-3));
			
			int index = NUM.nextInt(2);
			double r = rotation[index];
			
			Asteroid a = new Asteroid(xv, yv, r);
			sv.addBlob(a);
		}
	}
}