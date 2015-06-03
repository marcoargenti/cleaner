/**
 * This class is generated by jOOQ
 */
package cleandb.performance_schema.tables.records;

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
public class EventsWaitsCurrentRecord extends org.jooq.impl.TableRecordImpl<cleandb.performance_schema.tables.records.EventsWaitsCurrentRecord> implements org.jooq.Record16<java.lang.Integer, org.jooq.types.ULong, java.lang.String, java.lang.String, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.UInteger, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, org.jooq.types.ULong, java.lang.String, org.jooq.types.ULong, org.jooq.types.UInteger> {

	private static final long serialVersionUID = 442582156;

	/**
	 * Setter for <code>performance_schema.events_waits_current.THREAD_ID</code>.
	 */
	public void setThreadId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>performance_schema.events_waits_current.THREAD_ID</code>.
	 */
	public java.lang.Integer getThreadId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>performance_schema.events_waits_current.EVENT_ID</code>.
	 */
	public void setEventId(org.jooq.types.ULong value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>performance_schema.events_waits_current.EVENT_ID</code>.
	 */
	public org.jooq.types.ULong getEventId() {
		return (org.jooq.types.ULong) getValue(1);
	}

	/**
	 * Setter for <code>performance_schema.events_waits_current.EVENT_NAME</code>.
	 */
	public void setEventName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>performance_schema.events_waits_current.EVENT_NAME</code>.
	 */
	public java.lang.String getEventName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>performance_schema.events_waits_current.SOURCE</code>.
	 */
	public void setSource(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>performance_schema.events_waits_current.SOURCE</code>.
	 */
	public java.lang.String getSource() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>performance_schema.events_waits_current.TIMER_START</code>.
	 */
	public void setTimerStart(org.jooq.types.ULong value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>performance_schema.events_waits_current.TIMER_START</code>.
	 */
	public org.jooq.types.ULong getTimerStart() {
		return (org.jooq.types.ULong) getValue(4);
	}

	/**
	 * Setter for <code>performance_schema.events_waits_current.TIMER_END</code>.
	 */
	public void setTimerEnd(org.jooq.types.ULong value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>performance_schema.events_waits_current.TIMER_END</code>.
	 */
	public org.jooq.types.ULong getTimerEnd() {
		return (org.jooq.types.ULong) getValue(5);
	}

	/**
	 * Setter for <code>performance_schema.events_waits_current.TIMER_WAIT</code>.
	 */
	public void setTimerWait(org.jooq.types.ULong value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>performance_schema.events_waits_current.TIMER_WAIT</code>.
	 */
	public org.jooq.types.ULong getTimerWait() {
		return (org.jooq.types.ULong) getValue(6);
	}

	/**
	 * Setter for <code>performance_schema.events_waits_current.SPINS</code>.
	 */
	public void setSpins(org.jooq.types.UInteger value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>performance_schema.events_waits_current.SPINS</code>.
	 */
	public org.jooq.types.UInteger getSpins() {
		return (org.jooq.types.UInteger) getValue(7);
	}

	/**
	 * Setter for <code>performance_schema.events_waits_current.OBJECT_SCHEMA</code>.
	 */
	public void setObjectSchema(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>performance_schema.events_waits_current.OBJECT_SCHEMA</code>.
	 */
	public java.lang.String getObjectSchema() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>performance_schema.events_waits_current.OBJECT_NAME</code>.
	 */
	public void setObjectName(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>performance_schema.events_waits_current.OBJECT_NAME</code>.
	 */
	public java.lang.String getObjectName() {
		return (java.lang.String) getValue(9);
	}

	/**
	 * Setter for <code>performance_schema.events_waits_current.OBJECT_TYPE</code>.
	 */
	public void setObjectType(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>performance_schema.events_waits_current.OBJECT_TYPE</code>.
	 */
	public java.lang.String getObjectType() {
		return (java.lang.String) getValue(10);
	}

	/**
	 * Setter for <code>performance_schema.events_waits_current.OBJECT_INSTANCE_BEGIN</code>.
	 */
	public void setObjectInstanceBegin(java.lang.Long value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>performance_schema.events_waits_current.OBJECT_INSTANCE_BEGIN</code>.
	 */
	public java.lang.Long getObjectInstanceBegin() {
		return (java.lang.Long) getValue(11);
	}

	/**
	 * Setter for <code>performance_schema.events_waits_current.NESTING_EVENT_ID</code>.
	 */
	public void setNestingEventId(org.jooq.types.ULong value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>performance_schema.events_waits_current.NESTING_EVENT_ID</code>.
	 */
	public org.jooq.types.ULong getNestingEventId() {
		return (org.jooq.types.ULong) getValue(12);
	}

	/**
	 * Setter for <code>performance_schema.events_waits_current.OPERATION</code>.
	 */
	public void setOperation(java.lang.String value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>performance_schema.events_waits_current.OPERATION</code>.
	 */
	public java.lang.String getOperation() {
		return (java.lang.String) getValue(13);
	}

	/**
	 * Setter for <code>performance_schema.events_waits_current.NUMBER_OF_BYTES</code>.
	 */
	public void setNumberOfBytes(org.jooq.types.ULong value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>performance_schema.events_waits_current.NUMBER_OF_BYTES</code>.
	 */
	public org.jooq.types.ULong getNumberOfBytes() {
		return (org.jooq.types.ULong) getValue(14);
	}

	/**
	 * Setter for <code>performance_schema.events_waits_current.FLAGS</code>.
	 */
	public void setFlags(org.jooq.types.UInteger value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>performance_schema.events_waits_current.FLAGS</code>.
	 */
	public org.jooq.types.UInteger getFlags() {
		return (org.jooq.types.UInteger) getValue(15);
	}

	// -------------------------------------------------------------------------
	// Record16 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row16<java.lang.Integer, org.jooq.types.ULong, java.lang.String, java.lang.String, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.UInteger, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, org.jooq.types.ULong, java.lang.String, org.jooq.types.ULong, org.jooq.types.UInteger> fieldsRow() {
		return (org.jooq.Row16) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row16<java.lang.Integer, org.jooq.types.ULong, java.lang.String, java.lang.String, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.UInteger, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, org.jooq.types.ULong, java.lang.String, org.jooq.types.ULong, org.jooq.types.UInteger> valuesRow() {
		return (org.jooq.Row16) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return cleandb.performance_schema.tables.EventsWaitsCurrent.EVENTS_WAITS_CURRENT.THREAD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field2() {
		return cleandb.performance_schema.tables.EventsWaitsCurrent.EVENTS_WAITS_CURRENT.EVENT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return cleandb.performance_schema.tables.EventsWaitsCurrent.EVENTS_WAITS_CURRENT.EVENT_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return cleandb.performance_schema.tables.EventsWaitsCurrent.EVENTS_WAITS_CURRENT.SOURCE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field5() {
		return cleandb.performance_schema.tables.EventsWaitsCurrent.EVENTS_WAITS_CURRENT.TIMER_START;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field6() {
		return cleandb.performance_schema.tables.EventsWaitsCurrent.EVENTS_WAITS_CURRENT.TIMER_END;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field7() {
		return cleandb.performance_schema.tables.EventsWaitsCurrent.EVENTS_WAITS_CURRENT.TIMER_WAIT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.UInteger> field8() {
		return cleandb.performance_schema.tables.EventsWaitsCurrent.EVENTS_WAITS_CURRENT.SPINS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return cleandb.performance_schema.tables.EventsWaitsCurrent.EVENTS_WAITS_CURRENT.OBJECT_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return cleandb.performance_schema.tables.EventsWaitsCurrent.EVENTS_WAITS_CURRENT.OBJECT_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return cleandb.performance_schema.tables.EventsWaitsCurrent.EVENTS_WAITS_CURRENT.OBJECT_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field12() {
		return cleandb.performance_schema.tables.EventsWaitsCurrent.EVENTS_WAITS_CURRENT.OBJECT_INSTANCE_BEGIN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field13() {
		return cleandb.performance_schema.tables.EventsWaitsCurrent.EVENTS_WAITS_CURRENT.NESTING_EVENT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field14() {
		return cleandb.performance_schema.tables.EventsWaitsCurrent.EVENTS_WAITS_CURRENT.OPERATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field15() {
		return cleandb.performance_schema.tables.EventsWaitsCurrent.EVENTS_WAITS_CURRENT.NUMBER_OF_BYTES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.UInteger> field16() {
		return cleandb.performance_schema.tables.EventsWaitsCurrent.EVENTS_WAITS_CURRENT.FLAGS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getThreadId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value2() {
		return getEventId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getEventName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getSource();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value5() {
		return getTimerStart();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value6() {
		return getTimerEnd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value7() {
		return getTimerWait();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.UInteger value8() {
		return getSpins();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getObjectSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return getObjectName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return getObjectType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value12() {
		return getObjectInstanceBegin();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value13() {
		return getNestingEventId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value14() {
		return getOperation();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value15() {
		return getNumberOfBytes();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.UInteger value16() {
		return getFlags();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsWaitsCurrentRecord value1(java.lang.Integer value) {
		setThreadId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsWaitsCurrentRecord value2(org.jooq.types.ULong value) {
		setEventId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsWaitsCurrentRecord value3(java.lang.String value) {
		setEventName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsWaitsCurrentRecord value4(java.lang.String value) {
		setSource(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsWaitsCurrentRecord value5(org.jooq.types.ULong value) {
		setTimerStart(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsWaitsCurrentRecord value6(org.jooq.types.ULong value) {
		setTimerEnd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsWaitsCurrentRecord value7(org.jooq.types.ULong value) {
		setTimerWait(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsWaitsCurrentRecord value8(org.jooq.types.UInteger value) {
		setSpins(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsWaitsCurrentRecord value9(java.lang.String value) {
		setObjectSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsWaitsCurrentRecord value10(java.lang.String value) {
		setObjectName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsWaitsCurrentRecord value11(java.lang.String value) {
		setObjectType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsWaitsCurrentRecord value12(java.lang.Long value) {
		setObjectInstanceBegin(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsWaitsCurrentRecord value13(org.jooq.types.ULong value) {
		setNestingEventId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsWaitsCurrentRecord value14(java.lang.String value) {
		setOperation(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsWaitsCurrentRecord value15(org.jooq.types.ULong value) {
		setNumberOfBytes(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsWaitsCurrentRecord value16(org.jooq.types.UInteger value) {
		setFlags(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsWaitsCurrentRecord values(java.lang.Integer value1, org.jooq.types.ULong value2, java.lang.String value3, java.lang.String value4, org.jooq.types.ULong value5, org.jooq.types.ULong value6, org.jooq.types.ULong value7, org.jooq.types.UInteger value8, java.lang.String value9, java.lang.String value10, java.lang.String value11, java.lang.Long value12, org.jooq.types.ULong value13, java.lang.String value14, org.jooq.types.ULong value15, org.jooq.types.UInteger value16) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached EventsWaitsCurrentRecord
	 */
	public EventsWaitsCurrentRecord() {
		super(cleandb.performance_schema.tables.EventsWaitsCurrent.EVENTS_WAITS_CURRENT);
	}

	/**
	 * Create a detached, initialised EventsWaitsCurrentRecord
	 */
	public EventsWaitsCurrentRecord(java.lang.Integer threadId, org.jooq.types.ULong eventId, java.lang.String eventName, java.lang.String source, org.jooq.types.ULong timerStart, org.jooq.types.ULong timerEnd, org.jooq.types.ULong timerWait, org.jooq.types.UInteger spins, java.lang.String objectSchema, java.lang.String objectName, java.lang.String objectType, java.lang.Long objectInstanceBegin, org.jooq.types.ULong nestingEventId, java.lang.String operation, org.jooq.types.ULong numberOfBytes, org.jooq.types.UInteger flags) {
		super(cleandb.performance_schema.tables.EventsWaitsCurrent.EVENTS_WAITS_CURRENT);

		setValue(0, threadId);
		setValue(1, eventId);
		setValue(2, eventName);
		setValue(3, source);
		setValue(4, timerStart);
		setValue(5, timerEnd);
		setValue(6, timerWait);
		setValue(7, spins);
		setValue(8, objectSchema);
		setValue(9, objectName);
		setValue(10, objectType);
		setValue(11, objectInstanceBegin);
		setValue(12, nestingEventId);
		setValue(13, operation);
		setValue(14, numberOfBytes);
		setValue(15, flags);
	}
}
