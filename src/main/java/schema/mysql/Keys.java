/**
 * This class is generated by jOOQ
 */
package schema.mysql;

/**
 * A class modelling foreign key relationships between tables of the <code>mysql</code> 
 * schema
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.4"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.Identity<schema.mysql.tables.records.TimeZoneRecord, org.jooq.types.UInteger> IDENTITY_TIME_ZONE = Identities0.IDENTITY_TIME_ZONE;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<schema.mysql.tables.records.ColumnsPrivRecord> KEY_COLUMNS_PRIV_PRIMARY = UniqueKeys0.KEY_COLUMNS_PRIV_PRIMARY;
	public static final org.jooq.UniqueKey<schema.mysql.tables.records.DbRecord> KEY_DB_PRIMARY = UniqueKeys0.KEY_DB_PRIMARY;
	public static final org.jooq.UniqueKey<schema.mysql.tables.records.EventRecord> KEY_EVENT_PRIMARY = UniqueKeys0.KEY_EVENT_PRIMARY;
	public static final org.jooq.UniqueKey<schema.mysql.tables.records.FuncRecord> KEY_FUNC_PRIMARY = UniqueKeys0.KEY_FUNC_PRIMARY;
	public static final org.jooq.UniqueKey<schema.mysql.tables.records.HelpCategoryRecord> KEY_HELP_CATEGORY_PRIMARY = UniqueKeys0.KEY_HELP_CATEGORY_PRIMARY;
	public static final org.jooq.UniqueKey<schema.mysql.tables.records.HelpCategoryRecord> KEY_HELP_CATEGORY_NAME = UniqueKeys0.KEY_HELP_CATEGORY_NAME;
	public static final org.jooq.UniqueKey<schema.mysql.tables.records.HelpKeywordRecord> KEY_HELP_KEYWORD_PRIMARY = UniqueKeys0.KEY_HELP_KEYWORD_PRIMARY;
	public static final org.jooq.UniqueKey<schema.mysql.tables.records.HelpKeywordRecord> KEY_HELP_KEYWORD_NAME = UniqueKeys0.KEY_HELP_KEYWORD_NAME;
	public static final org.jooq.UniqueKey<schema.mysql.tables.records.HelpRelationRecord> KEY_HELP_RELATION_PRIMARY = UniqueKeys0.KEY_HELP_RELATION_PRIMARY;
	public static final org.jooq.UniqueKey<schema.mysql.tables.records.HelpTopicRecord> KEY_HELP_TOPIC_PRIMARY = UniqueKeys0.KEY_HELP_TOPIC_PRIMARY;
	public static final org.jooq.UniqueKey<schema.mysql.tables.records.HelpTopicRecord> KEY_HELP_TOPIC_NAME = UniqueKeys0.KEY_HELP_TOPIC_NAME;
	public static final org.jooq.UniqueKey<schema.mysql.tables.records.HostRecord> KEY_HOST_PRIMARY = UniqueKeys0.KEY_HOST_PRIMARY;
	public static final org.jooq.UniqueKey<schema.mysql.tables.records.NdbBinlogIndexRecord> KEY_NDB_BINLOG_INDEX_PRIMARY = UniqueKeys0.KEY_NDB_BINLOG_INDEX_PRIMARY;
	public static final org.jooq.UniqueKey<schema.mysql.tables.records.PluginRecord> KEY_PLUGIN_PRIMARY = UniqueKeys0.KEY_PLUGIN_PRIMARY;
	public static final org.jooq.UniqueKey<schema.mysql.tables.records.ProcRecord> KEY_PROC_PRIMARY = UniqueKeys0.KEY_PROC_PRIMARY;
	public static final org.jooq.UniqueKey<schema.mysql.tables.records.ProcsPrivRecord> KEY_PROCS_PRIV_PRIMARY = UniqueKeys0.KEY_PROCS_PRIV_PRIMARY;
	public static final org.jooq.UniqueKey<schema.mysql.tables.records.ProxiesPrivRecord> KEY_PROXIES_PRIV_PRIMARY = UniqueKeys0.KEY_PROXIES_PRIV_PRIMARY;
	public static final org.jooq.UniqueKey<schema.mysql.tables.records.ServersRecord> KEY_SERVERS_PRIMARY = UniqueKeys0.KEY_SERVERS_PRIMARY;
	public static final org.jooq.UniqueKey<schema.mysql.tables.records.TablesPrivRecord> KEY_TABLES_PRIV_PRIMARY = UniqueKeys0.KEY_TABLES_PRIV_PRIMARY;
	public static final org.jooq.UniqueKey<schema.mysql.tables.records.TimeZoneRecord> KEY_TIME_ZONE_PRIMARY = UniqueKeys0.KEY_TIME_ZONE_PRIMARY;
	public static final org.jooq.UniqueKey<schema.mysql.tables.records.TimeZoneLeapSecondRecord> KEY_TIME_ZONE_LEAP_SECOND_PRIMARY = UniqueKeys0.KEY_TIME_ZONE_LEAP_SECOND_PRIMARY;
	public static final org.jooq.UniqueKey<schema.mysql.tables.records.TimeZoneNameRecord> KEY_TIME_ZONE_NAME_PRIMARY = UniqueKeys0.KEY_TIME_ZONE_NAME_PRIMARY;
	public static final org.jooq.UniqueKey<schema.mysql.tables.records.TimeZoneTransitionRecord> KEY_TIME_ZONE_TRANSITION_PRIMARY = UniqueKeys0.KEY_TIME_ZONE_TRANSITION_PRIMARY;
	public static final org.jooq.UniqueKey<schema.mysql.tables.records.TimeZoneTransitionTypeRecord> KEY_TIME_ZONE_TRANSITION_TYPE_PRIMARY = UniqueKeys0.KEY_TIME_ZONE_TRANSITION_TYPE_PRIMARY;
	public static final org.jooq.UniqueKey<schema.mysql.tables.records.UserRecord> KEY_USER_PRIMARY = UniqueKeys0.KEY_USER_PRIMARY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends org.jooq.impl.AbstractKeys {
		public static org.jooq.Identity<schema.mysql.tables.records.TimeZoneRecord, org.jooq.types.UInteger> IDENTITY_TIME_ZONE = createIdentity(schema.mysql.tables.TimeZone.TIME_ZONE, schema.mysql.tables.TimeZone.TIME_ZONE.TIME_ZONE_ID);
	}

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<schema.mysql.tables.records.ColumnsPrivRecord> KEY_COLUMNS_PRIV_PRIMARY = createUniqueKey(schema.mysql.tables.ColumnsPriv.COLUMNS_PRIV, schema.mysql.tables.ColumnsPriv.COLUMNS_PRIV.HOST, schema.mysql.tables.ColumnsPriv.COLUMNS_PRIV.DB, schema.mysql.tables.ColumnsPriv.COLUMNS_PRIV.USER, schema.mysql.tables.ColumnsPriv.COLUMNS_PRIV.TABLE_NAME, schema.mysql.tables.ColumnsPriv.COLUMNS_PRIV.COLUMN_NAME);
		public static final org.jooq.UniqueKey<schema.mysql.tables.records.DbRecord> KEY_DB_PRIMARY = createUniqueKey(schema.mysql.tables.Db.DB, schema.mysql.tables.Db.DB.HOST, schema.mysql.tables.Db.DB.DB_, schema.mysql.tables.Db.DB.USER);
		public static final org.jooq.UniqueKey<schema.mysql.tables.records.EventRecord> KEY_EVENT_PRIMARY = createUniqueKey(schema.mysql.tables.Event.EVENT, schema.mysql.tables.Event.EVENT.DB, schema.mysql.tables.Event.EVENT.NAME);
		public static final org.jooq.UniqueKey<schema.mysql.tables.records.FuncRecord> KEY_FUNC_PRIMARY = createUniqueKey(schema.mysql.tables.Func.FUNC, schema.mysql.tables.Func.FUNC.NAME);
		public static final org.jooq.UniqueKey<schema.mysql.tables.records.HelpCategoryRecord> KEY_HELP_CATEGORY_PRIMARY = createUniqueKey(schema.mysql.tables.HelpCategory.HELP_CATEGORY, schema.mysql.tables.HelpCategory.HELP_CATEGORY.HELP_CATEGORY_ID);
		public static final org.jooq.UniqueKey<schema.mysql.tables.records.HelpCategoryRecord> KEY_HELP_CATEGORY_NAME = createUniqueKey(schema.mysql.tables.HelpCategory.HELP_CATEGORY, schema.mysql.tables.HelpCategory.HELP_CATEGORY.NAME);
		public static final org.jooq.UniqueKey<schema.mysql.tables.records.HelpKeywordRecord> KEY_HELP_KEYWORD_PRIMARY = createUniqueKey(schema.mysql.tables.HelpKeyword.HELP_KEYWORD, schema.mysql.tables.HelpKeyword.HELP_KEYWORD.HELP_KEYWORD_ID);
		public static final org.jooq.UniqueKey<schema.mysql.tables.records.HelpKeywordRecord> KEY_HELP_KEYWORD_NAME = createUniqueKey(schema.mysql.tables.HelpKeyword.HELP_KEYWORD, schema.mysql.tables.HelpKeyword.HELP_KEYWORD.NAME);
		public static final org.jooq.UniqueKey<schema.mysql.tables.records.HelpRelationRecord> KEY_HELP_RELATION_PRIMARY = createUniqueKey(schema.mysql.tables.HelpRelation.HELP_RELATION, schema.mysql.tables.HelpRelation.HELP_RELATION.HELP_KEYWORD_ID, schema.mysql.tables.HelpRelation.HELP_RELATION.HELP_TOPIC_ID);
		public static final org.jooq.UniqueKey<schema.mysql.tables.records.HelpTopicRecord> KEY_HELP_TOPIC_PRIMARY = createUniqueKey(schema.mysql.tables.HelpTopic.HELP_TOPIC, schema.mysql.tables.HelpTopic.HELP_TOPIC.HELP_TOPIC_ID);
		public static final org.jooq.UniqueKey<schema.mysql.tables.records.HelpTopicRecord> KEY_HELP_TOPIC_NAME = createUniqueKey(schema.mysql.tables.HelpTopic.HELP_TOPIC, schema.mysql.tables.HelpTopic.HELP_TOPIC.NAME);
		public static final org.jooq.UniqueKey<schema.mysql.tables.records.HostRecord> KEY_HOST_PRIMARY = createUniqueKey(schema.mysql.tables.Host.HOST, schema.mysql.tables.Host.HOST.HOST_, schema.mysql.tables.Host.HOST.DB);
		public static final org.jooq.UniqueKey<schema.mysql.tables.records.NdbBinlogIndexRecord> KEY_NDB_BINLOG_INDEX_PRIMARY = createUniqueKey(schema.mysql.tables.NdbBinlogIndex.NDB_BINLOG_INDEX, schema.mysql.tables.NdbBinlogIndex.NDB_BINLOG_INDEX.EPOCH);
		public static final org.jooq.UniqueKey<schema.mysql.tables.records.PluginRecord> KEY_PLUGIN_PRIMARY = createUniqueKey(schema.mysql.tables.Plugin.PLUGIN, schema.mysql.tables.Plugin.PLUGIN.NAME);
		public static final org.jooq.UniqueKey<schema.mysql.tables.records.ProcRecord> KEY_PROC_PRIMARY = createUniqueKey(schema.mysql.tables.Proc.PROC, schema.mysql.tables.Proc.PROC.DB, schema.mysql.tables.Proc.PROC.NAME, schema.mysql.tables.Proc.PROC.TYPE);
		public static final org.jooq.UniqueKey<schema.mysql.tables.records.ProcsPrivRecord> KEY_PROCS_PRIV_PRIMARY = createUniqueKey(schema.mysql.tables.ProcsPriv.PROCS_PRIV, schema.mysql.tables.ProcsPriv.PROCS_PRIV.HOST, schema.mysql.tables.ProcsPriv.PROCS_PRIV.DB, schema.mysql.tables.ProcsPriv.PROCS_PRIV.USER, schema.mysql.tables.ProcsPriv.PROCS_PRIV.ROUTINE_NAME, schema.mysql.tables.ProcsPriv.PROCS_PRIV.ROUTINE_TYPE);
		public static final org.jooq.UniqueKey<schema.mysql.tables.records.ProxiesPrivRecord> KEY_PROXIES_PRIV_PRIMARY = createUniqueKey(schema.mysql.tables.ProxiesPriv.PROXIES_PRIV, schema.mysql.tables.ProxiesPriv.PROXIES_PRIV.HOST, schema.mysql.tables.ProxiesPriv.PROXIES_PRIV.USER, schema.mysql.tables.ProxiesPriv.PROXIES_PRIV.PROXIED_HOST, schema.mysql.tables.ProxiesPriv.PROXIES_PRIV.PROXIED_USER);
		public static final org.jooq.UniqueKey<schema.mysql.tables.records.ServersRecord> KEY_SERVERS_PRIMARY = createUniqueKey(schema.mysql.tables.Servers.SERVERS, schema.mysql.tables.Servers.SERVERS.SERVER_NAME);
		public static final org.jooq.UniqueKey<schema.mysql.tables.records.TablesPrivRecord> KEY_TABLES_PRIV_PRIMARY = createUniqueKey(schema.mysql.tables.TablesPriv.TABLES_PRIV, schema.mysql.tables.TablesPriv.TABLES_PRIV.HOST, schema.mysql.tables.TablesPriv.TABLES_PRIV.DB, schema.mysql.tables.TablesPriv.TABLES_PRIV.USER, schema.mysql.tables.TablesPriv.TABLES_PRIV.TABLE_NAME);
		public static final org.jooq.UniqueKey<schema.mysql.tables.records.TimeZoneRecord> KEY_TIME_ZONE_PRIMARY = createUniqueKey(schema.mysql.tables.TimeZone.TIME_ZONE, schema.mysql.tables.TimeZone.TIME_ZONE.TIME_ZONE_ID);
		public static final org.jooq.UniqueKey<schema.mysql.tables.records.TimeZoneLeapSecondRecord> KEY_TIME_ZONE_LEAP_SECOND_PRIMARY = createUniqueKey(schema.mysql.tables.TimeZoneLeapSecond.TIME_ZONE_LEAP_SECOND, schema.mysql.tables.TimeZoneLeapSecond.TIME_ZONE_LEAP_SECOND.TRANSITION_TIME);
		public static final org.jooq.UniqueKey<schema.mysql.tables.records.TimeZoneNameRecord> KEY_TIME_ZONE_NAME_PRIMARY = createUniqueKey(schema.mysql.tables.TimeZoneName.TIME_ZONE_NAME, schema.mysql.tables.TimeZoneName.TIME_ZONE_NAME.NAME);
		public static final org.jooq.UniqueKey<schema.mysql.tables.records.TimeZoneTransitionRecord> KEY_TIME_ZONE_TRANSITION_PRIMARY = createUniqueKey(schema.mysql.tables.TimeZoneTransition.TIME_ZONE_TRANSITION, schema.mysql.tables.TimeZoneTransition.TIME_ZONE_TRANSITION.TIME_ZONE_ID, schema.mysql.tables.TimeZoneTransition.TIME_ZONE_TRANSITION.TRANSITION_TIME);
		public static final org.jooq.UniqueKey<schema.mysql.tables.records.TimeZoneTransitionTypeRecord> KEY_TIME_ZONE_TRANSITION_TYPE_PRIMARY = createUniqueKey(schema.mysql.tables.TimeZoneTransitionType.TIME_ZONE_TRANSITION_TYPE, schema.mysql.tables.TimeZoneTransitionType.TIME_ZONE_TRANSITION_TYPE.TIME_ZONE_ID, schema.mysql.tables.TimeZoneTransitionType.TIME_ZONE_TRANSITION_TYPE.TRANSITION_TYPE_ID);
		public static final org.jooq.UniqueKey<schema.mysql.tables.records.UserRecord> KEY_USER_PRIMARY = createUniqueKey(schema.mysql.tables.User.USER, schema.mysql.tables.User.USER.HOST, schema.mysql.tables.User.USER.USER_);
	}
}
