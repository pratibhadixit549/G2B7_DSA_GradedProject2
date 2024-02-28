package Problem1;

import java.util.Scanner;

class UserInput {
	
	static void input() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the total no of floors in the building");

		// contains the total floors N in the building
		int N = scanner.nextInt();

		/*
		 * Contains N inputs in which the ith integer denotes the size of the floor that
		 * will be given to architect by factories on the ith day.
		 */
		int sizeOfFloor[] = new int[N];

		int Day = 0;
		for (int i_arr = 0; i_arr < N; i_arr++) {
			Day++;
			System.out.println("enter the floor size given on day : " + Day);
			sizeOfFloor[i_arr] = scanner.nextInt();
		}
		
		System.out.println();
		System.out.println();

		new PriorityQueueForFloorAssembled();
		PriorityQueueForFloorAssembled.floorAssembled(N, sizeOfFloor);

	}
}
