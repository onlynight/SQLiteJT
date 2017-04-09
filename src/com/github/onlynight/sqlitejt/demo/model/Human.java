package com.github.onlynight.sqlitejt.demo.model;

import com.github.onlynight.sqlitejt.demo.dao.ManDAO;
import com.github.onlynight.sqlitejt.demo.dao.WomanDAO;
import org.lion.database.annotation.Column;
import org.lion.database.annotation.Table;
import org.lion.database.annotation.Tables;

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
}
