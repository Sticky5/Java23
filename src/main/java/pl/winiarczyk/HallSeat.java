package pl.winiarczyk;

public class HallSeat {

    private final int seatNumber;
    private final int rowNumber;
    private boolean isTaken;

    protected HallSeat(int seatNumber, int rowNumber, boolean busy) {
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
        this.isTaken = busy;
    }

    public int getSeatNumber(int i) {
        return seatNumber;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public boolean isTaken() {
        return isTaken;
    }

    public void setTaken(boolean taken) {
        this.isTaken = taken;
    }
}
