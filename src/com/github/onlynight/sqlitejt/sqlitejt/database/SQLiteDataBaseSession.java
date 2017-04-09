package com.github.onlynight.sqlitejt.sqlitejt.database;

import com.github.onlynight.sqlitejt.database.tools.PackageScanner;
import com.github.onlynight.sqlitejt.database.utils.TableModel;
import com.github.onlynight.sqlitejt.sqlitejt.table.SQLiteTableHelper;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * database session. it will help you to create a SQL which is use to create
 * table and drop table.
 * 
 * @author onlynight
 * 
 */
public class SQLiteDataBaseSession {

	private String databaseName;
	private Set<Class<?>> models;
	private Set<TableModel> tableModels;

	public SQLiteDataBaseSession(String databaseName, String packageToScan) {
		super();
		this.databaseName = databaseName;
		this.models = PackageScanner.scanForTable(packageToScan);
		this.tableModels = SQLiteTableHelper.getTableModels(models);
	}

	public SQLiteDataBaseSession(String databaseName, Class<?>[] classes) {
		super();
		this.databaseName = databaseName;
		this.models = new HashSet<Class<?>>();
		for (Class<?> clazz : classes) {
			models.add(clazz);
		}
		this.tableModels = SQLiteTableHelper.getTableModels(models);
	}

	public String isTableExist(String tablename) {
		String sql = "SELECT * FROM sqlite_master WHERE type='table' AND name='"
				+ tablename + "'";
		return sql;
	}

	public String getDatabaseName() {
		return databaseName;
	}

	public Set<Class<?>> getModels() {
		return models;
	}

	public Set<TableModel> getTableModels() {
		return tableModels;
	}

	public List<String> createTables() {
		return SQLiteTableHelper
				.createTables(models.toArray(new Class<?>[] {}));
	}

	public List<String> dropTables() {
		return SQLiteTableHelper.dropTables(models.toArray(new Class<?>[] {}));
	}
}
