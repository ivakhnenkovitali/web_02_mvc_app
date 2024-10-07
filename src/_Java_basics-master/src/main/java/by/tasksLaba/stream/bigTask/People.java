package by.tasksLaba.stream.bigTask;

import java.util.List;

public class People {
    private int id;
    private String name;
    private List<Flat> flats;

    public People() {
    }

    public People(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addFlat(Flat flat){
        flats.add(flat);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Flat> getFlats() {
        return flats;
    }

    public void setFlats(List<Flat> flats) {
        this.flats = flats;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("People{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", flats=").append(flats);
        sb.append('}');
        return sb.toString();
    }
}
