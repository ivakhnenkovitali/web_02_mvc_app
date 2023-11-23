package by.IT.model.entity.dibi;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class User {
    private int id;
    private String fio;
    private String email;
}
