package demo.dao;

import com.github.onlynight.sqlitejt.sqlite.BasicDAO;
import com.github.onlynight.sqlitejt.sqlite.SQLiteDataBase;
import demo.model.Monkey;

public class MonkeyDAO extends BasicDAO<Monkey> {

    public static final String TABLE_NAME = Monkey.class.getSimpleName();

    public MonkeyDAO(SQLiteDataBase database) {
        super(database, TABLE_NAME);
    }
}
