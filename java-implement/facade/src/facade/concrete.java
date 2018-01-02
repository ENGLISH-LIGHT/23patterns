package facade;

public class concrete implements facade {
    @Override
    public void function12() {
        function1 f1 = new function1();
        function2 f2 = new function2();
        f1.function();
        f2.function();
    }

    @Override
    public void function23() {
        function2 f2 = new function2();
        function3 f3 = new function3();
        f2.function();
        f3.function();
    }

    @Override
    public void function123() {
        function1 f1 = new function1();
        function2 f2 = new function2();
        function3 f3 = new function3();
        f1.function();
        f2.function();
        f3.function();
    }
}
