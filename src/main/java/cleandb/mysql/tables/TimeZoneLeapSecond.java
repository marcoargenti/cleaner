/**
 * This class is generated by jOOQ
 */
package cleandb.mysql.tables;

/**
 * Leap seconds information for time zones
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.4"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TimeZoneLeapSecond extends org.jooq.impl.TableImpl<cleandb.mysql.tables.records.TimeZoneLeapSecondRecord> {

	private static final long serialVersionUID = -1100309343;

	/**
	 * The reference instance of <code>mysql.time_zone_leap_second</code>
	 */
	public static final cleandb.mysql.tables.TimeZoneLeapSecond TIME_ZONE_LEAP_SECOND = new cleandb.mysql.tables.TimeZoneLeapSecond();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<cleandb.mysql.tables.records.TimeZoneLeapSecondRecord> getRecordType() {
		return cleandb.mysql.tables.records.TimeZoneLeapSecondRecord.class;
	}

	/**
	 * The column <code>mysql.time_zone_leap_second.Transition_time</code>.
	 */
	public final org.jooq.TableField<cleandb.mysql.tables.records.TimeZoneLeapSecondRecord, java.lang.Long> TRANSITION_TIME = createField("Transition_time", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>mysql.time_zone_leap_second.Correction</code>.
	 */
	public final org.jooq.TableField<cleandb.mysql.tables.records.TimeZoneLeapSecondRecord, java.lang.Integer> CORRECTION = createField("Correction", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>mysql.time_zone_leap_second</code> table reference
	 */
	public TimeZoneLeapSecond() {
		this("time_zone_leap_second", null);
	}

	/**
	 * Create an aliased <code>mysql.time_zone_leap_second</code> table reference
	 */
	public TimeZoneLeapSecond(java.lang.String alias) {
		this(alias, cleandb.mysql.tables.TimeZoneLeapSecond.TIME_ZONE_LEAP_SECOND);
	}

	private TimeZoneLeapSecond(java.lang.String alias, org.jooq.Table<cleandb.mysql.tables.records.TimeZoneLeapSecondRecord> aliased) {
		this(alias, aliased, null);
	}

	private TimeZoneLeapSecond(java.lang.String alias, org.jooq.Table<cleandb.mysql.tables.records.TimeZoneLeapSecondRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, cleandb.mysql.Mysql.MYSQL, aliased, parameters, "Leap seconds information for time zones");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<cleandb.mysql.tables.records.TimeZoneLeapSecondRecord> getPrimaryKey() {
		return cleandb.mysql.Keys.KEY_TIME_ZONE_LEAP_SECOND_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<cleandb.mysql.tables.records.TimeZoneLeapSecondRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<cleandb.mysql.tables.records.TimeZoneLeapSecondRecord>>asList(cleandb.mysql.Keys.KEY_TIME_ZONE_LEAP_SECOND_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public cleandb.mysql.tables.TimeZoneLeapSecond as(java.lang.String alias) {
		return new cleandb.mysql.tables.TimeZoneLeapSecond(alias, this);
	}

	/**
	 * Rename this table
	 */
	public cleandb.mysql.tables.TimeZoneLeapSecond rename(java.lang.String name) {
		return new cleandb.mysql.tables.TimeZoneLeapSecond(name, null);
	}
}
