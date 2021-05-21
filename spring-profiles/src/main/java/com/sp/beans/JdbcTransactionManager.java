package com.sp.beans;

// no source code
public class JdbcTransactionManager {
	private int timeout;
	private boolean autocommit;
	private JdbcDataSource jdbcDataSource;

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	public void setAutocommit(boolean autocommit) {
		this.autocommit = autocommit;
	}

	public void setJdbcDataSource(JdbcDataSource jdbcDataSource) {
		this.jdbcDataSource = jdbcDataSource;
	}

	@Override
	public String toString() {
		return "JdbcTransactionManager [timeout=" + timeout + ", autocommit=" + autocommit + ", jdbcDataSource="
				+ jdbcDataSource + "]";
	}

}
