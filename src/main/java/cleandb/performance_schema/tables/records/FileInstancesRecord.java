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
public class FileInstancesRecord extends org.jooq.impl.TableRecordImpl<cleandb.performance_schema.tables.records.FileInstancesRecord> implements org.jooq.Record3<java.lang.String, java.lang.String, org.jooq.types.UInteger> {

	private static final long serialVersionUID = -196726288;

	/**
	 * Setter for <code>performance_schema.file_instances.FILE_NAME</code>.
	 */
	public void setFileName(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>performance_schema.file_instances.FILE_NAME</code>.
	 */
	public java.lang.String getFileName() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>performance_schema.file_instances.EVENT_NAME</code>.
	 */
	public void setEventName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>performance_schema.file_instances.EVENT_NAME</code>.
	 */
	public java.lang.String getEventName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>performance_schema.file_instances.OPEN_COUNT</code>.
	 */
	public void setOpenCount(org.jooq.types.UInteger value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>performance_schema.file_instances.OPEN_COUNT</code>.
	 */
	public org.jooq.types.UInteger getOpenCount() {
		return (org.jooq.types.UInteger) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.String, java.lang.String, org.jooq.types.UInteger> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.String, java.lang.String, org.jooq.types.UInteger> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return cleandb.performance_schema.tables.FileInstances.FILE_INSTANCES.FILE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return cleandb.performance_schema.tables.FileInstances.FILE_INSTANCES.EVENT_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.UInteger> field3() {
		return cleandb.performance_schema.tables.FileInstances.FILE_INSTANCES.OPEN_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getFileName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getEventName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.UInteger value3() {
		return getOpenCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FileInstancesRecord value1(java.lang.String value) {
		setFileName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FileInstancesRecord value2(java.lang.String value) {
		setEventName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FileInstancesRecord value3(org.jooq.types.UInteger value) {
		setOpenCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FileInstancesRecord values(java.lang.String value1, java.lang.String value2, org.jooq.types.UInteger value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached FileInstancesRecord
	 */
	public FileInstancesRecord() {
		super(cleandb.performance_schema.tables.FileInstances.FILE_INSTANCES);
	}

	/**
	 * Create a detached, initialised FileInstancesRecord
	 */
	public FileInstancesRecord(java.lang.String fileName, java.lang.String eventName, org.jooq.types.UInteger openCount) {
		super(cleandb.performance_schema.tables.FileInstances.FILE_INSTANCES);

		setValue(0, fileName);
		setValue(1, eventName);
		setValue(2, openCount);
	}
}
