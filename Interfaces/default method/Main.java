public class Main {
  public static void main(String[] args) {
    
        Bird Eagle = new Eagle();
        Eagle.canFly();
        // we can directly call default method 
        Eagle.getMinimumHeight();

        Bird sparrow = new Sparrow();
        sparrow.canFly();
        sparrow.getMinimumHeight();

        // Anoymous Inner class
        Bird obj = new Bird() {
            public void canFly(){
                System.out.println("Every Bird can fly");
            }
        };

        obj.canFly();
  }   
}
