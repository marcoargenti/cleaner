/**
 * This class is generated by jOOQ
 */
package cleandb.mysql.tables.records;

/**
 * Time zone transitions
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.4"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TimeZoneTransitionRecord extends org.jooq.impl.UpdatableRecordImpl<cleandb.mysql.tables.records.TimeZoneTransitionRecord> implements org.jooq.Record3<org.jooq.types.UInteger, java.lang.Long, org.jooq.types.UInteger> {

	private static final long serialVersionUID = 1800273471;

	/**
	 * Setter for <code>mysql.time_zone_transition.Time_zone_id</code>.
	 */
	public void setTimeZoneId(org.jooq.types.UInteger value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mysql.time_zone_transition.Time_zone_id</code>.
	 */
	public org.jooq.types.UInteger getTimeZoneId() {
		return (org.jooq.types.UInteger) getValue(0);
	}

	/**
	 * Setter for <code>mysql.time_zone_transition.Transition_time</code>.
	 */
	public void setTransitionTime(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mysql.time_zone_transition.Transition_time</code>.
	 */
	public java.lang.Long getTransitionTime() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>mysql.time_zone_transition.Transition_type_id</code>.
	 */
	public void setTransitionTypeId(org.jooq.types.UInteger value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>mysql.time_zone_transition.Transition_type_id</code>.
	 */
	public org.jooq.types.UInteger getTransitionTypeId() {
		return (org.jooq.types.UInteger) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record2<org.jooq.types.UInteger, java.lang.Long> key() {
		return (org.jooq.Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<org.jooq.types.UInteger, java.lang.Long, org.jooq.types.UInteger> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<org.jooq.types.UInteger, java.lang.Long, org.jooq.types.UInteger> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.UInteger> field1() {
		return cleandb.mysql.tables.TimeZoneTransition.TIME_ZONE_TRANSITION.TIME_ZONE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return cleandb.mysql.tables.TimeZoneTransition.TIME_ZONE_TRANSITION.TRANSITION_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.UInteger> field3() {
		return cleandb.mysql.tables.TimeZoneTransition.TIME_ZONE_TRANSITION.TRANSITION_TYPE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.UInteger value1() {
		return getTimeZoneId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value2() {
		return getTransitionTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.UInteger value3() {
		return getTransitionTypeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TimeZoneTransitionRecord value1(org.jooq.types.UInteger value) {
		setTimeZoneId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TimeZoneTransitionRecord value2(java.lang.Long value) {
		setTransitionTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TimeZoneTransitionRecord value3(org.jooq.types.UInteger value) {
		setTransitionTypeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TimeZoneTransitionRecord values(org.jooq.types.UInteger value1, java.lang.Long value2, org.jooq.types.UInteger value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TimeZoneTransitionRecord
	 */
	public TimeZoneTransitionRecord() {
		super(cleandb.mysql.tables.TimeZoneTransition.TIME_ZONE_TRANSITION);
	}

	/**
	 * Create a detached, initialised TimeZoneTransitionRecord
	 */
	public TimeZoneTransitionRecord(org.jooq.types.UInteger timeZoneId, java.lang.Long transitionTime, org.jooq.types.UInteger transitionTypeId) {
		super(cleandb.mysql.tables.TimeZoneTransition.TIME_ZONE_TRANSITION);

		setValue(0, timeZoneId);
		setValue(1, transitionTime);
		setValue(2, transitionTypeId);
	}
}
