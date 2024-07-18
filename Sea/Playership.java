package Sea;
import java.util.*;
public class Playership {
	private static String[][] m;
	private String[][] playerversion;
	private String[][] playerseen;
	
	public Playership() {
		m = new String[10][10];
		playerseen = new String[10][10];
		playerversion = autoship.for_playerattack();
		for(int i = 0; i < playerversion.length; i++) {
			for(int j = 0; j < playerversion[0].length; j++) {
				playerseen[i][j] = "unknown";
			}
		}
	}
	
	public void setcru() {
		Scanner input = new Scanner(System.in);
		Scanner inputstring = new Scanner(System.in);
		System.out.println("which row to put cru?");
		int rowstart = input.nextInt();
		System.out.println("which col to put cru?");
		int colstart = input.nextInt();
		System.out.println("which direction to put it? left? right? up? down?");
		String str = inputstring.nextLine();
		if(rowstart<0 || rowstart>=m.length || colstart<0 || colstart>=m[0].length) {
			System.out.println("out of bound");
			setcru();
		} else if(!(str.equals("left") || str.equals("right") || str.equals("up") || str.equals("down"))) {
			System.out.println("wrong direction");
			setcru();
		} else {
			print1();
			if(str.equals("left") && colstart-2 < 0) {
				System.out.println("wrong");
				setcru();
			} else if(str.equals("right") && colstart+2 >= m[0].length) {
				System.out.println("wrong");
				setcru();
			} else if(str.equals( "up") && rowstart-2 < 0) {
				System.out.println("wrong");
				setcru();
			} else if(str.equals("down") && rowstart+2 >= m.length) {
				System.out.println("wrong");
				setcru();
			} else {
				if(str.equals("left")) {
					m[rowstart][colstart] = "cru ";
					m[rowstart][colstart-1] = "cru ";
					m[rowstart][colstart-2] = "cru ";
					System.out.println("current:");
					print1();
				} if(str.equals("right")) {
					m[rowstart][colstart] = "cru ";
					m[rowstart][colstart+1] = "cru ";
					m[rowstart][colstart+2] = "cru ";
					System.out.println("current:");
					print1();
				} if(str.equals("down")) {
					m[rowstart][colstart] = "cru ";
					m[rowstart+1][colstart] = "cru ";
					m[rowstart+2][colstart] = "cru ";
					System.out.println("current:");
					print1();
				} if(str.equals("up")) {
					m[rowstart][colstart] = "cru ";
					m[rowstart-1][colstart] = "cru ";
					m[rowstart-2][colstart] = "cru ";
					System.out.println("current:");
					print1();
				}
				
			}
		}
	}
	public void setdes() {
		Scanner input = new Scanner(System.in);
		Scanner inputstring = new Scanner(System.in);
		System.out.println("which row to put des?");
		int rowstart = input.nextInt();
		System.out.println("which col to put des?");
		int colstart = input.nextInt();
		System.out.println("which direction to put it? left? right? up? down?");
		String str = inputstring.nextLine();
		if(rowstart<0 || rowstart>=m.length || colstart<0 || colstart>=m[0].length) {
			System.out.println("out of bound");
			setdes();
		} else if(!(str.equals("left") || str.equals("right") || str.equals("up") || str.equals("down"))) {
			System.out.println("wrong direction");
			setdes();
		} else {
			print1();
			if(str.equals("left") && colstart-3 < 0) {
				System.out.println("wrong");
				setdes();
			} else if(str.equals("right") && colstart+3 >= m[0].length) {
				System.out.println("wrong");
				setdes();
			} else if(str.equals("up") && rowstart-3 < 0) {
				System.out.println("wrong");
				setdes();
			} else if(str.equals("down") && rowstart+3 >= m.length) {
				System.out.println("wrong");
				setdes();
			} else {
				if(str.equals("left")) {
					m[rowstart][colstart] = "des ";
					m[rowstart][colstart-1] = "des ";
					m[rowstart][colstart-2] = "des ";
					m[rowstart][colstart-3] = "des ";
					System.out.println("current:");
					print1();
				} if(str.equals("right")) {
					m[rowstart][colstart] = "des ";
					m[rowstart][colstart+1] = "des ";
					m[rowstart][colstart+2] = "des ";
					m[rowstart][colstart+3] = "des ";
					System.out.println("current:");
					print1();
				} if(str.equals("down")) {
					m[rowstart][colstart] = "des ";
					m[rowstart+1][colstart] = "des ";
					m[rowstart+2][colstart] = "des ";
					m[rowstart+3][colstart] = "des ";
					System.out.println("current:");
					print1();
				} if(str.equals("up")) {
					m[rowstart][colstart] = "des ";
					m[rowstart-1][colstart] = "des ";
					m[rowstart-2][colstart] = "des ";
					m[rowstart-3][colstart] = "des ";
					System.out.println("current:");
					print1();
				}
				
			}
		}
	}
	public void setair() {
		Scanner input = new Scanner(System.in);
		Scanner inputstring = new Scanner(System.in);
		System.out.println("which row to put air?");
		int rowstart = input.nextInt();
		System.out.println("which col to put air?");
		int colstart = input.nextInt();
		System.out.println("which direction to put it? left? right? up? down?");
		String str = input.next();
		if(rowstart<0 || rowstart>=m.length || colstart<0 || colstart>=m[0].length) {
			System.out.println("out of bound");
			setair();
		} else if(!(str.equals("left") || str.equals("right") || str.equals("up") || str.equals("down"))) {
			System.out.println("wrong direction");
			setair();
		} else {
			print1();
			if(str.equals("left") && colstart-4 < 0) {
				System.out.println("wrong");
				setair();
			} else if(str.equals("right") && colstart+4 >= m[0].length) {
				System.out.println("wrong");
				setair();
			} else if(str.equals("up") && rowstart-4 < 0) {
				System.out.println("wrong");
				setair();
			} else if(str.equals("down") && rowstart+4 >= m.length) {
				System.out.println("wrong");
				setair();
			} else {
				if(str.equals("left")) {
					m[rowstart][colstart] = "air ";
					m[rowstart][colstart-1] = "air ";
					m[rowstart][colstart-2] = "air ";
					m[rowstart][colstart-3] = "air ";
					m[rowstart][colstart-4] = "air ";
					System.out.println("current:");
					print1();
				} else if(str.equals("right")) {
					m[rowstart][colstart] = "air ";
					m[rowstart][colstart+1] = "air ";
					m[rowstart][colstart+2] = "air ";
					m[rowstart][colstart+3] = "air ";
					m[rowstart][colstart+4] = "air ";
					System.out.println("current:");
					print1();
				} else if(str.equals("down")) {
					m[rowstart][colstart] = "air ";
					m[rowstart+1][colstart] = "air ";
					m[rowstart+2][colstart] = "air ";
					m[rowstart+3][colstart] = "air ";
					m[rowstart+4][colstart] = "air ";
					System.out.println("current:");
					print1();
				} else {
					m[rowstart][colstart] = "air ";
					m[rowstart-1][colstart] = "air ";
					m[rowstart-2][colstart] = "air ";
					m[rowstart-3][colstart] = "air ";
					m[rowstart-4][colstart] = "air ";
					System.out.println("current:");
					print1();
				}
				
			}
		}
	}
	
