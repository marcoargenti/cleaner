/**
 * This class is generated by jOOQ
 */
package schema.performance_schema.tables.records;

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
public class EventsWaitsSummaryGlobalByEventNameRecord extends org.jooq.impl.TableRecordImpl<schema.performance_schema.tables.records.EventsWaitsSummaryGlobalByEventNameRecord> implements org.jooq.Record6<java.lang.String, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong> {

	private static final long serialVersionUID = -1766404757;

	/**
	 * Setter for <code>performance_schema.events_waits_summary_global_by_event_name.EVENT_NAME</code>.
	 */
	public void setEventName(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>performance_schema.events_waits_summary_global_by_event_name.EVENT_NAME</code>.
	 */
	public java.lang.String getEventName() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>performance_schema.events_waits_summary_global_by_event_name.COUNT_STAR</code>.
	 */
	public void setCountStar(org.jooq.types.ULong value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>performance_schema.events_waits_summary_global_by_event_name.COUNT_STAR</code>.
	 */
	public org.jooq.types.ULong getCountStar() {
		return (org.jooq.types.ULong) getValue(1);
	}

	/**
	 * Setter for <code>performance_schema.events_waits_summary_global_by_event_name.SUM_TIMER_WAIT</code>.
	 */
	public void setSumTimerWait(org.jooq.types.ULong value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>performance_schema.events_waits_summary_global_by_event_name.SUM_TIMER_WAIT</code>.
	 */
	public org.jooq.types.ULong getSumTimerWait() {
		return (org.jooq.types.ULong) getValue(2);
	}

	/**
	 * Setter for <code>performance_schema.events_waits_summary_global_by_event_name.MIN_TIMER_WAIT</code>.
	 */
	public void setMinTimerWait(org.jooq.types.ULong value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>performance_schema.events_waits_summary_global_by_event_name.MIN_TIMER_WAIT</code>.
	 */
	public org.jooq.types.ULong getMinTimerWait() {
		return (org.jooq.types.ULong) getValue(3);
	}

	/**
	 * Setter for <code>performance_schema.events_waits_summary_global_by_event_name.AVG_TIMER_WAIT</code>.
	 */
	public void setAvgTimerWait(org.jooq.types.ULong value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>performance_schema.events_waits_summary_global_by_event_name.AVG_TIMER_WAIT</code>.
	 */
	public org.jooq.types.ULong getAvgTimerWait() {
		return (org.jooq.types.ULong) getValue(4);
	}

	/**
	 * Setter for <code>performance_schema.events_waits_summary_global_by_event_name.MAX_TIMER_WAIT</code>.
	 */
	public void setMaxTimerWait(org.jooq.types.ULong value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>performance_schema.events_waits_summary_global_by_event_name.MAX_TIMER_WAIT</code>.
	 */
	public org.jooq.types.ULong getMaxTimerWait() {
		return (org.jooq.types.ULong) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.String, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.String, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return schema.performance_schema.tables.EventsWaitsSummaryGlobalByEventName.EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME.EVENT_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field2() {
		return schema.performance_schema.tables.EventsWaitsSummaryGlobalByEventName.EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME.COUNT_STAR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field3() {
		return schema.performance_schema.tables.EventsWaitsSummaryGlobalByEventName.EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME.SUM_TIMER_WAIT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field4() {
		return schema.performance_schema.tables.EventsWaitsSummaryGlobalByEventName.EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME.MIN_TIMER_WAIT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field5() {
		return schema.performance_schema.tables.EventsWaitsSummaryGlobalByEventName.EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME.AVG_TIMER_WAIT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field6() {
		return schema.performance_schema.tables.EventsWaitsSummaryGlobalByEventName.EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME.MAX_TIMER_WAIT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getEventName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value2() {
		return getCountStar();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value3() {
		return getSumTimerWait();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value4() {
		return getMinTimerWait();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value5() {
		return getAvgTimerWait();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value6() {
		return getMaxTimerWait();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsWaitsSummaryGlobalByEventNameRecord value1(java.lang.String value) {
		setEventName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsWaitsSummaryGlobalByEventNameRecord value2(org.jooq.types.ULong value) {
		setCountStar(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsWaitsSummaryGlobalByEventNameRecord value3(org.jooq.types.ULong value) {
		setSumTimerWait(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsWaitsSummaryGlobalByEventNameRecord value4(org.jooq.types.ULong value) {
		setMinTimerWait(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsWaitsSummaryGlobalByEventNameRecord value5(org.jooq.types.ULong value) {
		setAvgTimerWait(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsWaitsSummaryGlobalByEventNameRecord value6(org.jooq.types.ULong value) {
		setMaxTimerWait(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsWaitsSummaryGlobalByEventNameRecord values(java.lang.String value1, org.jooq.types.ULong value2, org.jooq.types.ULong value3, org.jooq.types.ULong value4, org.jooq.types.ULong value5, org.jooq.types.ULong value6) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached EventsWaitsSummaryGlobalByEventNameRecord
	 */
	public EventsWaitsSummaryGlobalByEventNameRecord() {
		super(schema.performance_schema.tables.EventsWaitsSummaryGlobalByEventName.EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME);
	}

	/**
	 * Create a detached, initialised EventsWaitsSummaryGlobalByEventNameRecord
	 */
	public EventsWaitsSummaryGlobalByEventNameRecord(java.lang.String eventName, org.jooq.types.ULong countStar, org.jooq.types.ULong sumTimerWait, org.jooq.types.ULong minTimerWait, org.jooq.types.ULong avgTimerWait, org.jooq.types.ULong maxTimerWait) {
		super(schema.performance_schema.tables.EventsWaitsSummaryGlobalByEventName.EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME);

		setValue(0, eventName);
		setValue(1, countStar);
		setValue(2, sumTimerWait);
		setValue(3, minTimerWait);
		setValue(4, avgTimerWait);
		setValue(5, maxTimerWait);
	}
}
