/**
 * This class is generated by jOOQ
 */
package cleandb.mysql.tables;

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
public class HelpTopic extends org.jooq.impl.TableImpl<cleandb.mysql.tables.records.HelpTopicRecord> {

	private static final long serialVersionUID = -1673707624;

	/**
	 * The reference instance of <code>mysql.help_topic</code>
	 */
	public static final cleandb.mysql.tables.HelpTopic HELP_TOPIC = new cleandb.mysql.tables.HelpTopic();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<cleandb.mysql.tables.records.HelpTopicRecord> getRecordType() {
		return cleandb.mysql.tables.records.HelpTopicRecord.class;
	}

	/**
	 * The column <code>mysql.help_topic.help_topic_id</code>.
	 */
	public final org.jooq.TableField<cleandb.mysql.tables.records.HelpTopicRecord, org.jooq.types.UInteger> HELP_TOPIC_ID = createField("help_topic_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>mysql.help_topic.name</code>.
	 */
	public final org.jooq.TableField<cleandb.mysql.tables.records.HelpTopicRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.CHAR.length(64).nullable(false), this, "");

	/**
	 * The column <code>mysql.help_topic.help_category_id</code>.
	 */
	public final org.jooq.TableField<cleandb.mysql.tables.records.HelpTopicRecord, org.jooq.types.UShort> HELP_CATEGORY_ID = createField("help_category_id", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>mysql.help_topic.description</code>.
	 */
	public final org.jooq.TableField<cleandb.mysql.tables.records.HelpTopicRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.length(65535).nullable(false), this, "");

	/**
	 * The column <code>mysql.help_topic.example</code>.
	 */
	public final org.jooq.TableField<cleandb.mysql.tables.records.HelpTopicRecord, java.lang.String> EXAMPLE = createField("example", org.jooq.impl.SQLDataType.CLOB.length(65535).nullable(false), this, "");

	/**
	 * The column <code>mysql.help_topic.url</code>.
	 */
	public final org.jooq.TableField<cleandb.mysql.tables.records.HelpTopicRecord, java.lang.String> URL = createField("url", org.jooq.impl.SQLDataType.CLOB.length(65535).nullable(false), this, "");

	/**
	 * Create a <code>mysql.help_topic</code> table reference
	 */
	public HelpTopic() {
		this("help_topic", null);
	}

	/**
	 * Create an aliased <code>mysql.help_topic</code> table reference
	 */
	public HelpTopic(java.lang.String alias) {
		this(alias, cleandb.mysql.tables.HelpTopic.HELP_TOPIC);
	}

	private HelpTopic(java.lang.String alias, org.jooq.Table<cleandb.mysql.tables.records.HelpTopicRecord> aliased) {
		this(alias, aliased, null);
	}

	private HelpTopic(java.lang.String alias, org.jooq.Table<cleandb.mysql.tables.records.HelpTopicRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, cleandb.mysql.Mysql.MYSQL, aliased, parameters, "help topics");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<cleandb.mysql.tables.records.HelpTopicRecord> getPrimaryKey() {
		return cleandb.mysql.Keys.KEY_HELP_TOPIC_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<cleandb.mysql.tables.records.HelpTopicRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<cleandb.mysql.tables.records.HelpTopicRecord>>asList(cleandb.mysql.Keys.KEY_HELP_TOPIC_PRIMARY, cleandb.mysql.Keys.KEY_HELP_TOPIC_NAME);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public cleandb.mysql.tables.HelpTopic as(java.lang.String alias) {
		return new cleandb.mysql.tables.HelpTopic(alias, this);
	}

	/**
	 * Rename this table
	 */
	public cleandb.mysql.tables.HelpTopic rename(java.lang.String name) {
		return new cleandb.mysql.tables.HelpTopic(name, null);
	}
}
