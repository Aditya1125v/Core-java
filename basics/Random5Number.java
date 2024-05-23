package in.co.basics;

public class Random5Number {
	public static void main(String[] args) { 
		for(int i=1;i<=5;i=i+1) {///what happen when i++ change into i=i+i
			int d=(int) (1+(Math.random()*100)); 
			System.out.print(d+" "); } } }
	
