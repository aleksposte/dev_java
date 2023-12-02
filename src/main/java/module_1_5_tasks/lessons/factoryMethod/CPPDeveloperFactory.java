package module_1_5_tasks.lessons.factoryMethod;

public class CPPDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new CPPDev();
    }
}
