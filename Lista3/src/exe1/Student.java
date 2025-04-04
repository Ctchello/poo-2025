package exe1;

public class Studant {
    private int id;
    private String name;

    public Studant(String name, int id) {
        this.setName(name);
        this.setId(id);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Studant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
