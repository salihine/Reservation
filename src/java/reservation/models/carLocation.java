package reservation.models;

import java.util.List;

/**
 * Created by t-jmba on 15-03-19.
 */
public class carLocation {

    private String origin;
    private String dest;
    private int pickMonth;
    private int pickDayOfMonth;
    private int pickDayOfWeek;
    private int departureTime;
    private int returnMonth;
    private int returnDayOfMonth;
    private int returnDayOfWeek;
    private int returnTime;
    private List<Car> results;

    public carLocation() {
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public int getPickMonth() {
        return pickMonth;
    }

    public void setPickMonth(int pickMonth) {
        this.pickMonth = pickMonth;
    }

    public int getPickDayOfMonth() {
        return pickDayOfMonth;
    }

    public void setPickDayOfMonth(int pickDayOfMonth) {
        this.pickDayOfMonth = pickDayOfMonth;
    }

    public int getPickDayOfWeek() {
        return pickDayOfWeek;
    }

    public void setPickDayOfWeek(int pickDayOfWeek) {
        this.pickDayOfWeek = pickDayOfWeek;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    public int getReturnMonth() {
        return returnMonth;
    }

    public void setReturnMonth(int returnMonth) {
        this.returnMonth = returnMonth;
    }

    public int getReturnDayOfMonth() {
        return returnDayOfMonth;
    }

    public void setReturnDayOfMonth(int returnDayOfMonth) {
        this.returnDayOfMonth = returnDayOfMonth;
    }

    public int getReturnDayOfWeek() {
        return returnDayOfWeek;
    }

    public void setReturnDayOfWeek(int returnDayOfWeek) {
        this.returnDayOfWeek = returnDayOfWeek;
    }

    public int getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(int returnTime) {
        this.returnTime = returnTime;
    }

    public List<Car> getResults() {
        return results;
    }
}
