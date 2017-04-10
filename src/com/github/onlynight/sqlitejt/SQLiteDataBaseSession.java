package com.github.onlynight.sqlitejt;

import com.github.onlynight.sqlite.database.BaseSQLiteDataBaseSession;

import java.util.Set;

/**
 * database session. it will help you to create a SQL which is use to create
 * table and drop table.
 *
 * @author onlynight
 */
public class SQLiteDataBaseSession extends BaseSQLiteDataBaseSession {

    public SQLiteDataBaseSession(String databaseName, String packageToScan) {
        super(databaseName, null);
        Set<Class<?>> models = PackageScanner.scanForTable(packageToScan);
        setAllModels(models.toArray(new Class<?>[]{}));
    }

    public SQLiteDataBaseSession(String databaseName, Class<?>[] classes) {
        super(databaseName, classes);
    }
}
