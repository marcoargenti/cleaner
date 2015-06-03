/**
 * This class is generated by jOOQ
 */
package cleandb.mysql.tables.records;

/**
 * help keywords
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.4"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HelpKeywordRecord extends org.jooq.impl.UpdatableRecordImpl<cleandb.mysql.tables.records.HelpKeywordRecord> implements org.jooq.Record2<org.jooq.types.UInteger, java.lang.String> {

	private static final long serialVersionUID = -839534020;

	/**
	 * Setter for <code>mysql.help_keyword.help_keyword_id</code>.
	 */
	public void setHelpKeywordId(org.jooq.types.UInteger value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mysql.help_keyword.help_keyword_id</code>.
	 */
	public org.jooq.types.UInteger getHelpKeywordId() {
		return (org.jooq.types.UInteger) getValue(0);
	}

	/**
	 * Setter for <code>mysql.help_keyword.name</code>.
	 */
	public void setName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mysql.help_keyword.name</code>.
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<org.jooq.types.UInteger> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<org.jooq.types.UInteger, java.lang.String> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<org.jooq.types.UInteger, java.lang.String> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.UInteger> field1() {
		return cleandb.mysql.tables.HelpKeyword.HELP_KEYWORD.HELP_KEYWORD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return cleandb.mysql.tables.HelpKeyword.HELP_KEYWORD.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.UInteger value1() {
		return getHelpKeywordId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HelpKeywordRecord value1(org.jooq.types.UInteger value) {
		setHelpKeywordId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HelpKeywordRecord value2(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HelpKeywordRecord values(org.jooq.types.UInteger value1, java.lang.String value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached HelpKeywordRecord
	 */
	public HelpKeywordRecord() {
		super(cleandb.mysql.tables.HelpKeyword.HELP_KEYWORD);
	}

	/**
	 * Create a detached, initialised HelpKeywordRecord
	 */
	public HelpKeywordRecord(org.jooq.types.UInteger helpKeywordId, java.lang.String name) {
		super(cleandb.mysql.tables.HelpKeyword.HELP_KEYWORD);

		setValue(0, helpKeywordId);
		setValue(1, name);
	}
}
