/**
 * This class is generated by jOOQ
 */
package schema.information_schema.tables;

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
public class Parameters extends org.jooq.impl.TableImpl<schema.information_schema.tables.records.ParametersRecord> {

	private static final long serialVersionUID = 95398802;

	/**
	 * The reference instance of <code>information_schema.PARAMETERS</code>
	 */
	public static final schema.information_schema.tables.Parameters PARAMETERS = new schema.information_schema.tables.Parameters();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<schema.information_schema.tables.records.ParametersRecord> getRecordType() {
		return schema.information_schema.tables.records.ParametersRecord.class;
	}

	/**
	 * The column <code>information_schema.PARAMETERS.SPECIFIC_CATALOG</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.ParametersRecord, java.lang.String> SPECIFIC_CATALOG = createField("SPECIFIC_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.PARAMETERS.SPECIFIC_SCHEMA</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.ParametersRecord, java.lang.String> SPECIFIC_SCHEMA = createField("SPECIFIC_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.PARAMETERS.SPECIFIC_NAME</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.ParametersRecord, java.lang.String> SPECIFIC_NAME = createField("SPECIFIC_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.PARAMETERS.ORDINAL_POSITION</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.ParametersRecord, java.lang.Integer> ORDINAL_POSITION = createField("ORDINAL_POSITION", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.PARAMETERS.PARAMETER_MODE</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.ParametersRecord, java.lang.String> PARAMETER_MODE = createField("PARAMETER_MODE", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "");

	/**
	 * The column <code>information_schema.PARAMETERS.PARAMETER_NAME</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.ParametersRecord, java.lang.String> PARAMETER_NAME = createField("PARAMETER_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>information_schema.PARAMETERS.DATA_TYPE</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.ParametersRecord, java.lang.String> DATA_TYPE = createField("DATA_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.PARAMETERS.CHARACTER_MAXIMUM_LENGTH</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.ParametersRecord, java.lang.Integer> CHARACTER_MAXIMUM_LENGTH = createField("CHARACTER_MAXIMUM_LENGTH", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.PARAMETERS.CHARACTER_OCTET_LENGTH</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.ParametersRecord, java.lang.Integer> CHARACTER_OCTET_LENGTH = createField("CHARACTER_OCTET_LENGTH", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.PARAMETERS.NUMERIC_PRECISION</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.ParametersRecord, java.lang.Integer> NUMERIC_PRECISION = createField("NUMERIC_PRECISION", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.PARAMETERS.NUMERIC_SCALE</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.ParametersRecord, java.lang.Integer> NUMERIC_SCALE = createField("NUMERIC_SCALE", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.PARAMETERS.CHARACTER_SET_NAME</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.ParametersRecord, java.lang.String> CHARACTER_SET_NAME = createField("CHARACTER_SET_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>information_schema.PARAMETERS.COLLATION_NAME</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.ParametersRecord, java.lang.String> COLLATION_NAME = createField("COLLATION_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>information_schema.PARAMETERS.DTD_IDENTIFIER</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.ParametersRecord, java.lang.String> DTD_IDENTIFIER = createField("DTD_IDENTIFIER", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>information_schema.PARAMETERS.ROUTINE_TYPE</code>.
	 */
	public final org.jooq.TableField<schema.information_schema.tables.records.ParametersRecord, java.lang.String> ROUTINE_TYPE = createField("ROUTINE_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(9).nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>information_schema.PARAMETERS</code> table reference
	 */
	public Parameters() {
		this("PARAMETERS", null);
	}

	/**
	 * Create an aliased <code>information_schema.PARAMETERS</code> table reference
	 */
	public Parameters(java.lang.String alias) {
		this(alias, schema.information_schema.tables.Parameters.PARAMETERS);
	}

	private Parameters(java.lang.String alias, org.jooq.Table<schema.information_schema.tables.records.ParametersRecord> aliased) {
		this(alias, aliased, null);
	}

	private Parameters(java.lang.String alias, org.jooq.Table<schema.information_schema.tables.records.ParametersRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, schema.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public schema.information_schema.tables.Parameters as(java.lang.String alias) {
		return new schema.information_schema.tables.Parameters(alias, this);
	}

	/**
	 * Rename this table
	 */
	public schema.information_schema.tables.Parameters rename(java.lang.String name) {
		return new schema.information_schema.tables.Parameters(name, null);
	}
}
