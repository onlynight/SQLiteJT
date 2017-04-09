package demo.model;

import com.github.onlynight.sqlitejt.database.annotation.Table;

@Table
public class Monkey extends Animal {

    private String monkey;

    public String getMonkey() {
        return monkey;
    }

    public void setMonkey(String monkey) {
        this.monkey = monkey;
    }

}
