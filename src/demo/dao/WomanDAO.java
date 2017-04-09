package demo.dao;

import demo.model.Human;
import com.github.onlynight.sqlitejt.sqlite.BasicDAO;
import com.github.onlynight.sqlitejt.sqlite.SQLiteDataBase;

public class WomanDAO extends BasicDAO<Human>{

	public static final String TABLE_NAME = "Man";
	
	public WomanDAO(SQLiteDataBase database) {
		super(database, TABLE_NAME);
	}
}
