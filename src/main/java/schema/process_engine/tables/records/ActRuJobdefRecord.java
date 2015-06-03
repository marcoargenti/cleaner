/**
 * This class is generated by jOOQ
 */
package schema.process_engine.tables.records;

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
public class ActRuJobdefRecord extends org.jooq.impl.UpdatableRecordImpl<schema.process_engine.tables.records.ActRuJobdefRecord> implements org.jooq.Record8<java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> {

	private static final long serialVersionUID = 2097887765;

	/**
	 * Setter for <code>process-engine.ACT_RU_JOBDEF.ID_</code>.
	 */
	public void setId_(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_JOBDEF.ID_</code>.
	 */
	public java.lang.String getId_() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_JOBDEF.REV_</code>.
	 */
	public void setRev_(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_JOBDEF.REV_</code>.
	 */
	public java.lang.Integer getRev_() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_JOBDEF.PROC_DEF_ID_</code>.
	 */
	public void setProcDefId_(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_JOBDEF.PROC_DEF_ID_</code>.
	 */
	public java.lang.String getProcDefId_() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_JOBDEF.PROC_DEF_KEY_</code>.
	 */
	public void setProcDefKey_(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_JOBDEF.PROC_DEF_KEY_</code>.
	 */
	public java.lang.String getProcDefKey_() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_JOBDEF.ACT_ID_</code>.
	 */
	public void setActId_(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_JOBDEF.ACT_ID_</code>.
	 */
	public java.lang.String getActId_() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_JOBDEF.JOB_TYPE_</code>.
	 */
	public void setJobType_(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_JOBDEF.JOB_TYPE_</code>.
	 */
	public java.lang.String getJobType_() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_JOBDEF.JOB_CONFIGURATION_</code>.
	 */
	public void setJobConfiguration_(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_JOBDEF.JOB_CONFIGURATION_</code>.
	 */
	public java.lang.String getJobConfiguration_() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_JOBDEF.SUSPENSION_STATE_</code>.
	 */
	public void setSuspensionState_(java.lang.Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_JOBDEF.SUSPENSION_STATE_</code>.
	 */
	public java.lang.Integer getSuspensionState_() {
		return (java.lang.Integer) getValue(7);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.String> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> valuesRow() {
		return (org.jooq.Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return schema.process_engine.tables.ActRuJobdef.ACT_RU_JOBDEF.ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return schema.process_engine.tables.ActRuJobdef.ACT_RU_JOBDEF.REV_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return schema.process_engine.tables.ActRuJobdef.ACT_RU_JOBDEF.PROC_DEF_ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return schema.process_engine.tables.ActRuJobdef.ACT_RU_JOBDEF.PROC_DEF_KEY_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return schema.process_engine.tables.ActRuJobdef.ACT_RU_JOBDEF.ACT_ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return schema.process_engine.tables.ActRuJobdef.ACT_RU_JOBDEF.JOB_TYPE_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return schema.process_engine.tables.ActRuJobdef.ACT_RU_JOBDEF.JOB_CONFIGURATION_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field8() {
		return schema.process_engine.tables.ActRuJobdef.ACT_RU_JOBDEF.SUSPENSION_STATE_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getRev_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getProcDefId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getProcDefKey_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getActId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getJobType_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getJobConfiguration_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value8() {
		return getSuspensionState_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuJobdefRecord value1(java.lang.String value) {
		setId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuJobdefRecord value2(java.lang.Integer value) {
		setRev_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuJobdefRecord value3(java.lang.String value) {
		setProcDefId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuJobdefRecord value4(java.lang.String value) {
		setProcDefKey_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuJobdefRecord value5(java.lang.String value) {
		setActId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuJobdefRecord value6(java.lang.String value) {
		setJobType_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuJobdefRecord value7(java.lang.String value) {
		setJobConfiguration_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuJobdefRecord value8(java.lang.Integer value) {
		setSuspensionState_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuJobdefRecord values(java.lang.String value1, java.lang.Integer value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.String value6, java.lang.String value7, java.lang.Integer value8) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ActRuJobdefRecord
	 */
	public ActRuJobdefRecord() {
		super(schema.process_engine.tables.ActRuJobdef.ACT_RU_JOBDEF);
	}

	/**
	 * Create a detached, initialised ActRuJobdefRecord
	 */
	public ActRuJobdefRecord(java.lang.String id_, java.lang.Integer rev_, java.lang.String procDefId_, java.lang.String procDefKey_, java.lang.String actId_, java.lang.String jobType_, java.lang.String jobConfiguration_, java.lang.Integer suspensionState_) {
		super(schema.process_engine.tables.ActRuJobdef.ACT_RU_JOBDEF);

		setValue(0, id_);
		setValue(1, rev_);
		setValue(2, procDefId_);
		setValue(3, procDefKey_);
		setValue(4, actId_);
		setValue(5, jobType_);
		setValue(6, jobConfiguration_);
		setValue(7, suspensionState_);
	}
}
