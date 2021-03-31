public class Book {

    public String name;


    public Book(String userProvidedName) {
        this.name = userProvidedName;
    }

    @Override
    public String toString() {
        return "This books name is " + name;
    }
}
