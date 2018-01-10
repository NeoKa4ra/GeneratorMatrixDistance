package Distance;

import java.util.Random;

// Generate the distances between cities
public class Time {
	private int m[][];
	private int rdmRange = 10;
	private int mLen = 10;
	private int diagonal = 0;

	// Generate a random symmetric square matrix by default
	public Time() {
		// Initialize the random generator
		Random randomGenerator = new Random();
		this.m = new int[mLen][mLen];
		int rdmNumber;
		for (int i = 0; i < mLen; i++) {
			for (int j = i; j < mLen; j++) {
				if (i == j) {
					this.m[i][j] = diagonal;
				} else {
					// to get a number between 1 and rdmRange
					rdmNumber = randomGenerator.nextInt(rdmRange - 1) + 1;
					// Symmetric matrix
					this.m[i][j] = rdmNumber;
					this.m[j][i] = rdmNumber;
				}
			}
		}
	}

	// Generate a random symmetric square matrix[n][n]
	public Time(int n) {
		// Initialize the random generator
		Random randomGenerator = new Random();
		this.mLen = n;
		this.m = new int[mLen][mLen];
		int rdmNumber;
		for (int i = 0; i < mLen; i++) {
			for (int j = i; j < mLen; j++) {
				if (i == j) {
					this.m[i][j] = diagonal;
				} else {
					// to get a number between 1 and rdmRange
					rdmNumber = randomGenerator.nextInt(rdmRange - 1) + 1;
					// Symmetric matrix
					this.m[i][j] = rdmNumber;
					this.m[j][i] = rdmNumber;
				}
			}
		}
	}

	// Generate a random symmetric matrix[n][n] and the range r of the random
	// numbers
	public Time(int n, int r) {
		// Initialize the random generator
		Random randomGenerator = new Random();
		this.mLen = n;
		this.rdmRange = r;
		this.m = new int[mLen][mLen];
		int rdmNumber;
		for (int i = 0; i < mLen; i++) {
			for (int j = i; j < mLen; j++) {
				if (i == j) {
					this.m[i][j] = diagonal;
				} else {
					// to get a number between 1 and rdmRange
					rdmNumber = randomGenerator.nextInt(rdmRange - 1) + 1;
					// Symmetric matrix
					this.m[i][j] = rdmNumber;
					this.m[j][i] = rdmNumber;
				}
			}
		}
	}

	// Generate a random symmetric matrix[n][n], the range r of the random
	// numbers, and a given diagonal
	public Time(int n, int r, int d) {
		// Initialize the random generator
		Random randomGenerator = new Random();
		this.mLen = n;
		this.rdmRange = r;
		this.diagonal = d;
		this.m = new int[mLen][mLen];
		int rdmNumber;
		for (int i = 0; i < mLen; i++) {
			for (int j = i; j < mLen; j++) {
				if (i == j) {
					this.m[i][j] = diagonal;
				} else {
					// to get a number between 1 and rdmRange
					rdmNumber = randomGenerator.nextInt(rdmRange - 1) + 1;
					// Symmetric matrix
					this.m[i][j] = rdmNumber;
					this.m[j][i] = rdmNumber;
				}
			}
		}
	}

	// Print the matrix in the carpooling needed form
	public void printMatrix() {
		System.out.println("nbAdress=" + mLen + ";");
		System.out.println("time=[");
		for (int i = 0; i < mLen; i++) {
			System.out.print('[');
			for (int j = 0; j < mLen; j++) {
				System.out.print(this.m[i][j]);
				if (j != mLen - 1) {
					System.out.print(", ");
				}
			}
			if (i != mLen - 1) {
				System.out.println("],");
			} else {
				System.out.println("]");
			}
		}
		System.out.println("];");
	}
}