	public void print1() {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
	public void print2(String[][] a) {
		String[][] use = new String[10][10];
		for(int i =0; i < a.length; i++) {
			for(int j= 0; j < a[1].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void playercom() {
		Playership p1 = new Playership();
		p1.setcru();
		p1.setcru();
		p1.setcru();
		p1.setdes();
		p1.setdes();
		p1.setair();
	}
	public static String[][] getgrid(){
		return m;
	}
	public void playerattack() {
		Scanner input = new Scanner(System.in);
		System.out.println("which row?");
		int row = input.nextInt();
		System.out.println("which col?");
		int col = input.nextInt();
		print2(playerseen);
		if(row < 0 || row > playerseen.length || col < 0 || col > playerseen[0].length) {
			System.out.println("wrong");
			playerattack();
		} else {
			if(playerversion[row][col]!=null) {
				if(playerversion[row][col] == "c") {
					playerseen[row][col] = "hc     ";
					print2(playerseen);
				} if(playerversion[row][col] == "d") {
					playerseen[row][col] = "hd     ";
					print2(playerseen);
				} if(playerversion[row][col] == "a") {
					playerseen[row][col] = "ha     ";
					print2(playerseen);
				}
			} else {
				playerseen[row][col] = "empty  ";
				print2(playerseen);
			}
		}
		
	}
	
}
