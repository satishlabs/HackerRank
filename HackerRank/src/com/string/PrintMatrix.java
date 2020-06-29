package com.string;
/*
            313
			323
			333

  */
public class PrintMatrix {
	public static void main(String[] args) {
		int i,j,k=1,n=3;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(j == 1 && i > 0) {
					System.out.print(k);
					k++;
				}else {
					System.out.print(n);
				}
			}
			System.out.println();
		}
	}
}
