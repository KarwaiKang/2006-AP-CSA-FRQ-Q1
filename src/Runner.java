public class Runner {
    public static void main(String[] args) {
        DailySchedule dailySchedule = new DailySchedule(
                new Appointment(new TimeInterval(1, 2)),
                new Appointment(new TimeInterval(2, 3)),
                new Appointment(new TimeInterval(3, 4))
        );

        System.out.println(dailySchedule.getApptList());

        Appointment appointment = new Appointment(new TimeInterval(1, 1));

        dailySchedule.clearConflicts(appointment);

        System.out.println(dailySchedule.getApptList());
    }
}
