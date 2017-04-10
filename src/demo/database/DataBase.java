package demo.database;


import com.github.onlynight.sqlitejt.SQLiteDataBase;

public class DataBase extends SQLiteDataBase {

    public static final String DB_NAME = "D://demo.sqlite";
    /**
     * the package to scan the model
     */
    private static final String PACKAGE_TO_SCAN = "demo.model";

    public DataBase() {
        super(DB_NAME, PACKAGE_TO_SCAN);
    }

}
