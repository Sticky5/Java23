package pl.winiarczyk;

public class Hall {

    final int seatNumber;
    final int rowNumber;
    boolean busy;

    protected Hall(int seatNumber, int rowNumber, boolean busy) {
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
        this.busy = busy;
    }
}
