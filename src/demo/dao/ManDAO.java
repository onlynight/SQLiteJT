package demo.dao;

import com.github.onlynight.sqlitejt.BaseDAO;
import com.github.onlynight.sqlitejt.SQLiteDataBase;
import demo.model.Human;

public class ManDAO extends BaseDAO<Human> {

    public static final String TABLE_NAME = "Man";

    public ManDAO(SQLiteDataBase database) {
        super(database, TABLE_NAME);
    }

}
