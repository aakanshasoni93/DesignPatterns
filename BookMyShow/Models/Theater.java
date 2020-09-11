package BookMyShow.Models;
import java.util.List;
public class Theater {
    String name;
    List<Seats> seats;
    int capacity;

    public Theater(String name, List<Seats> seats, int capacity) {
        this.name = name;
        this.seats = seats;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public List<Seats> getSeats() {
        return seats;
    }

    public int getCapacity() {
        return capacity;
    }
}
