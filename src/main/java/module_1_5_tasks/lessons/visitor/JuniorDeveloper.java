package module_1_5_tasks.lessons.visitor;

public class JuniorDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("writing poor class...");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("drop DB...");
    }

    @Override
    public void create(Test test) {
        System.out.println("creating not reliable test...");
    }
}
