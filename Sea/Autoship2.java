package Sea;

import java.util.*;

public class Autoship2 {
private String[][] m;//generated
private String[][] map_self;
private String[][] actual;
private boolean[][] check;
private int row1,col1,row2,col2;//navigate
private int countc,countd,counta;//count how many hit and when to stop
private int direction;//known where to go
private ArrayList<Integer> notpos;//cannot use for direction
private ArrayList<Integer> pospos;//possible position
private ArrayList<String> point;
private int cc,cd,ca;

public Autoship2() {
	m = new String[10][10];
	map_self = new String[10][10];
	actual = Playership.getgrid();
	check = new boolean[10][10];
	for (int i = 0; i < 10; i++) {
		for(int j= 0; j < 10; j++) {
			map_self[i][j] = "unknown";
		}
	}
	direction = -1;
	notpos = new ArrayList<Integer>();
	pospos = new ArrayList<Integer>();
	point = new ArrayList<String>();
	point.add("left");//1
	point.add("up"); //2
	point.add("right");//3
	point.add("down");//4
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
	if(actual[a][b] != null) {
		if(actual[a][b] == "c") {
			map_self[a][b] = "hitc";
			check[a][b] = true;
			countc++;
			if(countc==9) cc=17;
			return "hitc";
		} else if(actual[a][b] == "d") {
			map_self[a][b] = "hitd";
			check[a][b] = true;
			countd++;
			if(countd==8) cd=17;
			return "hitd";
		} else if(actual[a][b] == "a") {
			map_self[a][b] = "hita";
			check[a][b] = true;
			counta++;
			if(counta==5) ca=17;
			return "hita";
		} else {
			check[a][b] = true;
			return "empty";
		}
	} else {
		map_self[a][b] = "empty";
		check[a][b] = true;
		return "empty";
	}
	
}
public void actattack() {
	if(row1!= -1 && col1!=-1) {//first
		int row = (int)(10*Math.random());
		int col = (int)(10*Math.random());
		if(check[row][col] == true) {
			while(check[row][col] == true) {
				row = (int)(10*Math.random());
				col = (int)(10*Math.random());
			}
		}
		String type = attack(row, col);
		if(type.equals("hitc")) {
			row1 = row;
			col1 = col;
		}
		if(type.equals("hitd")) {
			row1 = row;
			col1 = col;
		}
		if(type.equals("hita")) {
			row1 = row;
			col1 = col;
		}
		if(type.equals("empty")) {
			row1 = -1;
			row2 = -1;
		} 
		if(!attack(row,col).equals("empty")) {
		   if(col==0) {
			   if(row==0) {
				   direction=3;
				   point.remove("left");
				   point.remove("up");
			   } else if(row==9) {
				   direction=3;
				   point.remove("left");
				   point.remove("down");
			   }
			   else {
				   direction =3;
				   point.remove("left");
			   }
		   }
		   if(col==9) {
			   if(row==0) {
				   direction =1;
				   point.remove("right");
				   point.remove("up");
			   } else if(row==9) {
				   direction=1;
				   point.remove("right");
				   point.remove("down");
			   } else {
				   point.remove("right");
			   }
		   }
		   if(row==0) {
			   if(col==0) {
				   direction = 3;
				   point.remove("up");
				   point.remove("left");
			   } else if(col==9) {
				   direction=1;
				   point.remove("up");
				   point.remove("right");
			   } else {
				   point.remove("up");
			   }
		   }
		   if(row==9) {
			   if(col==0) {
				   direction=3;
				   point.remove("left");
				   point.remove("down");
			   } else if(col==9) {
				   direction=1;
				   point.remove("right");
				   point.remove("down");
			   } else {
				   point.remove("down");
			   }
		   }
		   
		   
	} 
	else {//last time hit
		if(direction == -1) {//only hit one time
			int pos = (int)(4*Math.random())+1;//four directions
			String getcurrent = attack(row1, col1);
			if(pos == 1) {
				String getthing = attack(row1, col1-1);
				if(getthing.equals(getcurrent)) {
					direction = 1;//set direction
					pospos.add(1);
					pospos.add(3);
					
				} else if(!getthing.equals(getcurrent) && getthing!="empty") {
					direction = 3;
					row2 = row1;
					col2 = col1-1;
					point.remove("left");
				} else {
					notpos.add(1);
					notpos.add(3);//two direction not likely
					point.remove("left");
				}
			} 
			if(pos == 2) {
				String getthing = attack(row1,col1-1);
				if(getthing.equals(getcurrent)) {
					direction = 2;
					pospos.add(2);
					pospos.add(4);
				} else if(!getthing.equals(getcurrent) && getthing!="empty") {
					direction = 4;
					row2 = row1+1;
					col2 = col1;
					point.remove("up");
				}
				else {
					notpos.add(2);
					notpos.add(4);
					point.remove("up");
				}
			}
			if(pos == 3) {
				String getthing = attack(row1,col1+1);
				if(getthing.equals(getcurrent)) {
					direction = 3;
					pospos.add(1);
					pospos.add(3);
				} else if(!getthing.equals(getcurrent) && getthing!="empty") {
					direction = 1;
					row2 = row1;
					col2 = col1-1;
					point.remove("right");
				}
				else {
					notpos.add(1);
					notpos.add(3);
					point.remove("right");
				}
			}
			if(pos == 4) {
				String getthing = attack(row1,col1+1);
				if(getthing.equals(getcurrent)) {
					direction = 4;
					pospos.add(2);
					pospos.add(4);
				} else if(!equals(getcurrent) && getthing!="empty") { 
					row2 = row1+1;
					col2=col1;
					point.remove("down");
				}
				else {
					notpos.add(2);
					notpos.add(4);
					point.remove("down");
					}
			}
			
		}
		else {//hit two more times
			if(point.size()==1) {
				String one = point.get(0);
				if(one.equals("left")) attack(row1,col1-1);
				if(one.equals("up")) attack(row1-1,col1);
				if(one.equals("right")) attack(row1,col1+1);
				if(one.equals("down")) attack(row1+1,col1);
				
			}
			else {
				if(direction==1) {
					String get = attack(row1,col1-1);
					if(!get.equals(attack(row1,col1))) {
						point.remove("left");
					}
				}
				if(direction==2) {
					String get = attack(row1-1,col1);
					if(!get.equals(attack(row1,col1))) {
						point.remove("up");
					}
				}
				if(direction==3) {
					String get = attack(row1,col1+1);
					if(!get.equals(attack(row1,col1))) {
						point.remove("right");
					}
				}
				if(direction==4) {
					String get = attack(row1+1, col1-1);
						if(!get.equals(attack(row1,col1))) {
							point.remove("down");
						}
					
				}
			}
			}
		}		 
	}
	}

public void print() {
	for (int i =0; i < m.length; i++) {
		for(int j = 0; j < m[0].length; j++) {
			System.out.print(m[i][j] + " ");
		}
		System.out.println();
	}
}
}
