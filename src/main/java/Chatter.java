public class Chatter {
    private static void greet() {
        System.out.println("-----------------------");
        System.out.println("Hello! I'm Chatter");
        System.out.println("What can I do for you?");
    }

    private static void exit() {
        System.out.println("-----------------------");
        System.out.println("Bye. Hope to see you again soon!");
    }

    public static void main(String[] args) {
        greet();
        exit();
    }
}
