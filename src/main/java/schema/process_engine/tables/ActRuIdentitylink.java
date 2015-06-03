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
public class ActRuIdentitylink extends org.jooq.impl.TableImpl<schema.process_engine.tables.records.ActRuIdentitylinkRecord> {

	private static final long serialVersionUID = 1212288487;

	/**
	 * The reference instance of <code>process-engine.ACT_RU_IDENTITYLINK</code>
	 */
	public static final schema.process_engine.tables.ActRuIdentitylink ACT_RU_IDENTITYLINK = new schema.process_engine.tables.ActRuIdentitylink();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<schema.process_engine.tables.records.ActRuIdentitylinkRecord> getRecordType() {
		return schema.process_engine.tables.records.ActRuIdentitylinkRecord.class;
	}

	/**
	 * The column <code>process-engine.ACT_RU_IDENTITYLINK.ID_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActRuIdentitylinkRecord, java.lang.String> ID_ = createField("ID_", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>process-engine.ACT_RU_IDENTITYLINK.REV_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActRuIdentitylinkRecord, java.lang.Integer> REV_ = createField("REV_", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>process-engine.ACT_RU_IDENTITYLINK.GROUP_ID_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActRuIdentitylinkRecord, java.lang.String> GROUP_ID_ = createField("GROUP_ID_", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>process-engine.ACT_RU_IDENTITYLINK.TYPE_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActRuIdentitylinkRecord, java.lang.String> TYPE_ = createField("TYPE_", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>process-engine.ACT_RU_IDENTITYLINK.USER_ID_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActRuIdentitylinkRecord, java.lang.String> USER_ID_ = createField("USER_ID_", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>process-engine.ACT_RU_IDENTITYLINK.TASK_ID_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActRuIdentitylinkRecord, java.lang.String> TASK_ID_ = createField("TASK_ID_", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>process-engine.ACT_RU_IDENTITYLINK.PROC_DEF_ID_</code>.
	 */
	public final org.jooq.TableField<schema.process_engine.tables.records.ActRuIdentitylinkRecord, java.lang.String> PROC_DEF_ID_ = createField("PROC_DEF_ID_", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * Create a <code>process-engine.ACT_RU_IDENTITYLINK</code> table reference
	 */
	public ActRuIdentitylink() {
		this("ACT_RU_IDENTITYLINK", null);
	}

	/**
	 * Create an aliased <code>process-engine.ACT_RU_IDENTITYLINK</code> table reference
	 */
	public ActRuIdentitylink(java.lang.String alias) {
		this(alias, schema.process_engine.tables.ActRuIdentitylink.ACT_RU_IDENTITYLINK);
	}

	private ActRuIdentitylink(java.lang.String alias, org.jooq.Table<schema.process_engine.tables.records.ActRuIdentitylinkRecord> aliased) {
		this(alias, aliased, null);
	}

	private ActRuIdentitylink(java.lang.String alias, org.jooq.Table<schema.process_engine.tables.records.ActRuIdentitylinkRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, schema.process_engine.Process_engine.PROCESS_ENGINE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<schema.process_engine.tables.records.ActRuIdentitylinkRecord> getPrimaryKey() {
		return schema.process_engine.Keys.KEY_ACT_RU_IDENTITYLINK_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<schema.process_engine.tables.records.ActRuIdentitylinkRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<schema.process_engine.tables.records.ActRuIdentitylinkRecord>>asList(schema.process_engine.Keys.KEY_ACT_RU_IDENTITYLINK_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<schema.process_engine.tables.records.ActRuIdentitylinkRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<schema.process_engine.tables.records.ActRuIdentitylinkRecord, ?>>asList(schema.process_engine.Keys.ACT_FK_TSKASS_TASK, schema.process_engine.Keys.ACT_FK_ATHRZ_PROCEDEF);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public schema.process_engine.tables.ActRuIdentitylink as(java.lang.String alias) {
		return new schema.process_engine.tables.ActRuIdentitylink(alias, this);
	}

	/**
	 * Rename this table
	 */
	public schema.process_engine.tables.ActRuIdentitylink rename(java.lang.String name) {
		return new schema.process_engine.tables.ActRuIdentitylink(name, null);
	}
}
