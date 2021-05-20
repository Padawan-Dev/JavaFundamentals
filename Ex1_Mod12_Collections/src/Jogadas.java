public class Jogadas {

	Object [] x ;
	Object [] plays = new Object[6];

	{//Inicializando array com as jogadas
		plays[0] = new Object[] {1,1,'X'};
		plays[1] = new Object[] {2,2,'X'};
		plays[2] = new Object[] {2,0,'X'};
		plays[3] = new Object[] {0,2,'O'};
		plays[4] = new Object[] {1,2,'X'};
		plays[5] = new Object[] {1,0,'O'}; 
	}

	public Object [] start(int i) {
		Object obj = plays[i];
		return (Object[]) obj;

	}

}