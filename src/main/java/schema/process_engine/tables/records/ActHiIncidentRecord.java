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
public class ActHiIncidentRecord extends org.jooq.impl.UpdatableRecordImpl<schema.process_engine.tables.records.ActHiIncidentRecord> implements org.jooq.Record13<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> {

	private static final long serialVersionUID = -875648133;

	/**
	 * Setter for <code>process-engine.ACT_HI_INCIDENT.ID_</code>.
	 */
	public void setId_(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_INCIDENT.ID_</code>.
	 */
	public java.lang.String getId_() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_INCIDENT.PROC_DEF_ID_</code>.
	 */
	public void setProcDefId_(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_INCIDENT.PROC_DEF_ID_</code>.
	 */
	public java.lang.String getProcDefId_() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_INCIDENT.PROC_INST_ID_</code>.
	 */
	public void setProcInstId_(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_INCIDENT.PROC_INST_ID_</code>.
	 */
	public java.lang.String getProcInstId_() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_INCIDENT.EXECUTION_ID_</code>.
	 */
	public void setExecutionId_(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_INCIDENT.EXECUTION_ID_</code>.
	 */
	public java.lang.String getExecutionId_() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_INCIDENT.CREATE_TIME_</code>.
	 */
	public void setCreateTime_(java.sql.Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_INCIDENT.CREATE_TIME_</code>.
	 */
	public java.sql.Timestamp getCreateTime_() {
		return (java.sql.Timestamp) getValue(4);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_INCIDENT.END_TIME_</code>.
	 */
	public void setEndTime_(java.sql.Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_INCIDENT.END_TIME_</code>.
	 */
	public java.sql.Timestamp getEndTime_() {
		return (java.sql.Timestamp) getValue(5);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_INCIDENT.INCIDENT_MSG_</code>.
	 */
	public void setIncidentMsg_(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_INCIDENT.INCIDENT_MSG_</code>.
	 */
	public java.lang.String getIncidentMsg_() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_INCIDENT.INCIDENT_TYPE_</code>.
	 */
	public void setIncidentType_(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_INCIDENT.INCIDENT_TYPE_</code>.
	 */
	public java.lang.String getIncidentType_() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_INCIDENT.ACTIVITY_ID_</code>.
	 */
	public void setActivityId_(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_INCIDENT.ACTIVITY_ID_</code>.
	 */
	public java.lang.String getActivityId_() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_INCIDENT.CAUSE_INCIDENT_ID_</code>.
	 */
	public void setCauseIncidentId_(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_INCIDENT.CAUSE_INCIDENT_ID_</code>.
	 */
	public java.lang.String getCauseIncidentId_() {
		return (java.lang.String) getValue(9);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_INCIDENT.ROOT_CAUSE_INCIDENT_ID_</code>.
	 */
	public void setRootCauseIncidentId_(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_INCIDENT.ROOT_CAUSE_INCIDENT_ID_</code>.
	 */
	public java.lang.String getRootCauseIncidentId_() {
		return (java.lang.String) getValue(10);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_INCIDENT.CONFIGURATION_</code>.
	 */
	public void setConfiguration_(java.lang.String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_INCIDENT.CONFIGURATION_</code>.
	 */
	public java.lang.String getConfiguration_() {
		return (java.lang.String) getValue(11);
	}

	/**
	 * Setter for <code>process-engine.ACT_HI_INCIDENT.INCIDENT_STATE_</code>.
	 */
	public void setIncidentState_(java.lang.Integer value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_HI_INCIDENT.INCIDENT_STATE_</code>.
	 */
	public java.lang.Integer getIncidentState_() {
		return (java.lang.Integer) getValue(12);
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
	// Record13 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row13<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row13) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row13<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> valuesRow() {
		return (org.jooq.Row13) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return schema.process_engine.tables.ActHiIncident.ACT_HI_INCIDENT.ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return schema.process_engine.tables.ActHiIncident.ACT_HI_INCIDENT.PROC_DEF_ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return schema.process_engine.tables.ActHiIncident.ACT_HI_INCIDENT.PROC_INST_ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return schema.process_engine.tables.ActHiIncident.ACT_HI_INCIDENT.EXECUTION_ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field5() {
		return schema.process_engine.tables.ActHiIncident.ACT_HI_INCIDENT.CREATE_TIME_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field6() {
		return schema.process_engine.tables.ActHiIncident.ACT_HI_INCIDENT.END_TIME_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return schema.process_engine.tables.ActHiIncident.ACT_HI_INCIDENT.INCIDENT_MSG_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return schema.process_engine.tables.ActHiIncident.ACT_HI_INCIDENT.INCIDENT_TYPE_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return schema.process_engine.tables.ActHiIncident.ACT_HI_INCIDENT.ACTIVITY_ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return schema.process_engine.tables.ActHiIncident.ACT_HI_INCIDENT.CAUSE_INCIDENT_ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return schema.process_engine.tables.ActHiIncident.ACT_HI_INCIDENT.ROOT_CAUSE_INCIDENT_ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field12() {
		return schema.process_engine.tables.ActHiIncident.ACT_HI_INCIDENT.CONFIGURATION_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field13() {
		return schema.process_engine.tables.ActHiIncident.ACT_HI_INCIDENT.INCIDENT_STATE_;
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
		return getProcDefId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getProcInstId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getExecutionId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value5() {
		return getCreateTime_();
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
	public java.lang.String value7() {
		return getIncidentMsg_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getIncidentType_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getActivityId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return getCauseIncidentId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return getRootCauseIncidentId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value12() {
		return getConfiguration_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value13() {
		return getIncidentState_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiIncidentRecord value1(java.lang.String value) {
		setId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiIncidentRecord value2(java.lang.String value) {
		setProcDefId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiIncidentRecord value3(java.lang.String value) {
		setProcInstId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiIncidentRecord value4(java.lang.String value) {
		setExecutionId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiIncidentRecord value5(java.sql.Timestamp value) {
		setCreateTime_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiIncidentRecord value6(java.sql.Timestamp value) {
		setEndTime_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiIncidentRecord value7(java.lang.String value) {
		setIncidentMsg_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiIncidentRecord value8(java.lang.String value) {
		setIncidentType_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiIncidentRecord value9(java.lang.String value) {
		setActivityId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiIncidentRecord value10(java.lang.String value) {
		setCauseIncidentId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiIncidentRecord value11(java.lang.String value) {
		setRootCauseIncidentId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiIncidentRecord value12(java.lang.String value) {
		setConfiguration_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiIncidentRecord value13(java.lang.Integer value) {
		setIncidentState_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActHiIncidentRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.sql.Timestamp value5, java.sql.Timestamp value6, java.lang.String value7, java.lang.String value8, java.lang.String value9, java.lang.String value10, java.lang.String value11, java.lang.String value12, java.lang.Integer value13) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ActHiIncidentRecord
	 */
	public ActHiIncidentRecord() {
		super(schema.process_engine.tables.ActHiIncident.ACT_HI_INCIDENT);
	}

	/**
	 * Create a detached, initialised ActHiIncidentRecord
	 */
	public ActHiIncidentRecord(java.lang.String id_, java.lang.String procDefId_, java.lang.String procInstId_, java.lang.String executionId_, java.sql.Timestamp createTime_, java.sql.Timestamp endTime_, java.lang.String incidentMsg_, java.lang.String incidentType_, java.lang.String activityId_, java.lang.String causeIncidentId_, java.lang.String rootCauseIncidentId_, java.lang.String configuration_, java.lang.Integer incidentState_) {
		super(schema.process_engine.tables.ActHiIncident.ACT_HI_INCIDENT);

		setValue(0, id_);
		setValue(1, procDefId_);
		setValue(2, procInstId_);
		setValue(3, executionId_);
		setValue(4, createTime_);
		setValue(5, endTime_);
		setValue(6, incidentMsg_);
		setValue(7, incidentType_);
		setValue(8, activityId_);
		setValue(9, causeIncidentId_);
		setValue(10, rootCauseIncidentId_);
		setValue(11, configuration_);
		setValue(12, incidentState_);
	}
}
