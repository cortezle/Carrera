package patterns.creational.factory.dogs;

class Rottweiler implements Dog {
    @Override
    public void speak() {
        System.out.println("The Rottweiler says (in a very deep voice) \"WOOF!\"");
    }
}