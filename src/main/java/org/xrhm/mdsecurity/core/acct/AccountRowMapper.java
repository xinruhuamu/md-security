package org.xrhm.mdsecurity.core.acct;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author xinruhuamu
 * @description
 * @date 2020/7/17 03:04
 */
public class AccountRowMapper implements RowMapper<Account> {
    Account account = new Account();

    /**
     * @param resultSet
     * @param i
     * @return Account
     * @throws SQLException
     */
    @Override
    public Account mapRow(ResultSet resultSet, int i) throws SQLException {
        Account account = new Account();
        return null;
    }
}
