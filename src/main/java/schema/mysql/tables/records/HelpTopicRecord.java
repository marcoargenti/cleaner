/**
 * This class is generated by jOOQ
 */
package schema.mysql.tables.records;

/**
 * help topics
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.4"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HelpTopicRecord extends org.jooq.impl.UpdatableRecordImpl<schema.mysql.tables.records.HelpTopicRecord> implements org.jooq.Record6<org.jooq.types.UInteger, java.lang.String, org.jooq.types.UShort, java.lang.String, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -1183072435;

	/**
	 * Setter for <code>mysql.help_topic.help_topic_id</code>.
	 */
	public void setHelpTopicId(org.jooq.types.UInteger value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mysql.help_topic.help_topic_id</code>.
	 */
	public org.jooq.types.UInteger getHelpTopicId() {
		return (org.jooq.types.UInteger) getValue(0);
	}

	/**
	 * Setter for <code>mysql.help_topic.name</code>.
	 */
	public void setName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mysql.help_topic.name</code>.
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>mysql.help_topic.help_category_id</code>.
	 */
	public void setHelpCategoryId(org.jooq.types.UShort value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>mysql.help_topic.help_category_id</code>.
	 */
	public org.jooq.types.UShort getHelpCategoryId() {
		return (org.jooq.types.UShort) getValue(2);
	}

	/**
	 * Setter for <code>mysql.help_topic.description</code>.
	 */
	public void setDescription(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>mysql.help_topic.description</code>.
	 */
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>mysql.help_topic.example</code>.
	 */
	public void setExample(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>mysql.help_topic.example</code>.
	 */
	public java.lang.String getExample() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>mysql.help_topic.url</code>.
	 */
	public void setUrl(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>mysql.help_topic.url</code>.
	 */
	public java.lang.String getUrl() {
		return (java.lang.String) getValue(5);
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
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<org.jooq.types.UInteger, java.lang.String, org.jooq.types.UShort, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<org.jooq.types.UInteger, java.lang.String, org.jooq.types.UShort, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.UInteger> field1() {
		return schema.mysql.tables.HelpTopic.HELP_TOPIC.HELP_TOPIC_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return schema.mysql.tables.HelpTopic.HELP_TOPIC.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.UShort> field3() {
		return schema.mysql.tables.HelpTopic.HELP_TOPIC.HELP_CATEGORY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return schema.mysql.tables.HelpTopic.HELP_TOPIC.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return schema.mysql.tables.HelpTopic.HELP_TOPIC.EXAMPLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return schema.mysql.tables.HelpTopic.HELP_TOPIC.URL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.UInteger value1() {
		return getHelpTopicId();
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
	public org.jooq.types.UShort value3() {
		return getHelpCategoryId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getExample();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getUrl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HelpTopicRecord value1(org.jooq.types.UInteger value) {
		setHelpTopicId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HelpTopicRecord value2(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HelpTopicRecord value3(org.jooq.types.UShort value) {
		setHelpCategoryId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HelpTopicRecord value4(java.lang.String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HelpTopicRecord value5(java.lang.String value) {
		setExample(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HelpTopicRecord value6(java.lang.String value) {
		setUrl(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HelpTopicRecord values(org.jooq.types.UInteger value1, java.lang.String value2, org.jooq.types.UShort value3, java.lang.String value4, java.lang.String value5, java.lang.String value6) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached HelpTopicRecord
	 */
	public HelpTopicRecord() {
		super(schema.mysql.tables.HelpTopic.HELP_TOPIC);
	}

	/**
	 * Create a detached, initialised HelpTopicRecord
	 */
	public HelpTopicRecord(org.jooq.types.UInteger helpTopicId, java.lang.String name, org.jooq.types.UShort helpCategoryId, java.lang.String description, java.lang.String example, java.lang.String url) {
		super(schema.mysql.tables.HelpTopic.HELP_TOPIC);

		setValue(0, helpTopicId);
		setValue(1, name);
		setValue(2, helpCategoryId);
		setValue(3, description);
		setValue(4, example);
		setValue(5, url);
	}
}
