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
public class ActIdMembershipRecord extends org.jooq.impl.UpdatableRecordImpl<schema.process_engine.tables.records.ActIdMembershipRecord> implements org.jooq.Record2<java.lang.String, java.lang.String> {

	private static final long serialVersionUID = 1159944190;

	/**
	 * Setter for <code>process-engine.ACT_ID_MEMBERSHIP.USER_ID_</code>.
	 */
	public void setUserId_(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_ID_MEMBERSHIP.USER_ID_</code>.
	 */
	public java.lang.String getUserId_() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>process-engine.ACT_ID_MEMBERSHIP.GROUP_ID_</code>.
	 */
	public void setGroupId_(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>process-engine.ACT_ID_MEMBERSHIP.GROUP_ID_</code>.
	 */
	public java.lang.String getGroupId_() {
		return (java.lang.String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record2<java.lang.String, java.lang.String> key() {
		return (org.jooq.Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return schema.process_engine.tables.ActIdMembership.ACT_ID_MEMBERSHIP.USER_ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return schema.process_engine.tables.ActIdMembership.ACT_ID_MEMBERSHIP.GROUP_ID_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getUserId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getGroupId_();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActIdMembershipRecord value1(java.lang.String value) {
		setUserId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActIdMembershipRecord value2(java.lang.String value) {
		setGroupId_(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ActIdMembershipRecord values(java.lang.String value1, java.lang.String value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ActIdMembershipRecord
	 */
	public ActIdMembershipRecord() {
		super(schema.process_engine.tables.ActIdMembership.ACT_ID_MEMBERSHIP);
	}

	/**
	 * Create a detached, initialised ActIdMembershipRecord
	 */
	public ActIdMembershipRecord(java.lang.String userId_, java.lang.String groupId_) {
		super(schema.process_engine.tables.ActIdMembership.ACT_ID_MEMBERSHIP);

		setValue(0, userId_);
		setValue(1, groupId_);
	}
}
