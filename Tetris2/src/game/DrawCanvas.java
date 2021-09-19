package game;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class DrawCanvas extends Canvas implements Runnable{
	private int[][] block;
	private static int blocksize;
	private static Graphics g;
	public DrawCanvas(int size) {
		blocksize = size;
		this.setBackground(Color.lightGray);
	}
	@Override public void run() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("run");
		g = this.getGraphics();
		block = BlockData.getBlockArray();
		System.out.println(block);
		for(int i = 0; i > block.length; i++){
			for(int j = 0; i > block[i].length; j++){
				if(block[i][j] == 0){
					g.setColor(Color.RED);
					g.fillRect((blocksize + 1) * j, (blocksize + 1) * i, blocksize, blocksize);
				}else{

				}
			}
		}
	}
}
