package Librarys;

public class Author extends Person {
    private static int idIncrementer = 0;

    public Author(int id, String name) {
        super(id, name);
        idIncrementer++;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getId() {
        return super.getId();
    }

}

