package Distance;

import java.util.Random;

// Generate a route for each participant
public class Route {
	private int nbDest;
	private int nbPart;
	private int[][] route;
	// Useful constants to better understand
	private final int FROM = 0;
	private final int TO = 1;

	// Create a route among n destinations for p participants
	public Route(int n, int p) {
		this.nbDest = n;
		this.nbPart = p;
		route = new int[nbPart][2];
		Random randomGenerator = new Random();
		for (int i = 0; i < nbPart; i++) {
			route[i][FROM] = randomGenerator.nextInt(nbDest - 1) + 1;
			do {
				route[i][TO] = randomGenerator.nextInt(nbDest - 1) + 1;
			} while (route[i][TO] == route[i][FROM]);
		}
	}

	public void printRoute() {
		System.out.println("nbPart=" + nbPart + ";");
		System.out.println("route=[");
		for (int i = 0; i < nbPart; i++) {
			System.out.print("[" + route[i][FROM] + ",");
			if (i != nbPart - 1) {
				System.out.println(route[i][TO] + "],");
			} else {
				System.out.println(route[i][TO] + "]");
			}
		}
		System.out.println("];");
	}
}
