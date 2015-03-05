// Ethan Richardson
// CSCI 2104
// 2013-4-8
//
// PP 6.5

/*
Implement the Josephus problem using a queue, and compare the
performance of that algorithm to the ArrayList implementation
from this chapter.
FILO LIFO
FIFO
*/

import java.util.Scanner;

public class Josephus {
	/**
	 * Continue around the circle eliminating every nth soldier
	 * until all of the soldiers have been eliminated.
	 */
    public static void main(String[] args) {
        int gap, numPeople, counter, newGap;

        // initialize the queue
        QueueADT<Integer> q = new QueueADT<Integer>();
        Scanner in = new Scanner(System.in);
        
        // get the initial number of soldiers
     	System.out.println("Enter the number of soldiers: ");
     	numPeople = in.nextInt();
     	in.nextLine();
     		
     	// get the gap between soldiers
     	System.out.println("Enter the gap between soldiers: ");
     	gap = in.nextInt();
     		
        for(int i=1; i<=numPeople; i++)
            q.enqueue(i);

		System.out.println("The order is: ");
        
        while(!q.isEmpty()) {
            for(int i=0; i<gap-1; i++)
                q.enqueue(q.dequeue());
            System.out.print(q.dequeue() + " ");
        } 
        System.out.println();
    }
}

