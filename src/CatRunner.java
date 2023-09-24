public class CatRunner {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Cat", 3, 5.2);
        cat1.printCatInfo();
        cat1.introduce();

        Cat cat2 = new Cat("Table", 5, 7.8);
        cat2.introduce();
        cat2.printCatInfo();

    }
}
