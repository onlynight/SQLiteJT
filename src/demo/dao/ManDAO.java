package demo.dao;

import com.github.onlynight.sqlitejt.BasicDAO;
import com.github.onlynight.sqlitejt.SQLiteDataBase;
import demo.model.Human;

public class ManDAO extends BasicDAO<Human> {

    public static final String TABLE_NAME = "Man";

    public ManDAO(SQLiteDataBase database) {
        super(database, TABLE_NAME);
    }

}
