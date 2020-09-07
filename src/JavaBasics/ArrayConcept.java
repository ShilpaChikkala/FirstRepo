package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
//array to store similar data type values in a array variable
		//lowest bound/index =0
		//highest bound/index = n-1(n is size of array)
int i[] =new int[4];
i[0] = 10;
i[1] = 20;
i[2]= 30;
i[3] = 40;

System.out.println(i[2]);

//System.out.println(i[4]);// array index out of bound exception

System.out.println(i.length);// size of array

for(int j=0;j<i.length;j++){
	System.out.println(i[j]);
}
		//double array
		
		double d[] = new double[2];
		d[0] =1.5;
		d[1]= 20.5;
		System.out.println(d[1]);
		
		
		
		//character array
		//boolean array
		//string array
		
		//Object array- we can store different kind of data type values
		
		Object ob[] = new Object [6];
		
		ob[0]= "Shilpa";
		ob[1]= 30;
		ob[2]= 23.67;
		ob[3]='F';
		ob[4]="09/01/2020";
		ob[5] =true;
		System.out.println(ob[5]);
		
		for(int s=0;s<ob.length;s++) {
			System.out.println(ob[s]);
		}
		
		//two dimensional array
		
		String s [][]= new String[3][5];
		System.out.println(s.length);// gives total number of rows
				
			System.out.println(s[0].length);	//gives total number of columns
		
		
		
		
		
	}
	
	
	

}
