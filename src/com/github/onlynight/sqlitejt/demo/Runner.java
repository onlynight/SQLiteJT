package com.github.onlynight.sqlitejt.demo;

import com.github.onlynight.sqlitejt.demo.dao.ManDAO;
import com.github.onlynight.sqlitejt.demo.database.DataBase;
import com.github.onlynight.sqlitejt.demo.model.Human;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        DataBase dataBase = new DataBase();
        ManDAO dao = new ManDAO(dataBase);
        insert(dao);
//		update(dao);
		select(dao);
//		delete(dao);
//		insert(dao);
//		count(dao);
        dataBase.close();
    }

    public static void insert(ManDAO dao) {
        Human man = new Human();
        man.setName("男");
        man.setPhone("18990140382");
        dao.insert(man);
    }

    public static void delete(ManDAO dao) {
        Human man = new Human();
        man.setId(1);
        dao.delete(man);
    }

    public static void update(ManDAO dao) {
        Human man = new Human();
        man.setId(1);
        man.setName("人类");
        man.setPhone("18990140382");
        dao.update(man);
    }

    public static void select(ManDAO dao) {
//		List<Human> res = dao.select( "name" , "���Ĵ�" );
        Human entity = new Human();
        entity.setId(2);
        List<Human> res = dao.select(entity);
        for (Human human : res) {
            System.out.println(human.getName());
        }
    }

    public static void count(ManDAO dao) {
        System.out.println(dao.count());
    }
}
