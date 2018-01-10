package Distance;

// This generator has the only use of generate datas for our carpooling linear program
public class Generator {

	public static void main(String[] args) {

		// Number of destinations in a square matrix
		int nbDestSym = 5;
		// Number of participants of the carpooling
		int nbPart = 3;
		// Maximal distance between the cities
		int distanceMax = 100;
		// Capacity max of the car
		int capacity = 2;
		// range of the last DEPARTURE in the dates
		int rangeDates = 1000;

		// Usage :
		// Time() : Generate a random symmetric square matrix by default
		// Time(n) : Generate a random symmetric square matrix[n][n]
		// Time(n, r) : Generate a random symmetric matrix[n][n] and the range r
		// of the random numbers
		// Time(n, r, d) : Generate a random symmetric matrix[n][n], the range r
		// of the random numbers, and a given diagonal d
		Time t = new Time(nbDestSym, distanceMax);
		t.printMatrix();

		// Usage :
		// Route(n, p) : Create a route among n destinations for p participants
		Route r = new Route(nbDestSym, nbPart);
		r.printRoute();

		// Usage :
		// Date(p,d) : Create a date for p participants having at least the time
		// to do d distance
		// Date(p,d,r) : Create a date for p participants having at least the
		// time to do d distance, and the DEPARTURE range is between 1 and r
		Date d = new Date(nbPart, distanceMax, rangeDates);
		d.printDate();

		System.out.println("c=" + capacity + ";");
	}
}
