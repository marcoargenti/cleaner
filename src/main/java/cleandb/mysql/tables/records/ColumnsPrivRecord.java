/**
 * This class is generated by jOOQ
 */
package cleandb.mysql.tables.records;

/**
 * Column privileges
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.4"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ColumnsPrivRecord extends org.jooq.impl.UpdatableRecordImpl<cleandb.mysql.tables.records.ColumnsPrivRecord> implements org.jooq.Record7<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.String> {

	private static final long serialVersionUID = -451678455;

	/**
	 * Setter for <code>mysql.columns_priv.Host</code>.
	 */
	public void setHost(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mysql.columns_priv.Host</code>.
	 */
	public java.lang.String getHost() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>mysql.columns_priv.Db</code>.
	 */
	public void setDb(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mysql.columns_priv.Db</code>.
	 */
	public java.lang.String getDb() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>mysql.columns_priv.User</code>.
	 */
	public void setUser(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>mysql.columns_priv.User</code>.
	 */
	public java.lang.String getUser() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>mysql.columns_priv.Table_name</code>.
	 */
	public void setTableName(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>mysql.columns_priv.Table_name</code>.
	 */
	public java.lang.String getTableName() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>mysql.columns_priv.Column_name</code>.
	 */
	public void setColumnName(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>mysql.columns_priv.Column_name</code>.
	 */
	public java.lang.String getColumnName() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>mysql.columns_priv.Timestamp</code>.
	 */
	public void setTimestamp(java.sql.Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>mysql.columns_priv.Timestamp</code>.
	 */
	public java.sql.Timestamp getTimestamp() {
		return (java.sql.Timestamp) getValue(5);
	}

	/**
	 * Setter for <code>mysql.columns_priv.Column_priv</code>.
	 */
	public void setColumnPriv(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>mysql.columns_priv.Column_priv</code>.
	 */
	public java.lang.String getColumnPriv() {
		return (java.lang.String) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record5<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> key() {
		return (org.jooq.Record5) super.key();
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.String> fieldsRow() {
		return (org.jooq.Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.String> valuesRow() {
		return (org.jooq.Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return cleandb.mysql.tables.ColumnsPriv.COLUMNS_PRIV.HOST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return cleandb.mysql.tables.ColumnsPriv.COLUMNS_PRIV.DB;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return cleandb.mysql.tables.ColumnsPriv.COLUMNS_PRIV.USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return cleandb.mysql.tables.ColumnsPriv.COLUMNS_PRIV.TABLE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return cleandb.mysql.tables.ColumnsPriv.COLUMNS_PRIV.COLUMN_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field6() {
		return cleandb.mysql.tables.ColumnsPriv.COLUMNS_PRIV.TIMESTAMP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return cleandb.mysql.tables.ColumnsPriv.COLUMNS_PRIV.COLUMN_PRIV;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getHost();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getDb();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getUser();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getTableName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getColumnName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value6() {
		return getTimestamp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getColumnPriv();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsPrivRecord value1(java.lang.String value) {
		setHost(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsPrivRecord value2(java.lang.String value) {
		setDb(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsPrivRecord value3(java.lang.String value) {
		setUser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsPrivRecord value4(java.lang.String value) {
		setTableName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsPrivRecord value5(java.lang.String value) {
		setColumnName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsPrivRecord value6(java.sql.Timestamp value) {
		setTimestamp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsPrivRecord value7(java.lang.String value) {
		setColumnPriv(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsPrivRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.sql.Timestamp value6, java.lang.String value7) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ColumnsPrivRecord
	 */
	public ColumnsPrivRecord() {
		super(cleandb.mysql.tables.ColumnsPriv.COLUMNS_PRIV);
	}

	/**
	 * Create a detached, initialised ColumnsPrivRecord
	 */
	public ColumnsPrivRecord(java.lang.String host, java.lang.String db, java.lang.String user, java.lang.String tableName, java.lang.String columnName, java.sql.Timestamp timestamp, java.lang.String columnPriv) {
		super(cleandb.mysql.tables.ColumnsPriv.COLUMNS_PRIV);

		setValue(0, host);
		setValue(1, db);
		setValue(2, user);
		setValue(3, tableName);
		setValue(4, columnName);
		setValue(5, timestamp);
		setValue(6, columnPriv);
	}
}
