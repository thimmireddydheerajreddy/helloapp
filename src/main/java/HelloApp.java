public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        StringBuilder nameBuilder = new StringBuilder();
        
        for (String arg : args) {
            nameBuilder.append(arg).append(", ");
        }

        String names = "";
        if (nameBuilder.length() > 0) {
            names = nameBuilder.substring(0, nameBuilder.length() - 2);
        }

        System.out.println("Hello, " + names + "!");
    }
}
