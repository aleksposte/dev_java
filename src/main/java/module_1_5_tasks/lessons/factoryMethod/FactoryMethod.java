package module_1_5_tasks.lessons.factoryMethod;

public class FactoryMethod {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty("c++");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("c++")) {
            return new CPPDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + "is unknown");
        }
    }
}
