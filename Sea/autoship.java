package Sea;

import java.util.*;

public class autoship{
private static String[][] m;
private int row1;
private int col1;
private int row2;
private int col2;
private int needc,needd,needa;
private int need_count;
private String typehit;
private String direction;
private static String[][] unseen;
private final String[][] actual;
private ArrayList<String> possible;
private String flag1,flag2,flag3,flag4;

public autoship() {
	m = new String[10][10];
	row1 = -1;
	col1 = -1;
	row2 = -1;
	col2 = -1;
	unseen = new String[10][10];
	actual = Playership.getgrid();
	possible = new ArrayList<String>();
	possible.add(flag1); possible.add(flag2); possible.add(flag3); possible.add(flag4);
	direction = "-1";
}

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
public String attack(int a, int b) {
	if(actual[a][b] == null) {
		unseen[a][b] = "m";
		return "m";
	} else {
		if(actual[a][b] == "cru ") {
			unseen[a][b] = "hc";
			return "hc";
		} else if(actual[a][b] == "des ") {
			unseen[a][b] = "hd";
			return "hd";
		} else {
			unseen[a][b] = "ha";
			return "ha";
		}
	}
	
}

public void beingattack(int row, int col) {
	if(m[row][col]!=null) {
		if(m[row][col] == "c") {
			m[row][col] = "hc";
		} if(m[row][col] == "d") {
			m[row][col] = "hd";
		} if(m[row][col] == "a") {
			m[row][col] = "ha";
		}
	} else {
		m[row][col] = "ma";
	}
}

public String actattack() {
	String[][] player = Playership.getgrid();
	if(row1 == -1 && col1 == -1) {
		int ranrow = (int)((actual.length*Math.random()));
		int rancol = (int)(actual[0].length*Math.random());
		String type_hit = attack(ranrow, rancol);
		if(type_hit != "m") {
			row1 = ranrow;
			col1 = rancol;
			typehit = type_hit.substring(1);
			if(typehit=="c") {
				need_count=3;
				needc++;
				return "hit cru";
			}
			if(typehit=="d") {
				need_count=4;
				needd++;
				return "hit des";
			}
			if(typehit=="a") {
				need_count=5;
				needa++;
				return "hit air";
			}
	} else {
		return "miss";
	}
	} else {
		int randirection = (int)(4*Math.random())+1;
		if(direction == "-1") {
			String check;
			if(randirection==1 && flag1!="true") {
				check = attack(row1, col1-1);
				if(check.equals("m")) {
					flag1="true";
				} else {
					if(actual[row1][col1-1].equals(actual[row1][col1])) {
						direction="left";
					} else if(!actual[row1][col1-1].equals(actual[row1][col1]) && actual[row1][col1-1]!=null) {
						row2 = row1;
						col2 = col1-1;
						flag1="true";
					} else {
						
					}
				}
			}else{
				int choice = -1;
				for(int i = 0; i < possible.size(); i++) {
					if(!possible.get(i).equals("true")) {
						choice = i;
					}
				}
				direction = possible.get(choice).substring(4);
				
			}
			
			}else if(randirection== 2) {
				check = attack(row1, col1+1);
			} else {
				check = attack(row1+1, col1);
			}
		} 
	}

public void generate() {
	setcru();
	setcru();
	setcru();
	setdes();
	setdes();
	setair();
}
public static String[][] for_playerattack(){
	autoship a1 = new autoship();
	a1.generate();
	return m;
}



}
