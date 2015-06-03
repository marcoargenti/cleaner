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
public class ActIdInfo extends org.jooq.impl.TableImpl<schema.process_engine.tables.records.ActIdInfoRecord> {

	private static final long serialVersionUID = -423019355;

	/**
	 * The reference instance of <code>process-engine.ACT_ID_INFO</code>
	 */
	public static final schema.process_engine.tables.ActIdInfo ACT_ID_INFO = new schema.process_engine.tables.ActIdInfo();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<schema.process_engine.tables.records.ActIdInfoRecord> getRecordType() {
		return schema.process_engine.tables.records.ActIdInfoRecord.class;
	}

	/**
	 * The column <code>process-engine.ACT_ID_INFO.ID_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActIdInfoRecord, java.lang.String> ID_ = createField("ID_", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>process-engine.ACT_ID_INFO.REV_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActIdInfoRecord, java.lang.Integer> REV_ = createField("REV_", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>process-engine.ACT_ID_INFO.USER_ID_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActIdInfoRecord, java.lang.String> USER_ID_ = createField("USER_ID_", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>process-engine.ACT_ID_INFO.TYPE_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActIdInfoRecord, java.lang.String> TYPE_ = createField("TYPE_", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>process-engine.ACT_ID_INFO.KEY_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActIdInfoRecord, java.lang.String> KEY_ = createField("KEY_", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>process-engine.ACT_ID_INFO.VALUE_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActIdInfoRecord, java.lang.String> VALUE_ = createField("VALUE_", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>process-engine.ACT_ID_INFO.PASSWORD_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActIdInfoRecord, byte[]> PASSWORD_ = createField("PASSWORD_", org.jooq.impl.SQLDataType.BLOB, this, "");

	/**
	 * The column <code>process-engine.ACT_ID_INFO.PARENT_ID_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActIdInfoRecord, java.lang.String> PARENT_ID_ = createField("PARENT_ID_", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * Create a <code>process-engine.ACT_ID_INFO</code> table reference
	 */
	public ActIdInfo() {
		this("ACT_ID_INFO", null);
	}

	/**
	 * Create an aliased <code>process-engine.ACT_ID_INFO</code> table reference
	 */
	public ActIdInfo(java.lang.String alias) {
		this(alias, schema.process_engine.tables.ActIdInfo.ACT_ID_INFO);
	}

	private ActIdInfo(java.lang.String alias, org.jooq.Table<schema.process_engine.tables.records.ActIdInfoRecord> aliased) {
		this(alias, aliased, null);
	}

	private ActIdInfo(java.lang.String alias, org.jooq.Table<schema.process_engine.tables.records.ActIdInfoRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, schema.process_engine.Process_engine.PROCESS_ENGINE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<schema.process_engine.tables.records.ActIdInfoRecord> getPrimaryKey() {
		return schema.process_engine.Keys.KEY_ACT_ID_INFO_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<schema.process_engine.tables.records.ActIdInfoRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<schema.process_engine.tables.records.ActIdInfoRecord>>asList(schema.process_engine.Keys.KEY_ACT_ID_INFO_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public schema.process_engine.tables.ActIdInfo as(java.lang.String alias) {
		return new schema.process_engine.tables.ActIdInfo(alias, this);
	}

	/**
	 * Rename this table
	 */
	public schema.process_engine.tables.ActIdInfo rename(java.lang.String name) {
		return new schema.process_engine.tables.ActIdInfo(name, null);
	}
}
