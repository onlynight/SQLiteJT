package com.github.onlynight.sqlitejt.demo.model;

import org.lion.database.annotation.Table;

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
