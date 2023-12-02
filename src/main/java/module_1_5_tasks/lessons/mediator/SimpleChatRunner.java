package module_1_5_tasks.lessons.mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin(chat, "admin");
        User user1 = new SimpleUser(chat, "Jou");
        User user2 = new SimpleUser(chat, "Doe");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("test mess 1");
        admin.sendMessage("mess admin");
    }
}
