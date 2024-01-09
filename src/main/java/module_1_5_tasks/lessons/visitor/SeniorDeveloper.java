package module_1_5_tasks.lessons.visitor;

public class SeniorDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("rewriting class after junior...");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("fixing DB...");
    }

    @Override
    public void create(Test test) {
        System.out.println("creating reliable test...");
    }
}
