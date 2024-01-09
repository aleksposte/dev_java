package module_1_5_tasks.lessons.strategy;

import module_1_5_tasks.lessons.state.Activity;

public class Developer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity () {
        activity.justDoIt();
    }
}
