package com.github.onlynight.sqlitejt.demo.database;

import org.lion.sqlite.SQLiteDataBase;

public class DataBase extends SQLiteDataBase{

	public static final String DB_NAME = "D://demo.sqlite";
	/**
	 * the package to scan the model
	 */
	private static final String PACKAGE_TO_SCAN = "com.github.onlynight.sqlitejt.demo.model";
	
	public DataBase() {
		super(DB_NAME, PACKAGE_TO_SCAN);
	}
	
}
