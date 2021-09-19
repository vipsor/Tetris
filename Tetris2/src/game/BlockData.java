package game;

public class BlockData {
	private static int[][] blockdata;
	public static void newBlockData(int col,int row) {
		blockdata = new int[col][row];
		for(int i2 = 0; i2 < col; i2++){
			for(int j2 = 0; j2 <row; j2++){
				System.out.println(i2+":"+j2+":"+ col + ":" + row);
				blockdata[i2][j2] = 0;
			}
		}
	}

	public static int[][] getBlockArray(){
		System.out.println("process on:"+blockdata);
		return blockdata;
	}

}
