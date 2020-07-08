package com.string;
/*
 A number is termed as triangular number if we can represent it in the form of triangular
  grid of points such that the points form an equilateral triangle and each row 
  contains as many points as the row number, i.e., the first row has one point, 
  second row has two points, third row has three points and so on. 
  The starting triangular numbers are 1, 3 (1+2), 6 (1+2+3), 10 (1+2+3+4).
  
  
  */
public class TriangularNumber {
	 // Driver function  
    public static void main(String[] args)  
    { 
            int n = 5; 
            //triangular_series(n); 
            triangular_series1(n); 
    }

	private static void triangular_series1(int n) {
		for(int i=1;i<=n;i++) {
			System.out.print(" "+i*(i+1)/2);
		}
		
	}

	private static void triangular_series(int n) {
		int i,j=1,k=1;
		for(i=1; i<=n; i++) {
			System.out.print(" "+k);
			j = j+1;
			k = k+j;
		}
		
	} 
}
