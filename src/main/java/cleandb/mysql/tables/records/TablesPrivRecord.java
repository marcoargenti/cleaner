/**
 * This class is generated by jOOQ
 */
package cleandb.mysql.tables.records;

/**
 * Table privileges
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.4"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TablesPrivRecord extends org.jooq.impl.UpdatableRecordImpl<cleandb.mysql.tables.records.TablesPrivRecord> implements org.jooq.Record8<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = 2123601368;

	/**
	 * Setter for <code>mysql.tables_priv.Host</code>.
	 */
	public void setHost(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mysql.tables_priv.Host</code>.
	 */
	public java.lang.String getHost() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>mysql.tables_priv.Db</code>.
	 */
	public void setDb(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mysql.tables_priv.Db</code>.
	 */
	public java.lang.String getDb() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>mysql.tables_priv.User</code>.
	 */
	public void setUser(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>mysql.tables_priv.User</code>.
	 */
	public java.lang.String getUser() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>mysql.tables_priv.Table_name</code>.
	 */
	public void setTableName(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>mysql.tables_priv.Table_name</code>.
	 */
	public java.lang.String getTableName() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>mysql.tables_priv.Grantor</code>.
	 */
	public void setGrantor(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>mysql.tables_priv.Grantor</code>.
	 */
	public java.lang.String getGrantor() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>mysql.tables_priv.Timestamp</code>.
	 */
	public void setTimestamp(java.sql.Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>mysql.tables_priv.Timestamp</code>.
	 */
	public java.sql.Timestamp getTimestamp() {
		return (java.sql.Timestamp) getValue(5);
	}

	/**
	 * Setter for <code>mysql.tables_priv.Table_priv</code>.
	 */
	public void setTablePriv(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>mysql.tables_priv.Table_priv</code>.
	 */
	public java.lang.String getTablePriv() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>mysql.tables_priv.Column_priv</code>.
	 */
	public void setColumnPriv(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>mysql.tables_priv.Column_priv</code>.
	 */
	public java.lang.String getColumnPriv() {
		return (java.lang.String) getValue(7);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record4<java.lang.String, java.lang.String, java.lang.String, java.lang.String> key() {
		return (org.jooq.Record4) super.key();
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return cleandb.mysql.tables.TablesPriv.TABLES_PRIV.HOST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return cleandb.mysql.tables.TablesPriv.TABLES_PRIV.DB;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return cleandb.mysql.tables.TablesPriv.TABLES_PRIV.USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return cleandb.mysql.tables.TablesPriv.TABLES_PRIV.TABLE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return cleandb.mysql.tables.TablesPriv.TABLES_PRIV.GRANTOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field6() {
		return cleandb.mysql.tables.TablesPriv.TABLES_PRIV.TIMESTAMP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return cleandb.mysql.tables.TablesPriv.TABLES_PRIV.TABLE_PRIV;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return cleandb.mysql.tables.TablesPriv.TABLES_PRIV.COLUMN_PRIV;
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
		return getGrantor();
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
		return getTablePriv();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getColumnPriv();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablesPrivRecord value1(java.lang.String value) {
		setHost(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablesPrivRecord value2(java.lang.String value) {
		setDb(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablesPrivRecord value3(java.lang.String value) {
		setUser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablesPrivRecord value4(java.lang.String value) {
		setTableName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablesPrivRecord value5(java.lang.String value) {
		setGrantor(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablesPrivRecord value6(java.sql.Timestamp value) {
		setTimestamp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablesPrivRecord value7(java.lang.String value) {
		setTablePriv(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablesPrivRecord value8(java.lang.String value) {
		setColumnPriv(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablesPrivRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.sql.Timestamp value6, java.lang.String value7, java.lang.String value8) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TablesPrivRecord
	 */
	public TablesPrivRecord() {
		super(cleandb.mysql.tables.TablesPriv.TABLES_PRIV);
	}

	/**
	 * Create a detached, initialised TablesPrivRecord
	 */
	public TablesPrivRecord(java.lang.String host, java.lang.String db, java.lang.String user, java.lang.String tableName, java.lang.String grantor, java.sql.Timestamp timestamp, java.lang.String tablePriv, java.lang.String columnPriv) {
		super(cleandb.mysql.tables.TablesPriv.TABLES_PRIV);

		setValue(0, host);
		setValue(1, db);
		setValue(2, user);
		setValue(3, tableName);
		setValue(4, grantor);
		setValue(5, timestamp);
		setValue(6, tablePriv);
		setValue(7, columnPriv);
	}
}
