package lesson10.task;

import java.util.Arrays;

public class WeekPlannerMain {
    public static void main(String[] args) {
        String[][] schedule = new WeekPlanner().getSchedule();
        System.out.println(Arrays.deepToString(schedule));
        new WeekPlanner().setGoals(schedule);
        System.out.println(Arrays.deepToString(schedule));
        new WeekPlanner().workWithSchedule(schedule);
    }
}
