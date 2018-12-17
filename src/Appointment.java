public class Appointment {
    private TimeInterval timeInterval;

    public Appointment(int start, int end) {
        this.timeInterval = new TimeInterval(start, end);
    }
    /**
     * @return the time interval of this Appointment
     */
    public TimeInterval getTime() {
        return this.timeInterval;
    }

    /**
     * @param other the Appointment to test with
     * @return true if the time interval of this Appointment
     * overlaps with the time interval of other;
     * otherwise, returns false
     */
    public boolean conflictsWith(Appointment other) {
        return this.getTime().overlapsWith(other.getTime());
    }

    public String toString() {
        return this.timeInterval.toString();
    }
}