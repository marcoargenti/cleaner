/**
 * This class is generated by jOOQ
 */
package cleandb.performance_schema;

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
public class PerformanceSchema extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 918809221;

	/**
	 * The reference instance of <code>performance_schema</code>
	 */
	public static final PerformanceSchema PERFORMANCE_SCHEMA = new PerformanceSchema();

	/**
	 * No further instances allowed
	 */
	private PerformanceSchema() {
		super("performance_schema");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			cleandb.performance_schema.tables.CondInstances.COND_INSTANCES,
			cleandb.performance_schema.tables.EventsWaitsCurrent.EVENTS_WAITS_CURRENT,
			cleandb.performance_schema.tables.EventsWaitsHistory.EVENTS_WAITS_HISTORY,
			cleandb.performance_schema.tables.EventsWaitsHistoryLong.EVENTS_WAITS_HISTORY_LONG,
			cleandb.performance_schema.tables.EventsWaitsSummaryByInstance.EVENTS_WAITS_SUMMARY_BY_INSTANCE,
			cleandb.performance_schema.tables.EventsWaitsSummaryByThreadByEventName.EVENTS_WAITS_SUMMARY_BY_THREAD_BY_EVENT_NAME,
			cleandb.performance_schema.tables.EventsWaitsSummaryGlobalByEventName.EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME,
			cleandb.performance_schema.tables.FileInstances.FILE_INSTANCES,
			cleandb.performance_schema.tables.FileSummaryByEventName.FILE_SUMMARY_BY_EVENT_NAME,
			cleandb.performance_schema.tables.FileSummaryByInstance.FILE_SUMMARY_BY_INSTANCE,
			cleandb.performance_schema.tables.MutexInstances.MUTEX_INSTANCES,
			cleandb.performance_schema.tables.PerformanceTimers.PERFORMANCE_TIMERS,
			cleandb.performance_schema.tables.RwlockInstances.RWLOCK_INSTANCES,
			cleandb.performance_schema.tables.SetupConsumers.SETUP_CONSUMERS,
			cleandb.performance_schema.tables.SetupInstruments.SETUP_INSTRUMENTS,
			cleandb.performance_schema.tables.SetupTimers.SETUP_TIMERS,
			cleandb.performance_schema.tables.Threads.THREADS);
	}
}
