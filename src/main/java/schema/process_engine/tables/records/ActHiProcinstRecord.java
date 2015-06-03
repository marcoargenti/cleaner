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
public class ActHiProcinstRecord extends org.jooq.impl.UpdatableRecordImpl<schema.process_engine.tables.records.ActHiProcinstRecord> implements org.jooq.Record12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -1160155782;

	/**
	 * Setter for <code>process-engine.ACT_HI_PROCINST.ID_</code>.
	 */
	public void setId_(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_PROCINST.ID_</code>.
	 */
	public java.lang.String getId_() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_PROCINST.PROC_INST_ID_</code>.
	 */
	public void setProcInstId_(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_PROCINST.PROC_INST_ID_</code>.
	 */
	public java.lang.String getProcInstId_() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_PROCINST.BUSINESS_KEY_</code>.
	 */
	public void setBusinessKey_(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_PROCINST.BUSINESS_KEY_</code>.
	 */
	public java.lang.String getBusinessKey_() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_PROCINST.PROC_DEF_ID_</code>.
	 */
	public void setProcDefId_(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_PROCINST.PROC_DEF_ID_</code>.
	 */
	public java.lang.String getProcDefId_() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_PROCINST.START_TIME_</code>.
	 */
	public void setStartTime_(java.sql.Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_PROCINST.START_TIME_</code>.
	 */
	public java.sql.Timestamp getStartTime_() {
		return (java.sql.Timestamp) getValue(4);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_PROCINST.END_TIME_</code>.
	 */
	public void setEndTime_(java.sql.Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_PROCINST.END_TIME_</code>.
	 */
	public java.sql.Timestamp getEndTime_() {
		return (java.sql.Timestamp) getValue(5);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_PROCINST.DURATION_</code>.
	 */
	public void setDuration_(java.lang.Long value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_PROCINST.DURATION_</code>.
	 */
	public java.lang.Long getDuration_() {
		return (java.lang.Long) getValue(6);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_PROCINST.START_USER_ID_</code>.
	 */
	public void setStartUserId_(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_PROCINST.START_USER_ID_</code>.
	 */
	public java.lang.String getStartUserId_() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_PROCINST.START_ACT_ID_</code>.
	 */
	public void setStartActId_(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_PROCINST.START_ACT_ID_</code>.
	 */
	public java.lang.String getStartActId_() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_PROCINST.END_ACT_ID_</code>.
	 */
	public void setEndActId_(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_PROCINST.END_ACT_ID_</code>.
	 */
	public java.lang.String getEndActId_() {
		return (java.lang.String) getValue(9);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_PROCINST.SUPER_PROCESS_INSTANCE_ID_</code>.
	 */
	public void setSuperProcessInstanceId_(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_PROCINST.SUPER_PROCESS_INSTANCE_ID_</code>.
	 */
	public java.lang.String getSuperProcessInstanceId_() {
		return (java.lang.String) getValue(10);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_PROCINST.DELETE_REASON_</code>.
	 */
	public void setDeleteReason_(java.lang.String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_PROCINST.DELETE_REASON_</code>.
	 */
	public java.lang.String getDeleteReason_() {
		return (java.lang.String) getValue(11);
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
	// Record12 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row12) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row12) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return schema.process_engine.tables.ActHiProcinst.ACT_HI_PROCINST.ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return schema.process_engine.tables.ActHiProcinst.ACT_HI_PROCINST.PROC_INST_ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return schema.process_engine.tables.ActHiProcinst.ACT_HI_PROCINST.BUSINESS_KEY_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return schema.process_engine.tables.ActHiProcinst.ACT_HI_PROCINST.PROC_DEF_ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field5() {
		return schema.process_engine.tables.ActHiProcinst.ACT_HI_PROCINST.START_TIME_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field6() {
		return schema.process_engine.tables.ActHiProcinst.ACT_HI_PROCINST.END_TIME_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field7() {
		return schema.process_engine.tables.ActHiProcinst.ACT_HI_PROCINST.DURATION_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return schema.process_engine.tables.ActHiProcinst.ACT_HI_PROCINST.START_USER_ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return schema.process_engine.tables.ActHiProcinst.ACT_HI_PROCINST.START_ACT_ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return schema.process_engine.tables.ActHiProcinst.ACT_HI_PROCINST.END_ACT_ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return schema.process_engine.tables.ActHiProcinst.ACT_HI_PROCINST.SUPER_PROCESS_INSTANCE_ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field12() {
		return schema.process_engine.tables.ActHiProcinst.ACT_HI_PROCINST.DELETE_REASON_;
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
	public java.lang.String value2() {
		return getProcInstId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getBusinessKey_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getProcDefId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value5() {
		return getStartTime_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value6() {
		return getEndTime_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value7() {
		return getDuration_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getStartUserId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getStartActId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return getEndActId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return getSuperProcessInstanceId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value12() {
		return getDeleteReason_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiProcinstRecord value1(java.lang.String value) {
		setId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiProcinstRecord value2(java.lang.String value) {
		setProcInstId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiProcinstRecord value3(java.lang.String value) {
		setBusinessKey_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiProcinstRecord value4(java.lang.String value) {
		setProcDefId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiProcinstRecord value5(java.sql.Timestamp value) {
		setStartTime_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiProcinstRecord value6(java.sql.Timestamp value) {
		setEndTime_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiProcinstRecord value7(java.lang.Long value) {
		setDuration_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiProcinstRecord value8(java.lang.String value) {
		setStartUserId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiProcinstRecord value9(java.lang.String value) {
		setStartActId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiProcinstRecord value10(java.lang.String value) {
		setEndActId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiProcinstRecord value11(java.lang.String value) {
		setSuperProcessInstanceId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiProcinstRecord value12(java.lang.String value) {
		setDeleteReason_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiProcinstRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.sql.Timestamp value5, java.sql.Timestamp value6, java.lang.Long value7, java.lang.String value8, java.lang.String value9, java.lang.String value10, java.lang.String value11, java.lang.String value12) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ActHiProcinstRecord
	 */
	public ActHiProcinstRecord() {
		super(schema.process_engine.tables.ActHiProcinst.ACT_HI_PROCINST);
	}

	/**
	 * Create a detached, initialised ActHiProcinstRecord
	 */
	public ActHiProcinstRecord(java.lang.String id_, java.lang.String procInstId_, java.lang.String businessKey_, java.lang.String procDefId_, java.sql.Timestamp startTime_, java.sql.Timestamp endTime_, java.lang.Long duration_, java.lang.String startUserId_, java.lang.String startActId_, java.lang.String endActId_, java.lang.String superProcessInstanceId_, java.lang.String deleteReason_) {
		super(schema.process_engine.tables.ActHiProcinst.ACT_HI_PROCINST);

		setValue(0, id_);
		setValue(1, procInstId_);
		setValue(2, businessKey_);
		setValue(3, procDefId_);
		setValue(4, startTime_);
		setValue(5, endTime_);
		setValue(6, duration_);
		setValue(7, startUserId_);
		setValue(8, startActId_);
		setValue(9, endActId_);
		setValue(10, superProcessInstanceId_);
		setValue(11, deleteReason_);
	}
}
