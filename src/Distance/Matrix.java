package Distance;

import java.util.Random;

public class Matrix {
	private int m[][];
	private int rdmRange = 10;
	private int mLen = 10;
	private int diagonal = 0;
	
	// Give the mLen length of the square matrix
	// Generate a random symmetric matrix[mLen][mLen], with a diagonal fixed
	public Matrix(){
		// Initialize the random generator
				Random randomGenerator = new Random();
				this.m = new int[mLen][mLen];
				int rdmNumber;
				for(int i=0;i<mLen;i++){
					for(int j=i;j<mLen;j++){
						if(i==j){
							this.m[i][j] = diagonal;
						}else{
							// To not get 0 distances
							do{
								rdmNumber = randomGenerator.nextInt(rdmRange);
							}while(rdmNumber==0);
							// Symmetric matrix
							this.m[i][j] = rdmNumber;
							this.m[j][i] = rdmNumber;
						}
					}
				}
	}
	
	// Give the n length of the square matrix
	// Generate a random symmetric matrix[n][n], with a diagonal fixed
	public Matrix(int n){
		// Initialize the random generator
				Random randomGenerator = new Random();
				this.mLen = n;
				this.m = new int[mLen][mLen];
				int rdmNumber;
				for(int i=0;i<mLen;i++){
					for(int j=i;j<mLen;j++){
						if(i==j){
							this.m[i][j] = diagonal;
						}else{
							// To not get 0 distances
							do{
								rdmNumber = randomGenerator.nextInt(rdmRange);
							}while(rdmNumber==0);
							// Symmetric matrix
							this.m[i][j] = rdmNumber;
							this.m[j][i] = rdmNumber;
						}
					}
				}
	}
	
	// Print the matrix in the carpooling needed form
	public void printMatrix(){
		System.out.println("nbAdress="+mLen+";");
		System.out.println("time=[");
		for(int i=0;i<mLen;i++){
			System.out.print('[');
			for(int j=0;j<mLen;j++){
				System.out.print(this.m[i][j]);
				if(j!=mLen-1){
					System.out.print(", ");
				}
			}
			System.out.println("],");
		}
		System.out.println("];");
	}
}
