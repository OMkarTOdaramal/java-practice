public class Main {
    public static void main(String[] args) {
        
        Print<Integer> obj = new Print<>();
        obj.setValue(10);
        System.out.println(obj.getValue());

        Integer printValue = obj.getValue();
        if(10 == printValue){
            System.out.println("Both are equal");
        }
    }
}
