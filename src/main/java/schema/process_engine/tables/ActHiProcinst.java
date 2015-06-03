/**
 * This class is generated by jOOQ
 */
package schema.process_engine.tables;

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
public class ActHiProcinst extends org.jooq.impl.TableImpl<schema.process_engine.tables.records.ActHiProcinstRecord> {

	private static final long serialVersionUID = 1064391348;

	/**
	 * The reference instance of <code>process-engine.ACT_HI_PROCINST</code>
	 */
	public static final schema.process_engine.tables.ActHiProcinst ACT_HI_PROCINST = new schema.process_engine.tables.ActHiProcinst();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<schema.process_engine.tables.records.ActHiProcinstRecord> getRecordType() {
		return schema.process_engine.tables.records.ActHiProcinstRecord.class;
	}

	/**
	 * The column <code>process-engine.ACT_HI_PROCINST.ID_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActHiProcinstRecord, java.lang.String> ID_ = createField("ID_", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

	/**
	 * The column <code>process-engine.ACT_HI_PROCINST.PROC_INST_ID_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActHiProcinstRecord, java.lang.String> PROC_INST_ID_ = createField("PROC_INST_ID_", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

	/**
	 * The column <code>process-engine.ACT_HI_PROCINST.BUSINESS_KEY_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActHiProcinstRecord, java.lang.String> BUSINESS_KEY_ = createField("BUSINESS_KEY_", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>process-engine.ACT_HI_PROCINST.PROC_DEF_ID_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActHiProcinstRecord, java.lang.String> PROC_DEF_ID_ = createField("PROC_DEF_ID_", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

	/**
	 * The column <code>process-engine.ACT_HI_PROCINST.START_TIME_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActHiProcinstRecord, java.sql.Timestamp> START_TIME_ = createField("START_TIME_", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

	/**
	 * The column <code>process-engine.ACT_HI_PROCINST.END_TIME_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActHiProcinstRecord, java.sql.Timestamp> END_TIME_ = createField("END_TIME_", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>process-engine.ACT_HI_PROCINST.DURATION_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActHiProcinstRecord, java.lang.Long> DURATION_ = createField("DURATION_", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>process-engine.ACT_HI_PROCINST.START_USER_ID_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActHiProcinstRecord, java.lang.String> START_USER_ID_ = createField("START_USER_ID_", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>process-engine.ACT_HI_PROCINST.START_ACT_ID_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActHiProcinstRecord, java.lang.String> START_ACT_ID_ = createField("START_ACT_ID_", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>process-engine.ACT_HI_PROCINST.END_ACT_ID_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActHiProcinstRecord, java.lang.String> END_ACT_ID_ = createField("END_ACT_ID_", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>process-engine.ACT_HI_PROCINST.SUPER_PROCESS_INSTANCE_ID_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActHiProcinstRecord, java.lang.String> SUPER_PROCESS_INSTANCE_ID_ = createField("SUPER_PROCESS_INSTANCE_ID_", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>process-engine.ACT_HI_PROCINST.DELETE_REASON_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActHiProcinstRecord, java.lang.String> DELETE_REASON_ = createField("DELETE_REASON_", org.jooq.impl.SQLDataType.VARCHAR.length(4000), this, "");

	/**
	 * Create a <code>process-engine.ACT_HI_PROCINST</code> table reference
	 */
	public ActHiProcinst() {
		this("ACT_HI_PROCINST", null);
	}

	/**
	 * Create an aliased <code>process-engine.ACT_HI_PROCINST</code> table reference
	 */
	public ActHiProcinst(java.lang.String alias) {
		this(alias, schema.process_engine.tables.ActHiProcinst.ACT_HI_PROCINST);
	}

	private ActHiProcinst(java.lang.String alias, org.jooq.Table<schema.process_engine.tables.records.ActHiProcinstRecord> aliased) {
		this(alias, aliased, null);
	}

	private ActHiProcinst(java.lang.String alias, org.jooq.Table<schema.process_engine.tables.records.ActHiProcinstRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, schema.process_engine.Process_engine.PROCESS_ENGINE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<schema.process_engine.tables.records.ActHiProcinstRecord> getPrimaryKey() {
		return schema.process_engine.Keys.KEY_ACT_HI_PROCINST_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<schema.process_engine.tables.records.ActHiProcinstRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<schema.process_engine.tables.records.ActHiProcinstRecord>>asList(schema.process_engine.Keys.KEY_ACT_HI_PROCINST_PRIMARY, schema.process_engine.Keys.KEY_ACT_HI_PROCINST_PROC_INST_ID_);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public schema.process_engine.tables.ActHiProcinst as(java.lang.String alias) {
		return new schema.process_engine.tables.ActHiProcinst(alias, this);
	}

	/**
	 * Rename this table
	 */
	public schema.process_engine.tables.ActHiProcinst rename(java.lang.String name) {
		return new schema.process_engine.tables.ActHiProcinst(name, null);
	}
}
