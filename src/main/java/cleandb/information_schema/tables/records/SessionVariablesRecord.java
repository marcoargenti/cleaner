/**
 * This class is generated by jOOQ
 */
package cleandb.information_schema.tables.records;

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
public class SessionVariablesRecord extends org.jooq.impl.TableRecordImpl<cleandb.information_schema.tables.records.SessionVariablesRecord> implements org.jooq.Record2<java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -54496967;

	/**
	 * Setter for <code>information_schema.SESSION_VARIABLES.VARIABLE_NAME</code>.
	 */
	public void setVariableName(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.SESSION_VARIABLES.VARIABLE_NAME</code>.
	 */
	public java.lang.String getVariableName() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.SESSION_VARIABLES.VARIABLE_VALUE</code>.
	 */
	public void setVariableValue(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.SESSION_VARIABLES.VARIABLE_VALUE</code>.
	 */
	public java.lang.String getVariableValue() {
		return (java.lang.String) getValue(1);
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
		return cleandb.information_schema.tables.SessionVariables.SESSION_VARIABLES.VARIABLE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return cleandb.information_schema.tables.SessionVariables.SESSION_VARIABLES.VARIABLE_VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getVariableName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getVariableValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SessionVariablesRecord value1(java.lang.String value) {
		setVariableName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SessionVariablesRecord value2(java.lang.String value) {
		setVariableValue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SessionVariablesRecord values(java.lang.String value1, java.lang.String value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SessionVariablesRecord
	 */
	public SessionVariablesRecord() {
		super(cleandb.information_schema.tables.SessionVariables.SESSION_VARIABLES);
	}

	/**
	 * Create a detached, initialised SessionVariablesRecord
	 */
	public SessionVariablesRecord(java.lang.String variableName, java.lang.String variableValue) {
		super(cleandb.information_schema.tables.SessionVariables.SESSION_VARIABLES);

		setValue(0, variableName);
		setValue(1, variableValue);
	}
}
