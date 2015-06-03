/**
 * This class is generated by jOOQ
 */
package schema.mysql.tables;

/**
 * Slow log
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.4"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SlowLog extends org.jooq.impl.TableImpl<schema.mysql.tables.records.SlowLogRecord> {

	private static final long serialVersionUID = 272570661;

	/**
	 * The reference instance of <code>mysql.slow_log</code>
	 */
	public static final schema.mysql.tables.SlowLog SLOW_LOG = new schema.mysql.tables.SlowLog();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<schema.mysql.tables.records.SlowLogRecord> getRecordType() {
		return schema.mysql.tables.records.SlowLogRecord.class;
	}

	/**
	 * The column <code>mysql.slow_log.start_time</code>.
	 */
	public final org.jooq.TableField<schema.mysql.tables.records.SlowLogRecord, java.sql.Timestamp> START_TIME = createField("start_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.slow_log.user_host</code>.
	 */
	public final org.jooq.TableField<schema.mysql.tables.records.SlowLogRecord, java.lang.String> USER_HOST = createField("user_host", org.jooq.impl.SQLDataType.CLOB.length(16777215).nullable(false), this, "");

	/**
	 * The column <code>mysql.slow_log.query_time</code>.
	 */
	public final org.jooq.TableField<schema.mysql.tables.records.SlowLogRecord, java.sql.Time> QUERY_TIME = createField("query_time", org.jooq.impl.SQLDataType.TIME.nullable(false), this, "");

	/**
	 * The column <code>mysql.slow_log.lock_time</code>.
	 */
	public final org.jooq.TableField<schema.mysql.tables.records.SlowLogRecord, java.sql.Time> LOCK_TIME = createField("lock_time", org.jooq.impl.SQLDataType.TIME.nullable(false), this, "");

	/**
	 * The column <code>mysql.slow_log.rows_sent</code>.
	 */
	public final org.jooq.TableField<schema.mysql.tables.records.SlowLogRecord, java.lang.Integer> ROWS_SENT = createField("rows_sent", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>mysql.slow_log.rows_examined</code>.
	 */
	public final org.jooq.TableField<schema.mysql.tables.records.SlowLogRecord, java.lang.Integer> ROWS_EXAMINED = createField("rows_examined", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>mysql.slow_log.db</code>.
	 */
	public final org.jooq.TableField<schema.mysql.tables.records.SlowLogRecord, java.lang.String> DB = createField("db", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false), this, "");

	/**
	 * The column <code>mysql.slow_log.last_insert_id</code>.
	 */
	public final org.jooq.TableField<schema.mysql.tables.records.SlowLogRecord, java.lang.Integer> LAST_INSERT_ID = createField("last_insert_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>mysql.slow_log.insert_id</code>.
	 */
	public final org.jooq.TableField<schema.mysql.tables.records.SlowLogRecord, java.lang.Integer> INSERT_ID = createField("insert_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>mysql.slow_log.server_id</code>.
	 */
	public final org.jooq.TableField<schema.mysql.tables.records.SlowLogRecord, org.jooq.types.UInteger> SERVER_ID = createField("server_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>mysql.slow_log.sql_text</code>.
	 */
	public final org.jooq.TableField<schema.mysql.tables.records.SlowLogRecord, java.lang.String> SQL_TEXT = createField("sql_text", org.jooq.impl.SQLDataType.CLOB.length(16777215).nullable(false), this, "");

	/**
	 * Create a <code>mysql.slow_log</code> table reference
	 */
	public SlowLog() {
		this("slow_log", null);
	}

	/**
	 * Create an aliased <code>mysql.slow_log</code> table reference
	 */
	public SlowLog(java.lang.String alias) {
		this(alias, schema.mysql.tables.SlowLog.SLOW_LOG);
	}

	private SlowLog(java.lang.String alias, org.jooq.Table<schema.mysql.tables.records.SlowLogRecord> aliased) {
		this(alias, aliased, null);
	}

	private SlowLog(java.lang.String alias, org.jooq.Table<schema.mysql.tables.records.SlowLogRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, schema.mysql.Mysql.MYSQL, aliased, parameters, "Slow log");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public schema.mysql.tables.SlowLog as(java.lang.String alias) {
		return new schema.mysql.tables.SlowLog(alias, this);
	}

	/**
	 * Rename this table
	 */
	public schema.mysql.tables.SlowLog rename(java.lang.String name) {
		return new schema.mysql.tables.SlowLog(name, null);
	}
}
