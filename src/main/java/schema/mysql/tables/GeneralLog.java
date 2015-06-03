/**
 * This class is generated by jOOQ
 */
package schema.mysql.tables;

/**
 * General log
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.4"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GeneralLog extends org.jooq.impl.TableImpl<schema.mysql.tables.records.GeneralLogRecord> {

	private static final long serialVersionUID = 1159541695;

	/**
	 * The reference instance of <code>mysql.general_log</code>
	 */
	public static final schema.mysql.tables.GeneralLog GENERAL_LOG = new schema.mysql.tables.GeneralLog();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<schema.mysql.tables.records.GeneralLogRecord> getRecordType() {
		return schema.mysql.tables.records.GeneralLogRecord.class;
	}

	/**
	 * The column <code>mysql.general_log.event_time</code>.
	 */
	public final org.jooq.TableField<schema.mysql.tables.records.GeneralLogRecord, java.sql.Timestamp> EVENT_TIME = createField("event_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.general_log.user_host</code>.
	 */
	public final org.jooq.TableField<schema.mysql.tables.records.GeneralLogRecord, java.lang.String> USER_HOST = createField("user_host", org.jooq.impl.SQLDataType.CLOB.length(16777215).nullable(false), this, "");

	/**
	 * The column <code>mysql.general_log.thread_id</code>.
	 */
	public final org.jooq.TableField<schema.mysql.tables.records.GeneralLogRecord, java.lang.Integer> THREAD_ID = createField("thread_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>mysql.general_log.server_id</code>.
	 */
	public final org.jooq.TableField<schema.mysql.tables.records.GeneralLogRecord, org.jooq.types.UInteger> SERVER_ID = createField("server_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>mysql.general_log.command_type</code>.
	 */
	public final org.jooq.TableField<schema.mysql.tables.records.GeneralLogRecord, java.lang.String> COMMAND_TYPE = createField("command_type", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

	/**
	 * The column <code>mysql.general_log.argument</code>.
	 */
	public final org.jooq.TableField<schema.mysql.tables.records.GeneralLogRecord, java.lang.String> ARGUMENT = createField("argument", org.jooq.impl.SQLDataType.CLOB.length(16777215).nullable(false), this, "");

	/**
	 * Create a <code>mysql.general_log</code> table reference
	 */
	public GeneralLog() {
		this("general_log", null);
	}

	/**
	 * Create an aliased <code>mysql.general_log</code> table reference
	 */
	public GeneralLog(java.lang.String alias) {
		this(alias, schema.mysql.tables.GeneralLog.GENERAL_LOG);
	}

	private GeneralLog(java.lang.String alias, org.jooq.Table<schema.mysql.tables.records.GeneralLogRecord> aliased) {
		this(alias, aliased, null);
	}

	private GeneralLog(java.lang.String alias, org.jooq.Table<schema.mysql.tables.records.GeneralLogRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, schema.mysql.Mysql.MYSQL, aliased, parameters, "General log");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public schema.mysql.tables.GeneralLog as(java.lang.String alias) {
		return new schema.mysql.tables.GeneralLog(alias, this);
	}

	/**
	 * Rename this table
	 */
	public schema.mysql.tables.GeneralLog rename(java.lang.String name) {
		return new schema.mysql.tables.GeneralLog(name, null);
	}
}
