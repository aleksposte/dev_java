package module_1_5_tasks.lessons.singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        System.out.println(ProgramLogger.getProgramLogger().toString());
        System.out.println(ProgramLogger.getProgramLogger().toString());
        System.out.println(ProgramLogger.getProgramLogger().toString());

        ProgramLogger.getProgramLogger().addLogInfo("first log...");
        ProgramLogger.getProgramLogger().addLogInfo("second log...");
        ProgramLogger.getProgramLogger().addLogInfo("third log...");
        ProgramLogger.getProgramLogger().addLogInfo("another log...");

        ProgramLogger.getProgramLogger().showLogInfo();
    }
}
