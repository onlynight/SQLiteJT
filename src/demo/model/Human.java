package demo.model;

import com.github.onlynight.sqlite.table.annotation.Column;
import com.github.onlynight.sqlite.table.annotation.Table;
import com.github.onlynight.sqlite.table.annotation.Tables;
import demo.dao.ManDAO;
import demo.dao.WomanDAO;

/**
 * support one class to multi tables
 *
 * @author lion
 */
@Tables({@Table(ManDAO.TABLE_NAME), @Table(WomanDAO.TABLE_NAME)})
public class Human extends Animal {

    @Column(notnull = true)
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return getName() + " " + getId() + " " + getDetails() + " " + getPhone();
    }
}
