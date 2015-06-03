/**
 * This class is generated by jOOQ
 */
package schema.information_schema.tables;

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
public class Profiling extends org.jooq.impl.TableImpl<schema.information_schema.tables.records.ProfilingRecord> {

	private static final long serialVersionUID = 1482867299;

	/**
	 * The reference instance of <code>information_schema.PROFILING</code>
	 */
	public static final schema.information_schema.tables.Profiling PROFILING = new schema.information_schema.tables.Profiling();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<schema.information_schema.tables.records.ProfilingRecord> getRecordType() {
		return schema.information_schema.tables.records.ProfilingRecord.class;
	}

	/**
	 * The column <code>information_schema.PROFILING.QUERY_ID</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.ProfilingRecord, java.lang.Integer> QUERY_ID = createField("QUERY_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.PROFILING.SEQ</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.ProfilingRecord, java.lang.Integer> SEQ = createField("SEQ", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.PROFILING.STATE</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.ProfilingRecord, java.lang.String> STATE = createField("STATE", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.PROFILING.DURATION</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.ProfilingRecord, java.math.BigDecimal> DURATION = createField("DURATION", org.jooq.impl.SQLDataType.DECIMAL.precision(9, 6).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.PROFILING.CPU_USER</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.ProfilingRecord, java.math.BigDecimal> CPU_USER = createField("CPU_USER", org.jooq.impl.SQLDataType.DECIMAL.precision(9, 6), this, "");

	/**
	 * The column <code>information_schema.PROFILING.CPU_SYSTEM</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.ProfilingRecord, java.math.BigDecimal> CPU_SYSTEM = createField("CPU_SYSTEM", org.jooq.impl.SQLDataType.DECIMAL.precision(9, 6), this, "");

	/**
	 * The column <code>information_schema.PROFILING.CONTEXT_VOLUNTARY</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.ProfilingRecord, java.lang.Integer> CONTEXT_VOLUNTARY = createField("CONTEXT_VOLUNTARY", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.PROFILING.CONTEXT_INVOLUNTARY</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.ProfilingRecord, java.lang.Integer> CONTEXT_INVOLUNTARY = createField("CONTEXT_INVOLUNTARY", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.PROFILING.BLOCK_OPS_IN</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.ProfilingRecord, java.lang.Integer> BLOCK_OPS_IN = createField("BLOCK_OPS_IN", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.PROFILING.BLOCK_OPS_OUT</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.ProfilingRecord, java.lang.Integer> BLOCK_OPS_OUT = createField("BLOCK_OPS_OUT", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.PROFILING.MESSAGES_SENT</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.ProfilingRecord, java.lang.Integer> MESSAGES_SENT = createField("MESSAGES_SENT", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.PROFILING.MESSAGES_RECEIVED</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.ProfilingRecord, java.lang.Integer> MESSAGES_RECEIVED = createField("MESSAGES_RECEIVED", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.PROFILING.PAGE_FAULTS_MAJOR</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.ProfilingRecord, java.lang.Integer> PAGE_FAULTS_MAJOR = createField("PAGE_FAULTS_MAJOR", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.PROFILING.PAGE_FAULTS_MINOR</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.ProfilingRecord, java.lang.Integer> PAGE_FAULTS_MINOR = createField("PAGE_FAULTS_MINOR", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.PROFILING.SWAPS</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.ProfilingRecord, java.lang.Integer> SWAPS = createField("SWAPS", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.PROFILING.SOURCE_FUNCTION</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.ProfilingRecord, java.lang.String> SOURCE_FUNCTION = createField("SOURCE_FUNCTION", org.jooq.impl.SQLDataType.VARCHAR.length(30), this, "");

	/**
	 * The column <code>information_schema.PROFILING.SOURCE_FILE</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.ProfilingRecord, java.lang.String> SOURCE_FILE = createField("SOURCE_FILE", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

	/**
	 * The column <code>information_schema.PROFILING.SOURCE_LINE</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.ProfilingRecord, java.lang.Integer> SOURCE_LINE = createField("SOURCE_LINE", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>information_schema.PROFILING</code> table reference
	 */
	public Profiling() {
		this("PROFILING", null);
	}

	/**
	 * Create an aliased <code>information_schema.PROFILING</code> table reference
	 */
	public Profiling(java.lang.String alias) {
		this(alias, schema.information_schema.tables.Profiling.PROFILING);
	}

	private Profiling(java.lang.String alias, org.jooq.Table<schema.information_schema.tables.records.ProfilingRecord> aliased) {
		this(alias, aliased, null);
	}

	private Profiling(java.lang.String alias, org.jooq.Table<schema.information_schema.tables.records.ProfilingRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, schema.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public schema.information_schema.tables.Profiling as(java.lang.String alias) {
		return new schema.information_schema.tables.Profiling(alias, this);
	}

	/**
	 * Rename this table
	 */
	public schema.information_schema.tables.Profiling rename(java.lang.String name) {
		return new schema.information_schema.tables.Profiling(name, null);
	}
}
