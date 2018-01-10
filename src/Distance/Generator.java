package Distance;

// This generator has the only use of generate datas for our carpooling linear program
public class Generator {

	public static void main(String[] args) {
		
		// Number of destinations in a square matrix
		int nbDestSym = 10;
		// Number of participants of the carpooling
		int nbPart = 5;
		// Maximal distance between the cities
		int distanceMax = 100;
		// Capacity max of the car
		int capacity = 2;
		// range of the last DEPARTURE in the dates
		int rangeDates = 1000;

		Time t = new Time(nbDestSym, distanceMax);
		t.printMatrix();

		Route r = new Route(nbDestSym, nbPart);
		r.printRoute();

		Date d = new Date(nbPart, distanceMax, rangeDates);
		d.printDate();

		System.out.println("c=" + capacity + ";");
	}
}
