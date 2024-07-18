package Sea;
import java.util.*;
public class Map {
	private String[][] m;
	private int nc;
	private int nd;
	private int na;
	
	public Map(int numcru, int numdes, int numair) {
		m = new String[10][10];
		nc = numcru;
		nd = numdes;
		na = numair;
	}
	
	//set cru
	public void setcru() {
		boolean flag = false;
		int width = m.length;
		int length = m[0].length;
		int startrow = (int)(width * Math.random());
		int startcol = (int)(length * Math.random());
		int direction = (int)(4*Math.random())+1;
		if(direction == 1) {
			if(startcol - 2 >= 0 && m[startrow][startcol-2] == null && m[startrow][startcol-1]==null && m[startrow][startcol]==null) {
				m[startrow][startcol-2] = "c";
				m[startrow][startcol-1] = "c";
				m[startrow][startcol] = "c";
				flag = true;
			}
		} else if(direction == 2) {
			if(startrow - 2 >= 0 && m[startrow-2][startcol]==null && m[startrow-1][startcol]==null && m[startrow][startcol]==null) {
				m[startrow-2][startcol] = "c"; m[startrow-1][startcol] = "c"; m[startrow][startcol] = "c";
				flag = true;
			}
		} else if(direction == 3) {
			if(startcol + 2 <= length - 1 && m[startrow][startcol+2] == null && m[startrow][startcol+1]==null && m[startrow][startcol]==null) {
				m[startrow][startcol+2] = "c"; m[startrow][startcol+1] = "c"; m[startrow][startcol] = "c";
				flag = true;
			}
		} else {
			if(startrow + 2 <= width - 1 && m[startrow+2][startcol]==null && m[startrow+1][startcol]==null && m[startrow][startcol]==null) {
				m[startrow+2][startcol] = "c"; m[startrow+1][startcol] = "c"; m[startrow][startcol] = "c";
				flag = true;
			}
		}
		if (flag == false) {
			
				setcru();
			
		}
	}
	public void setdes() {
		boolean flag = false;
		int width = m.length;
		int length = m[0].length;
		int startrow = (int)(width * Math.random());
		int startcol = (int)(length * Math.random());
		int direction = (int)(4*Math.random())+1;
		if(direction == 1) {
			if(startcol - 3 >= 0 && m[startrow][startcol-3] == null && m[startrow][startcol-2]==null && m[startrow][startcol-1]==null && m[startrow][startcol]==null) {
				m[startrow][startcol-3] = "d";
				m[startrow][startcol-2] = "d";
				m[startrow][startcol-1] = "d";
				m[startrow][startcol] = "d";
				flag = true;
			}
		} else if(direction == 2) {
			if(startrow - 3 >= 0 && m[startrow-3][startcol]==null && m[startrow-2][startcol]==null && m[startrow-1][startcol]==null && m[startrow][startcol]==null) {
				m[startrow-2][startcol] = "d"; m[startrow-1][startcol] = "d"; m[startrow][startcol] = "d";m[startrow-3][startcol] = "d";
				flag = true;
			}
		} else if(direction == 3) {
			if(startcol + 3 <= length - 1 && m[startrow][startcol+3] == null && m[startrow][startcol+2] == null && m[startrow][startcol+1]==null && m[startrow][startcol]==null) {
				m[startrow][startcol+3] = "d";m[startrow][startcol+2] = "d"; m[startrow][startcol+1] = "d"; m[startrow][startcol] = "d";
				flag = true;
			}
		} else {
			if(startrow + 3 <= width - 1 && m[startrow+3][startcol]==null && m[startrow+2][startcol]==null && m[startrow+1][startcol]==null && m[startrow][startcol]==null) {
				m[startrow+3][startcol] = "d";m[startrow+2][startcol] = "d"; m[startrow+1][startcol] = "d"; m[startrow][startcol] = "d";
				flag = true;
			}
		}
		if (flag == false) {
			setdes();
			}
		}
	public void setair() {
		boolean flag = false;
		int width = m.length;
		int length = m[0].length;
		int startrow = (int)(width * Math.random());
		int startcol = (int)(length * Math.random());
		int direction = (int)(4*Math.random())+1;
		if(direction == 1) {
			if(startcol - 4 >= 0 && m[startrow][startcol-3] == null && m[startrow][startcol-3]==null &&m[startrow][startcol-2]==null && m[startrow][startcol-1]==null &&m[startrow][startcol]==null) {
				m[startrow][startcol-4] = "a";
				m[startrow][startcol-3] = "a";
				m[startrow][startcol-2] = "a";
				m[startrow][startcol-1] = "a";
				m[startrow][startcol] = "a";
				flag = true;
			}
		} else if(direction == 2) {
			if(startrow - 4 >= 0 && m[startrow-4][startcol]==null && m[startrow-3][startcol]==null && m[startrow-2][startcol]==null && m[startrow-1][startcol]==null && m[startrow][startcol]==null) {
				m[startrow-4][startcol] = "a";
				m[startrow-3][startcol] = "a";
				m[startrow-2][startcol] = "a";
				m[startrow-1][startcol] = "a";
				m[startrow][startcol] = "a";
				flag = true;
			}
		} else if(direction == 3) {
			if(startcol + 4 <= length - 1 && m[startrow][startcol+4] == null && m[startrow][startcol+3] == null && m[startrow][startcol+2] == null && m[startrow][startcol+1]==null && m[startrow][startcol]==null) {
				m[startrow][startcol+4] = "a";
				m[startrow][startcol+3] = "a";
				m[startrow][startcol+2] = "a";
				m[startrow][startcol+1] = "a";
				m[startrow][startcol] = "a";
				flag = true;
			}
		} else {
			if(startrow + 4 <= width - 1 && m[startrow+4][startcol]==null &&m[startrow+3][startcol]==null && m[startrow+2][startcol]==null && m[startrow+1][startcol]==null && m[startrow][startcol]==null) {
				m[startrow+4][startcol] = "a";
				m[startrow+3][startcol] = "a";
				m[startrow+2][startcol] = "a";
				m[startrow+1][startcol] = "a";
				m[startrow][startcol] = "a";
				flag = true;
			}
		}
		if (flag == false) {
			setair();
			}
	}
	
