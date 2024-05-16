public class FcfsScheduling
{
	//Implement FCFS disk scheduling algorithm
	public void fcfs_disk_scheduling(int[] queue, int head, int n)
	{
		//Resultant variable which are used to store information of number of time or operation
		double seek_time = 0.0;
		int distance = 0;
		// Loop controlling variable
		int i = 0;
		System.out.print("\n Starting Head : " + head);
		System.out.print("\n Queue Sequence : ");
		//Display given queue elements
		for (i = 0; i < n; i++)
		{
			System.out.print(" " + queue[i] + "");
		}
		for (i = 0; i < n; i++)
		{
			//Get distance 
			distance = queue[i] - head;
			if (distance < 0)
			{
				//When distance is negative then convert into it absolute value
				distance = -distance;
			}
			// Update head data into current track value
			head = queue[i];
			// Add current distance into seek
			seek_time += distance;
		}
		//Display result
		System.out.print("\n Total Seek Time : " + seek_time);
		System.out.print("\n Average Seek Time : " + seek_time / n + "\n");
	}
	public static void main(String args[])
	{
		FcfsScheduling obj = new FcfsScheduling();
		// Request queue elements
		int[] queue = {	64,12,42,19,62,32,16,86};
		//Get the number of elements in request queue
		int n = queue.length;
		//Initial head position
		int head = 25;
		obj.fcfs_disk_scheduling(queue, head, n);
	}
}