package com.github.onlynight.sqlitejt.demo.dao;

import com.github.onlynight.sqlitejt.demo.model.Human;
import org.lion.sqlite.BasicDAO;
import org.lion.sqlite.SQLiteDataBase;

public class WomanDAO extends BasicDAO<Human>{

	public static final String TABLE_NAME = "Man";
	
	public WomanDAO(SQLiteDataBase database) {
		super(database, TABLE_NAME);
	}
}