	public void attack() {
		Scanner input = new Scanner(System.in);
		System.out.println("row?");
		int a = input.nextInt();
		System.out.println("col?");
		int b = input.nextInt();
		if(a < 0 || a >= m.length || b < 0 || b >= m[0].length) {
			System.out.println("wrong");
			attack();
		} else {
			if(m[a][b] != null) {
				if(m[a][b] == "c") {
					m[a][b] = "hc";
				}
				if(m[a][b] == "d") {
					m[a][b] = "hd";
				}
				if(m[a][b].equals("a")) {
					m[a][b] = "ha";
				}
			} else {
				m[a][b] = "m";
			}
		}
	}
	public String[][] print(){
		String[][] re = new String[10][10];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0 ; j < m[0].length; j++) {
				if(m[i][j] == "hc") {
					re[i][j] = "cru    " + " ";
				}
				else if(m[i][j] == "hd") {
					re[i][j] = "des    " +" ";
				}
				else if(m[i][j] == "ha") {
					re[i][j] = "air    " + " ";
				}
				else if(m[i][j] == "m") {
					re[i][j] = "empty  " + " ";
				}
				else {
					re[i][j] = "unknown" + " ";
				}
			}
		}
		return re;
	}
	public void print2() {
		String[][] in = print();
		for (int i = 0; i < in.length; i++) {
			for (int j = 0; j < in[0].length; j++) {
				System.out.print(in[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	
	
	/*public void print1() {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				if(m[i][j] == "hc") {
					System.out.print("cru    " +" ");
				}
				else if (m[i][j] == "hm") {
					System.out.print("des  " + " ");
				} else if(m[i][j] == "m") {
					System.out.print("empty  " + " ");
				}
				else {
					System.out.print("unknown" + " ");
				}
			}
			System.out.println();
		}
	}*/
	public static void play() {
		Map m1 = new Map(3,2,1);
		m1.setcru();
		m1.setcru();
		m1.setcru();
		m1.setdes();
		m1.setdes();
		m1.setair();
		while(m1.check()==false) {
			m1.attack();
			m1.print2();
		}
		}
		
		
	
	public boolean check() {
		int countcru = 0;
		int countdes = 0;
		int countair = 0;
		String[][] flag = print();
		for (int i = 0; i < flag.length; i++) {
			for (int j = 0; j < flag[0].length; j++) {
				if(flag[i][j].equals( "cru    " +" ")) {
				countcru++;
				} if(flag[i][j].equals( "des    " +" ")) {
					countdes++;
				} if(flag[i][j].equals("air    " + " ")) {
					countair++;
				}
			}
		}
		return countcru==nc*3 && countdes==nd*4 && countair==na*5;
	}

	
}
