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
public class ActRuEventSubscrRecord extends org.jooq.impl.UpdatableRecordImpl<schema.process_engine.tables.records.ActRuEventSubscrRecord> implements org.jooq.Record9<java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp> {

	private static final long serialVersionUID = -1836710087;

	/**
	 * Setter for <code>process-engine.ACT_RU_EVENT_SUBSCR.ID_</code>.
	 */
	public void setId_(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_EVENT_SUBSCR.ID_</code>.
	 */
	public java.lang.String getId_() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_EVENT_SUBSCR.REV_</code>.
	 */
	public void setRev_(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_EVENT_SUBSCR.REV_</code>.
	 */
	public java.lang.Integer getRev_() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_EVENT_SUBSCR.EVENT_TYPE_</code>.
	 */
	public void setEventType_(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_EVENT_SUBSCR.EVENT_TYPE_</code>.
	 */
	public java.lang.String getEventType_() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_EVENT_SUBSCR.EVENT_NAME_</code>.
	 */
	public void setEventName_(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_EVENT_SUBSCR.EVENT_NAME_</code>.
	 */
	public java.lang.String getEventName_() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_EVENT_SUBSCR.EXECUTION_ID_</code>.
	 */
	public void setExecutionId_(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_EVENT_SUBSCR.EXECUTION_ID_</code>.
	 */
	public java.lang.String getExecutionId_() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_EVENT_SUBSCR.PROC_INST_ID_</code>.
	 */
	public void setProcInstId_(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_EVENT_SUBSCR.PROC_INST_ID_</code>.
	 */
	public java.lang.String getProcInstId_() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_EVENT_SUBSCR.ACTIVITY_ID_</code>.
	 */
	public void setActivityId_(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_EVENT_SUBSCR.ACTIVITY_ID_</code>.
	 */
	public java.lang.String getActivityId_() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_EVENT_SUBSCR.CONFIGURATION_</code>.
	 */
	public void setConfiguration_(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_EVENT_SUBSCR.CONFIGURATION_</code>.
	 */
	public java.lang.String getConfiguration_() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>process-engine.ACT_RU_EVENT_SUBSCR.CREATED_</code>.
	 */
	public void setCreated_(java.sql.Timestamp value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_RU_EVENT_SUBSCR.CREATED_</code>.
	 */
	public java.sql.Timestamp getCreated_() {
		return (java.sql.Timestamp) getValue(8);
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
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return schema.process_engine.tables.ActRuEventSubscr.ACT_RU_EVENT_SUBSCR.ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return schema.process_engine.tables.ActRuEventSubscr.ACT_RU_EVENT_SUBSCR.REV_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return schema.process_engine.tables.ActRuEventSubscr.ACT_RU_EVENT_SUBSCR.EVENT_TYPE_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return schema.process_engine.tables.ActRuEventSubscr.ACT_RU_EVENT_SUBSCR.EVENT_NAME_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return schema.process_engine.tables.ActRuEventSubscr.ACT_RU_EVENT_SUBSCR.EXECUTION_ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return schema.process_engine.tables.ActRuEventSubscr.ACT_RU_EVENT_SUBSCR.PROC_INST_ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return schema.process_engine.tables.ActRuEventSubscr.ACT_RU_EVENT_SUBSCR.ACTIVITY_ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return schema.process_engine.tables.ActRuEventSubscr.ACT_RU_EVENT_SUBSCR.CONFIGURATION_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field9() {
		return schema.process_engine.tables.ActRuEventSubscr.ACT_RU_EVENT_SUBSCR.CREATED_;
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
		return getEventType_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getEventName_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getExecutionId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getProcInstId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getActivityId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getConfiguration_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value9() {
		return getCreated_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuEventSubscrRecord value1(java.lang.String value) {
		setId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuEventSubscrRecord value2(java.lang.Integer value) {
		setRev_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuEventSubscrRecord value3(java.lang.String value) {
		setEventType_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuEventSubscrRecord value4(java.lang.String value) {
		setEventName_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuEventSubscrRecord value5(java.lang.String value) {
		setExecutionId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuEventSubscrRecord value6(java.lang.String value) {
		setProcInstId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuEventSubscrRecord value7(java.lang.String value) {
		setActivityId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuEventSubscrRecord value8(java.lang.String value) {
		setConfiguration_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuEventSubscrRecord value9(java.sql.Timestamp value) {
		setCreated_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActRuEventSubscrRecord values(java.lang.String value1, java.lang.Integer value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.String value6, java.lang.String value7, java.lang.String value8, java.sql.Timestamp value9) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ActRuEventSubscrRecord
	 */
	public ActRuEventSubscrRecord() {
		super(schema.process_engine.tables.ActRuEventSubscr.ACT_RU_EVENT_SUBSCR);
	}

	/**
	 * Create a detached, initialised ActRuEventSubscrRecord
	 */
	public ActRuEventSubscrRecord(java.lang.String id_, java.lang.Integer rev_, java.lang.String eventType_, java.lang.String eventName_, java.lang.String executionId_, java.lang.String procInstId_, java.lang.String activityId_, java.lang.String configuration_, java.sql.Timestamp created_) {
		super(schema.process_engine.tables.ActRuEventSubscr.ACT_RU_EVENT_SUBSCR);

		setValue(0, id_);
		setValue(1, rev_);
		setValue(2, eventType_);
		setValue(3, eventName_);
		setValue(4, executionId_);
		setValue(5, procInstId_);
		setValue(6, activityId_);
		setValue(7, configuration_);
		setValue(8, created_);
	}
}
