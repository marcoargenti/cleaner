/**
 * This class is generated by jOOQ
 */
package cleandb.mysql.tables;

/**
 * Procedure privileges
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.4"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProcsPriv extends org.jooq.impl.TableImpl<cleandb.mysql.tables.records.ProcsPrivRecord> {

	private static final long serialVersionUID = -1697768292;

	/**
	 * The reference instance of <code>mysql.procs_priv</code>
	 */
	public static final cleandb.mysql.tables.ProcsPriv PROCS_PRIV = new cleandb.mysql.tables.ProcsPriv();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<cleandb.mysql.tables.records.ProcsPrivRecord> getRecordType() {
		return cleandb.mysql.tables.records.ProcsPrivRecord.class;
	}

	/**
	 * The column <code>mysql.procs_priv.Host</code>.
	 */
	public final org.jooq.TableField<cleandb.mysql.tables.records.ProcsPrivRecord, java.lang.String> HOST = createField("Host", org.jooq.impl.SQLDataType.CHAR.length(60).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.procs_priv.Db</code>.
	 */
	public final org.jooq.TableField<cleandb.mysql.tables.records.ProcsPrivRecord, java.lang.String> DB = createField("Db", org.jooq.impl.SQLDataType.CHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.procs_priv.User</code>.
	 */
	public final org.jooq.TableField<cleandb.mysql.tables.records.ProcsPrivRecord, java.lang.String> USER = createField("User", org.jooq.impl.SQLDataType.CHAR.length(16).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.procs_priv.Routine_name</code>.
	 */
	public final org.jooq.TableField<cleandb.mysql.tables.records.ProcsPrivRecord, java.lang.String> ROUTINE_NAME = createField("Routine_name", org.jooq.impl.SQLDataType.CHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.procs_priv.Routine_type</code>.
	 */
	public final org.jooq.TableField<cleandb.mysql.tables.records.ProcsPrivRecord, cleandb.mysql.enums.ProcsPrivRoutineType> ROUTINE_TYPE = createField("Routine_type", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(cleandb.mysql.enums.ProcsPrivRoutineType.class), this, "");

	/**
	 * The column <code>mysql.procs_priv.Grantor</code>.
	 */
	public final org.jooq.TableField<cleandb.mysql.tables.records.ProcsPrivRecord, java.lang.String> GRANTOR = createField("Grantor", org.jooq.impl.SQLDataType.CHAR.length(77).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.procs_priv.Proc_priv</code>.
	 */
	public final org.jooq.TableField<cleandb.mysql.tables.records.ProcsPrivRecord, java.lang.String> PROC_PRIV = createField("Proc_priv", org.jooq.impl.SQLDataType.VARCHAR.length(27).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.procs_priv.Timestamp</code>.
	 */
	public final org.jooq.TableField<cleandb.mysql.tables.records.ProcsPrivRecord, java.sql.Timestamp> TIMESTAMP = createField("Timestamp", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>mysql.procs_priv</code> table reference
	 */
	public ProcsPriv() {
		this("procs_priv", null);
	}

	/**
	 * Create an aliased <code>mysql.procs_priv</code> table reference
	 */
	public ProcsPriv(java.lang.String alias) {
		this(alias, cleandb.mysql.tables.ProcsPriv.PROCS_PRIV);
	}

	private ProcsPriv(java.lang.String alias, org.jooq.Table<cleandb.mysql.tables.records.ProcsPrivRecord> aliased) {
		this(alias, aliased, null);
	}

	private ProcsPriv(java.lang.String alias, org.jooq.Table<cleandb.mysql.tables.records.ProcsPrivRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, cleandb.mysql.Mysql.MYSQL, aliased, parameters, "Procedure privileges");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<cleandb.mysql.tables.records.ProcsPrivRecord> getPrimaryKey() {
		return cleandb.mysql.Keys.KEY_PROCS_PRIV_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<cleandb.mysql.tables.records.ProcsPrivRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<cleandb.mysql.tables.records.ProcsPrivRecord>>asList(cleandb.mysql.Keys.KEY_PROCS_PRIV_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public cleandb.mysql.tables.ProcsPriv as(java.lang.String alias) {
		return new cleandb.mysql.tables.ProcsPriv(alias, this);
	}

	/**
	 * Rename this table
	 */
	public cleandb.mysql.tables.ProcsPriv rename(java.lang.String name) {
		return new cleandb.mysql.tables.ProcsPriv(name, null);
	}
}
