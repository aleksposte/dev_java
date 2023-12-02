package module_1_5_tasks.lessons.iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = { "java", "spring", "hibernate", "Maven" };

        JavaDeveloper javaDeveloper = new JavaDeveloper("John Doe", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString() + " ");
        }
    }
}
