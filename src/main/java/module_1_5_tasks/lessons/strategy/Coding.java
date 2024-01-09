package module_1_5_tasks.lessons.strategy;

import module_1_5_tasks.lessons.state.Activity;

public class Coding implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("coding...");
    }
}
