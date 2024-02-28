package Problem1;

import java.util.PriorityQueue;
import java.util.Queue;

class PriorityQueueForFloorAssembled {

	static void floorAssembled(int N, int[] sizeOfFloor) {

		Queue<Integer> queue = new PriorityQueue<Integer>(new MyComparator());

		int max = N;

		System.out.println();
		System.out.println("The order of construction is as follows");
		System.out.println();

		int floorAssembledOnDay = 0;

		for (int i = 0; i < N; i++) {

			floorAssembledOnDay++;
			System.out.println("Day: " + floorAssembledOnDay);

			queue.add(sizeOfFloor[i]);

			while (!queue.isEmpty() && queue.peek() == max)

			{

				System.out.print(queue.poll() + " ");

				max--;

			}

			System.out.println();

		}
	}

}
