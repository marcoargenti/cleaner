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
public class RwlockInstances extends org.jooq.impl.TableImpl<schema.performance_schema.tables.records.RwlockInstancesRecord> {

	private static final long serialVersionUID = -290336415;

	/**
	 * The reference instance of <code>performance_schema.rwlock_instances</code>
	 */
	public static final schema.performance_schema.tables.RwlockInstances RWLOCK_INSTANCES = new schema.performance_schema.tables.RwlockInstances();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<schema.performance_schema.tables.records.RwlockInstancesRecord> getRecordType() {
		return schema.performance_schema.tables.records.RwlockInstancesRecord.class;
	}

	/**
	 * The column <code>performance_schema.rwlock_instances.NAME</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.RwlockInstancesRecord, java.lang.String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>performance_schema.rwlock_instances.OBJECT_INSTANCE_BEGIN</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.RwlockInstancesRecord, java.lang.Long> OBJECT_INSTANCE_BEGIN = createField("OBJECT_INSTANCE_BEGIN", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.rwlock_instances.WRITE_LOCKED_BY_THREAD_ID</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.RwlockInstancesRecord, java.lang.Integer> WRITE_LOCKED_BY_THREAD_ID = createField("WRITE_LOCKED_BY_THREAD_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>performance_schema.rwlock_instances.READ_LOCKED_BY_COUNT</code>.
	 */
	public final org.jooq.TableField<schema.performance_schema.tables.records.RwlockInstancesRecord, org.jooq.types.UInteger> READ_LOCKED_BY_COUNT = createField("READ_LOCKED_BY_COUNT", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

	/**
	 * Create a <code>performance_schema.rwlock_instances</code> table reference
	 */
	public RwlockInstances() {
		this("rwlock_instances", null);
	}

	/**
	 * Create an aliased <code>performance_schema.rwlock_instances</code> table reference
	 */
	public RwlockInstances(java.lang.String alias) {
		this(alias, schema.performance_schema.tables.RwlockInstances.RWLOCK_INSTANCES);
	}

	private RwlockInstances(java.lang.String alias, org.jooq.Table<schema.performance_schema.tables.records.RwlockInstancesRecord> aliased) {
		this(alias, aliased, null);
	}

	private RwlockInstances(java.lang.String alias, org.jooq.Table<schema.performance_schema.tables.records.RwlockInstancesRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, schema.performance_schema.PerformanceSchema.PERFORMANCE_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public schema.performance_schema.tables.RwlockInstances as(java.lang.String alias) {
		return new schema.performance_schema.tables.RwlockInstances(alias, this);
	}

	/**
	 * Rename this table
	 */
	public schema.performance_schema.tables.RwlockInstances rename(java.lang.String name) {
		return new schema.performance_schema.tables.RwlockInstances(name, null);
	}
}
