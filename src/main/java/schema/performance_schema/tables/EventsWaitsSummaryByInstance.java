/**
 * This class is generated by jOOQ
 */
package schema.performance_schema.tables;

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
public class EventsWaitsSummaryByInstance extends org.jooq.impl.TableImpl<schema.performance_schema.tables.records.EventsWaitsSummaryByInstanceRecord> {

	private static final long serialVersionUID = 535654612;

	/**
	 * The reference instance of <code>performance_schema.events_waits_summary_by_instance</code>
	 */
	public static final schema.performance_schema.tables.EventsWaitsSummaryByInstance EVENTS_WAITS_SUMMARY_BY_INSTANCE = new schema.performance_schema.tables.EventsWaitsSummaryByInstance();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<schema.performance_schema.tables.records.EventsWaitsSummaryByInstanceRecord> getRecordType() {
		return schema.performance_schema.tables.records.EventsWaitsSummaryByInstanceRecord.class;
	}

	/**
	 * The column <code>performance_schema.events_waits_summary_by_instance.EVENT_NAME</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.EventsWaitsSummaryByInstanceRecord, java.lang.String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_summary_by_instance.OBJECT_INSTANCE_BEGIN</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.EventsWaitsSummaryByInstanceRecord, java.lang.Long> OBJECT_INSTANCE_BEGIN = createField("OBJECT_INSTANCE_BEGIN", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_summary_by_instance.COUNT_STAR</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.EventsWaitsSummaryByInstanceRecord, org.jooq.types.ULong> COUNT_STAR = createField("COUNT_STAR", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_summary_by_instance.SUM_TIMER_WAIT</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.EventsWaitsSummaryByInstanceRecord, org.jooq.types.ULong> SUM_TIMER_WAIT = createField("SUM_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_summary_by_instance.MIN_TIMER_WAIT</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.EventsWaitsSummaryByInstanceRecord, org.jooq.types.ULong> MIN_TIMER_WAIT = createField("MIN_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_summary_by_instance.AVG_TIMER_WAIT</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.EventsWaitsSummaryByInstanceRecord, org.jooq.types.ULong> AVG_TIMER_WAIT = createField("AVG_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_summary_by_instance.MAX_TIMER_WAIT</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.EventsWaitsSummaryByInstanceRecord, org.jooq.types.ULong> MAX_TIMER_WAIT = createField("MAX_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * Create a <code>performance_schema.events_waits_summary_by_instance</code> table reference
	 */
	public EventsWaitsSummaryByInstance() {
		this("events_waits_summary_by_instance", null);
	}

	/**
	 * Create an aliased <code>performance_schema.events_waits_summary_by_instance</code> table reference
	 */
	public EventsWaitsSummaryByInstance(java.lang.String alias) {
		this(alias, schema.performance_schema.tables.EventsWaitsSummaryByInstance.EVENTS_WAITS_SUMMARY_BY_INSTANCE);
	}

	private EventsWaitsSummaryByInstance(java.lang.String alias, org.jooq.Table<schema.performance_schema.tables.records.EventsWaitsSummaryByInstanceRecord> aliased) {
		this(alias, aliased, null);
	}

	private EventsWaitsSummaryByInstance(java.lang.String alias, org.jooq.Table<schema.performance_schema.tables.records.EventsWaitsSummaryByInstanceRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, schema.performance_schema.PerformanceSchema.PERFORMANCE_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public schema.performance_schema.tables.EventsWaitsSummaryByInstance as(java.lang.String alias) {
		return new schema.performance_schema.tables.EventsWaitsSummaryByInstance(alias, this);
	}

	/**
	 * Rename this table
	 */
	public schema.performance_schema.tables.EventsWaitsSummaryByInstance rename(java.lang.String name) {
		return new schema.performance_schema.tables.EventsWaitsSummaryByInstance(name, null);
	}
}
