/**
 * This class is generated by jOOQ
 */
package cleandb.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.4"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Processlist extends org.jooq.impl.TableImpl<cleandb.information_schema.tables.records.ProcesslistRecord> {

	private static final long serialVersionUID = -1015695798;

	/**
	 * The reference instance of <code>information_schema.PROCESSLIST</code>
	 */
	public static final cleandb.information_schema.tables.Processlist PROCESSLIST = new cleandb.information_schema.tables.Processlist();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<cleandb.information_schema.tables.records.ProcesslistRecord> getRecordType() {
		return cleandb.information_schema.tables.records.ProcesslistRecord.class;
	}

	/**
	 * The column <code>information_schema.PROCESSLIST.ID</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.ProcesslistRecord, java.lang.Long> ID = createField("ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.PROCESSLIST.USER</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.ProcesslistRecord, java.lang.String> USER = createField("USER", org.jooq.impl.SQLDataType.VARCHAR.length(16).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.PROCESSLIST.HOST</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.ProcesslistRecord, java.lang.String> HOST = createField("HOST", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.PROCESSLIST.DB</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.ProcesslistRecord, java.lang.String> DB = createField("DB", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>information_schema.PROCESSLIST.COMMAND</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.ProcesslistRecord, java.lang.String> COMMAND = createField("COMMAND", org.jooq.impl.SQLDataType.VARCHAR.length(16).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.PROCESSLIST.TIME</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.ProcesslistRecord, java.lang.Integer> TIME = createField("TIME", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.PROCESSLIST.STATE</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.ProcesslistRecord, java.lang.String> STATE = createField("STATE", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>information_schema.PROCESSLIST.INFO</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.ProcesslistRecord, java.lang.String> INFO = createField("INFO", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * Create a <code>information_schema.PROCESSLIST</code> table reference
	 */
	public Processlist() {
		this("PROCESSLIST", null);
	}

	/**
	 * Create an aliased <code>information_schema.PROCESSLIST</code> table reference
	 */
	public Processlist(java.lang.String alias) {
		this(alias, cleandb.information_schema.tables.Processlist.PROCESSLIST);
	}

	private Processlist(java.lang.String alias, org.jooq.Table<cleandb.information_schema.tables.records.ProcesslistRecord> aliased) {
		this(alias, aliased, null);
	}

	private Processlist(java.lang.String alias, org.jooq.Table<cleandb.information_schema.tables.records.ProcesslistRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, cleandb.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public cleandb.information_schema.tables.Processlist as(java.lang.String alias) {
		return new cleandb.information_schema.tables.Processlist(alias, this);
	}

	/**
	 * Rename this table
	 */
	public cleandb.information_schema.tables.Processlist rename(java.lang.String name) {
		return new cleandb.information_schema.tables.Processlist(name, null);
	}
}
