public class Main {
    
    public static void main(String[] args) {
        
        Consumer<Integer> obj = (Integer value) -> {
            if(value>10){
                System.out.println("Got it");
            }
        };
        obj.accept(12);
    }
}
