/**
 * This class is generated by jOOQ
 */
package schema.performance_schema.enums;

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
public enum SetupTimersTimerName implements org.jooq.EnumType {

	CYCLE("CYCLE"),

	NANOSECOND("NANOSECOND"),

	MICROSECOND("MICROSECOND"),

	MILLISECOND("MILLISECOND"),

	TICK("TICK");

	private final java.lang.String literal;

	private SetupTimersTimerName(java.lang.String literal) {
		this.literal = literal;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Schema getSchema() {
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String getName() {
		return "setup_timers_TIMER_NAME";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String getLiteral() {
		return literal;
	}
}
