package BookMyShow.Models;

public class Seats {
    SeatType s;
    int price;

    public Seats(SeatType st, int price) {
        this.s=st;
        this.price=price;
    }
}
