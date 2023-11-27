package by.IT.model.entity.dibi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DbInMemory {
    private static List<User> users = new ArrayList<>();

    static {

        users.add(new User(1, "Vasia Pum", "vasia.pum@gmail.com"));
        users.add(new User(1, "Ivan Ivanov", "ivan.vano@gmail.com"));
        users.add(new User(1, "Petr Petrov", "petruha25@gmail.com"));


    }


    public static User findUserByName(String name) {
        return users.stream()
                .filter(it -> it.getFio().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public static List<User> findUsersByIds(int from, int to) {
        return users.stream()
                .filter(it -> it.getId() >= from && it.getId() <= to)
                .collect(Collectors.toList());

    }
}

