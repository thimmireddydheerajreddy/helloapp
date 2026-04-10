public class HelloApp {
    public static void main(String[] args) {
        String name = "World";

        StringBuilder nameBuilder = new StringBuilder();
        boolean first = true;
        for (String arg : args) {
            if(!first){
                nameBuilder.append(", ");
            }
            nameBuilder.append(arg);
            first = false;
            name = nameBuilder.toString();
        }

        System.out.println("Hello, " + name + "!");
    }
}
