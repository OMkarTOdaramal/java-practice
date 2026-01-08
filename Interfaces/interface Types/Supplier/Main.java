public class Main {
 
    public static void main(String[] args) {
        
        Supplier<String> obj = () -> {
             return "I am returning this";
        };
        System.out.println(obj.Supply());
    }
}
