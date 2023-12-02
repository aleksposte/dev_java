package module_1_5_tasks.lessons.decorator;

public class Task {
    public static void main(String[] args) {
        Developer developer = new JavaDeveloper();
        Developer seniorDeveloper = new SeniorJavaDeveloper(new JavaDeveloper());
        Developer teamLead = new TeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));

        System.out.println(developer.makeJob());
        System.out.println(seniorDeveloper.makeJob());
        System.out.println(teamLead.makeJob());
    }
}
