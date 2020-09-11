package BookMyShow.services;

import BookMyShow.Models.SeatType;
import BookMyShow.Models.Seats;
import BookMyShow.Models.Theater;

import java.util.ArrayList;
import java.util.HashMap;

public class TheaterManager {
    HashMap<String, Theater> theaterHashMap;
    TheaterManager(){
        ArrayList<Seats> seats= new ArrayList<>();
        Theater inox= new Theater("inox", seats,10);
        int capacity = inox.getCapacity();
        for(int i=0;i<capacity;i++){
            if(i<capacity/2){
                seats.add(new Seats(SeatType.NORMAL,50));
            }
            else{
                seats.add(new Seats(SeatType.PREMIMUM,100));
            }
        }
    }
}
