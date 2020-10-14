/*
 * University of Central Florida
 * COP 3330 - Fall 2018
 * Authors: Ayla Kovner, Jordan Johnson
 */

import blobz.PolyBlob;
import java.awt.Point;

public class Asteroid extend PolyBlob{
	private stateic final Random Num = new Random()
	public Asteroid (int x, int y, double r) {
		super (-100, -100, r);
		super.setDelta(x,y);
		int sides = NUM.nextInt((9-5)+1)+5;
		Point[]p = new Point[sides];
		for(int=0; i<sides; i++) {
			int distance = NUM.nextInt((15-5)+1)+5;
			double regSize = 2*Math.PI/sides;
			double angle = (i * regSize) + (Math.random()*regSize);
			p[i] = BlobUtils.roratePoint(distance, angle);
		}
		super.setPolygon(p);
	}
}