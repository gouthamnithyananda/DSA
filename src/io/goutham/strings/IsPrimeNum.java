package io.goutham.strings;

public class IsPrimeNum {
	
	static int count=2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPrimeNormal(5+1));
		System.out.println(isPrimeRecursion(5+1));

	}
	
	static public Boolean isPrimeNormal(int n) {
		if(n<=1) return false;
		if(n==2) return true;
		if(n%2==0) return false;
		
		for (int i =3;i<=Math.sqrt(n);i+=2) {
			if(n%3==0) return false;
		}
		return true;
	}
	
	static public Boolean isPrimeRecursion(int n) {
		if(n<=1) return false;
		if(n==count) return true;
		if(n%count==0) return false;
		++count;
		return isPrimeRecursion(n);
	}

}
