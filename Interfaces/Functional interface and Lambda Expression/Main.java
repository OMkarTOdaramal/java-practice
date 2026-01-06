public class Main {

    public static void main(String[] args) {

        // 1st way -> Using implements
        Bird eagleObj1 = new Eagle();
        eagleObj1.canFly("High");

        // 2nd way -> Using Anonymous class
        Bird eagleObj2 = new Bird() {

            @Override
            public void canFly(String value) {
                System.out.println("Eagle can fly in anonymous class");
            }
        };
        eagleObj2.canFly("High");

        // 3rd way -> Using Lambda Expression
        Bird eagleObj3 = (String value) -> {
            System.out.println("Eagle can fly in lambda expression");
        };
        eagleObj3.canFly("High");
    }
}