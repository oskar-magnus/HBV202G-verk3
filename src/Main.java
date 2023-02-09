package is.hi.omh7.hbv202g.ass3.frontend;

public class Main {

    public static void main(String[] args) {
        is.hi.omh7.hbv202g.ass3.backend.Greeter greeter = new is.hi.omh7.hbv202g.ass3.backend.Greeter();
        greeter.setEnglish();
        System.out.println(greeter.greet());
        greeter.setGerman();
        System.out.println(greeter.greet());
    }

}
