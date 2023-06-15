public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        SecondClass newObject = new SecondClass();
        newObject.printValue(newObject.number);
        System.out.println("~~~ <" + newObject.number + "> ~~~");

    }
}


class SecondClass {
    int number = 27;

    int printValue (int value) {
        System.out.println("---<" + value + ">---");
        return value;
    }
}