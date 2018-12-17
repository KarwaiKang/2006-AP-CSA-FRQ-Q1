import java.util.ArrayList;
import java.util.Arrays;

public class DailySchedule {
    /**
     * contains Appointment objects, no two Appointments overlap
     */
    private ArrayList<Appointment> apptList;

    public DailySchedule(Appointment... appointments) {
        apptList = new ArrayList<>(Arrays.asList(appointments));
    }

    public ArrayList<Appointment> getApptList() {
        return apptList;
    }

    /**
     * removes all appointments that overlap the given Appointment
     * postcondition: all appointments that have a time conflict with
     * appt have been removed from this DailySchedule
     *
     * @param appt the Appointment to test with
     */
    public void clearConflicts(Appointment appt) {
        for (int i = 0; i < this.apptList.size(); ) {
            if (this.apptList.get(i).conflictsWith(appt))
                apptList.remove(i);
            else
                i++;
        }
    }

    /**
     * if emergency is true, clears any overlapping appointments and adds
     * appt to this DailySchedule; otherwise, if there are no conflicting
     * appointments, adds appt to this DailySchedule
     *
     * @param appt      the Appointment to add
     * @param emergency whether it is an emergency or not
     * @return true if the appointment was added; otherwise, returns false
     */
    public boolean addAppt(Appointment appt, boolean emergency) {
        if (emergency)
            clearConflicts(appt);
        else {
            for (Appointment a : this.apptList) {
                if (a.conflictsWith(appt))
                    return false;
            }
        }
        this.apptList.add(appt);
        return true;
    }
}