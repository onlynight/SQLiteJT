package demo.dao;

import com.github.onlynight.sqlitejt.BaseDAO;
import com.github.onlynight.sqlitejt.SQLiteDataBase;
import demo.model.Monkey;

public class MonkeyDAO extends BaseDAO<Monkey> {

    public static final String TABLE_NAME = Monkey.class.getSimpleName();

    public MonkeyDAO(SQLiteDataBase database) {
        super(database, TABLE_NAME);
    }
}
