import java.util.*;

class Solution {
    public static int solution(int[] priorities, int location) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Deque<Integer> queue = new ArrayDeque<>();
        
        for (int i : priorities) {
            pq.offer(i);
            queue.offer(i);
        }


        int count = 0;
        while(true) {
            if (location == 0) {
                if (pq.peek() == queue.peek()) {
                    count++;

                    return count;
                } else {
                    pq.offer(pq.poll());
                    queue.offer(queue.poll());
                    
                    location = queue.size() - 1;
                }
            } else {
                if (pq.peek() == queue.peek()) {
                    count++;

                    pq.poll();
                    queue.poll();
                } else {
                    pq.offer(pq.poll());
                    queue.offer(queue.poll());
                }
                location--;
            }
        }
        
    }
}