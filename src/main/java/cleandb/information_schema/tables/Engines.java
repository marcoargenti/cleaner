/**
 * This class is generated by jOOQ
 */
package cleandb.information_schema.tables;

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
public class Engines extends org.jooq.impl.TableImpl<cleandb.information_schema.tables.records.EnginesRecord> {

	private static final long serialVersionUID = -1135588763;

	/**
	 * The reference instance of <code>information_schema.ENGINES</code>
	 */
	public static final cleandb.information_schema.tables.Engines ENGINES = new cleandb.information_schema.tables.Engines();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<cleandb.information_schema.tables.records.EnginesRecord> getRecordType() {
		return cleandb.information_schema.tables.records.EnginesRecord.class;
	}

	/**
	 * The column <code>information_schema.ENGINES.ENGINE</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.EnginesRecord, java.lang.String> ENGINE = createField("ENGINE", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.ENGINES.SUPPORT</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.EnginesRecord, java.lang.String> SUPPORT = createField("SUPPORT", org.jooq.impl.SQLDataType.VARCHAR.length(8).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.ENGINES.COMMENT</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.EnginesRecord, java.lang.String> COMMENT = createField("COMMENT", org.jooq.impl.SQLDataType.VARCHAR.length(80).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.ENGINES.TRANSACTIONS</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.EnginesRecord, java.lang.String> TRANSACTIONS = createField("TRANSACTIONS", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

	/**
	 * The column <code>information_schema.ENGINES.XA</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.EnginesRecord, java.lang.String> XA = createField("XA", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

	/**
	 * The column <code>information_schema.ENGINES.SAVEPOINTS</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.EnginesRecord, java.lang.String> SAVEPOINTS = createField("SAVEPOINTS", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

	/**
	 * Create a <code>information_schema.ENGINES</code> table reference
	 */
	public Engines() {
		this("ENGINES", null);
	}

	/**
	 * Create an aliased <code>information_schema.ENGINES</code> table reference
	 */
	public Engines(java.lang.String alias) {
		this(alias, cleandb.information_schema.tables.Engines.ENGINES);
	}

	private Engines(java.lang.String alias, org.jooq.Table<cleandb.information_schema.tables.records.EnginesRecord> aliased) {
		this(alias, aliased, null);
	}

	private Engines(java.lang.String alias, org.jooq.Table<cleandb.information_schema.tables.records.EnginesRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, cleandb.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public cleandb.information_schema.tables.Engines as(java.lang.String alias) {
		return new cleandb.information_schema.tables.Engines(alias, this);
	}

	/**
	 * Rename this table
	 */
	public cleandb.information_schema.tables.Engines rename(java.lang.String name) {
		return new cleandb.information_schema.tables.Engines(name, null);
	}
}
