package Distance;

import java.util.Random;

// Generate a departure and arrival dates for each participant
public class Date {
	private int dates[][];
	private int nbPart;
	private int distanceMax;
	private int rangeDates;
	// CONSTANTS
	private final int DEPARTURE = 0;
	private final int ARRIVAL = 1;

	// Create a date for p participants having at least the time to do d
	// distance
	public Date(int p, int d) {
		this.nbPart = p;
		this.distanceMax = d;
		dates = new int[nbPart][2];
		Random randomGenerator = new Random();
		for (int i = 0; i < nbPart; i++) {
			// The departure is between 1 and distanceMax
			dates[i][DEPARTURE] = randomGenerator.nextInt(distanceMax - 1) + 1;
			// The arrival is between distanceMax and 3*distanceMax
			dates[i][ARRIVAL] = randomGenerator.nextInt(distanceMax - 1) + 2 * distanceMax + 1;
		}
	}
	
	// Create a date for p participants having at least the time to do d
	// distance, and the DEPARTURE range is between 1 and r
	public Date(int p, int d, int r) {
		this.nbPart = p;
		this.distanceMax = d;
		this.rangeDates = r;
		dates = new int[nbPart][2];
		Random randomGenerator = new Random();
		for (int i = 0; i < nbPart; i++) {
			// The departure is between 1 and rangeDates
			dates[i][DEPARTURE] = randomGenerator.nextInt(rangeDates - 1) + 1;
			// The departure is between the DEPARTURE + distanceMax and the DEPARTURE + 3*distanceMax
			dates[i][ARRIVAL] = dates[i][DEPARTURE] + randomGenerator.nextInt(distanceMax - 1) + 2 * distanceMax + 1;
		}
	}

	public void printDate() {
		System.out.println("dates=[");
		for (int i = 0; i < nbPart; i++) {
			System.out.print("[" + dates[i][DEPARTURE] + ",");
			if (i != nbPart - 1) {
				System.out.println(dates[i][ARRIVAL] + "],");
			} else {
				System.out.println(dates[i][ARRIVAL] + "]");
			}
		}
		System.out.println("];");
	}
}
