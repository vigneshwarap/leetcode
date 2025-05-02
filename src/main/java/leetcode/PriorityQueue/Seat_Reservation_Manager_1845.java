package leetcode.PriorityQueue;

import java.util.PriorityQueue;

//https://leetcode.com/problems/seat-reservation-manager/

public class Seat_Reservation_Manager_1845 {

    int seatCnt = 0;
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

//    public SeatManager(int n) {
//    }

    public int reserve() {
        if (!pq.isEmpty()){
            return pq.poll();
        } else {
            return ++seatCnt;
        }
    }

    public void unreserve(int seatNumber) {
        if (seatNumber == seatCnt) {
            --seatCnt;
        } else {
            pq.add(seatNumber);
        }
    }
}
