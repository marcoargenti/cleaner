/**
 * This class is generated by jOOQ
 */
package cleandb.mysql.tables;

/**
 * MySQL plugins
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.4"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Plugin extends org.jooq.impl.TableImpl<cleandb.mysql.tables.records.PluginRecord> {

	private static final long serialVersionUID = -1788911513;

	/**
	 * The reference instance of <code>mysql.plugin</code>
	 */
	public static final cleandb.mysql.tables.Plugin PLUGIN = new cleandb.mysql.tables.Plugin();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<cleandb.mysql.tables.records.PluginRecord> getRecordType() {
		return cleandb.mysql.tables.records.PluginRecord.class;
	}

	/**
	 * The column <code>mysql.plugin.name</code>.
	 */
	public final org.jooq.TableField<cleandb.mysql.tables.records.PluginRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.plugin.dl</code>.
	 */
	public final org.jooq.TableField<cleandb.mysql.tables.records.PluginRecord, java.lang.String> DL = createField("dl", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>mysql.plugin</code> table reference
	 */
	public Plugin() {
		this("plugin", null);
	}

	/**
	 * Create an aliased <code>mysql.plugin</code> table reference
	 */
	public Plugin(java.lang.String alias) {
		this(alias, cleandb.mysql.tables.Plugin.PLUGIN);
	}

	private Plugin(java.lang.String alias, org.jooq.Table<cleandb.mysql.tables.records.PluginRecord> aliased) {
		this(alias, aliased, null);
	}

	private Plugin(java.lang.String alias, org.jooq.Table<cleandb.mysql.tables.records.PluginRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, cleandb.mysql.Mysql.MYSQL, aliased, parameters, "MySQL plugins");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<cleandb.mysql.tables.records.PluginRecord> getPrimaryKey() {
		return cleandb.mysql.Keys.KEY_PLUGIN_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<cleandb.mysql.tables.records.PluginRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<cleandb.mysql.tables.records.PluginRecord>>asList(cleandb.mysql.Keys.KEY_PLUGIN_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public cleandb.mysql.tables.Plugin as(java.lang.String alias) {
		return new cleandb.mysql.tables.Plugin(alias, this);
	}

	/**
	 * Rename this table
	 */
	public cleandb.mysql.tables.Plugin rename(java.lang.String name) {
		return new cleandb.mysql.tables.Plugin(name, null);
	}
}
