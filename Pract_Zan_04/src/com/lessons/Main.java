package com.lessons;

import java.util.concurrent.ThreadLocalRandom;

class Queue {
    public int[] queue;
    public int size, head;

    Queue() {
        size = 0;
        head = 0;
    }

    void Put(int e) {
        if (head >= size) {
            int[] newQueue = new int[size * 2 + 1];
            if (queue != null) System.arraycopy(queue, 0, newQueue, 0, size);
            queue = newQueue;
            size = size * 2 + 1;
        }
        queue[head++] = e;
    }

    int Get() {
        if (size == 0) throw new RuntimeException("Очередь пуста");
        int temp = queue[0];
        for (int i = 1; i < head; i++)
            queue[i - 1] = queue[i];
        head--;

        if (head <= size/4) {
            size /= 2;
            int[] newQueue = new int[size];
            System.arraycopy(queue, 0, newQueue, 0, size);
            queue = newQueue;
        }

        return temp;
    }

    int[] GetAll() {
        int[] array = new int[head];
        System.arraycopy(queue, 0, array, 0, head);
        return array;
    }

    void Sort() {
        for (int i = 0; i < head - 1; i++)
            for (int j = 0; j < head - i - 1; j++)
                if (queue[j] > queue[j + 1]) {
                    int temp = queue[j];
                    queue[j] = queue[j + 1];
                    queue[j + 1] = temp;
                }
    }

    void Print() {
        System.out.print("[");
        for (int i = 0; i < head; i++)
            System.out.print(queue[i] + ", ");
        System.out.println("]");
    }
}

public class Main {

    public static void main(String[] args) {
	    Queue q = new Queue();
	    for (int i = 0; i < 10; i++)
	        q.Put(ThreadLocalRandom.current().nextInt(0, 40));
	    q.Sort();

	    int temp = q.queue[0];
	    q.queue[0] = q.queue[q.head - 1];
        q.queue[q.head - 1] = temp;

        q.Print();
    }
}
