package demo.dao;

import demo.model.Human;
import com.github.onlynight.sqlitejt.BaseDAO;
import com.github.onlynight.sqlitejt.SQLiteDataBase;

public class WomanDAO extends BaseDAO<Human> {

	public static final String TABLE_NAME = "Man";
	
	public WomanDAO(SQLiteDataBase database) {
		super(database, TABLE_NAME);
	}
}
