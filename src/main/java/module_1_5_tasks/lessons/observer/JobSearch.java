package module_1_5_tasks.lessons.observer;

import module_1_5_tasks.lessons.factoryMethod.JavaDev;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java Position");
        jobSite.addVacancy("Second Java Position");

        Observer firstSubscriber = new Subscriber("First writer");
        Observer secondSubscriber = new Subscriber("Second writer");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Third Position");

        jobSite.removeVacancy("First Java Position");
    }
}
