public class Runner {
    public static void main(String[] args) {
        DailySchedule dailySchedule = new DailySchedule(
                new Appointment(1, 2),
                new Appointment(2, 3),
                new Appointment(3, 4),
                new Appointment(4, 5),
                new Appointment(5, 6)
        );

        System.out.println(dailySchedule.getApptList());

        // Although it is not an emergency,
        // the time interval does not conflict so it can be added.
        System.out.println(dailySchedule.addAppt(
                new Appointment(6, 7), false
        )); // → true

        System.out.println(dailySchedule.getApptList());

        // Because it is not an emergency and the time interval conflicts,
        // the time interval does not get added.
        System.out.println(dailySchedule.addAppt(
                new Appointment(1, 3), false
        )); // → false

        System.out.println(dailySchedule.getApptList());

        // When it is an emergency, the time interval is added regardless of conflicts,
        // and removes the time intervals that conflict if any.
        System.out.println(dailySchedule.addAppt(
                new Appointment(2, 5), true
        )); // → true

        System.out.println(dailySchedule.getApptList());
    }
}
