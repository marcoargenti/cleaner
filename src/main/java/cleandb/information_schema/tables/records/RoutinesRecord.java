/**
 * This class is generated by jOOQ
 */
package cleandb.information_schema.tables.records;

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
public class RoutinesRecord extends org.jooq.impl.TableRecordImpl<cleandb.information_schema.tables.records.RoutinesRecord> {

	private static final long serialVersionUID = 278229469;

	/**
	 * Setter for <code>information_schema.ROUTINES.SPECIFIC_NAME</code>.
	 */
	public void setSpecificName(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.ROUTINES.SPECIFIC_NAME</code>.
	 */
	public java.lang.String getSpecificName() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.ROUTINES.ROUTINE_CATALOG</code>.
	 */
	public void setRoutineCatalog(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.ROUTINES.ROUTINE_CATALOG</code>.
	 */
	public java.lang.String getRoutineCatalog() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.ROUTINES.ROUTINE_SCHEMA</code>.
	 */
	public void setRoutineSchema(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.ROUTINES.ROUTINE_SCHEMA</code>.
	 */
	public java.lang.String getRoutineSchema() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.ROUTINES.ROUTINE_NAME</code>.
	 */
	public void setRoutineName(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.ROUTINES.ROUTINE_NAME</code>.
	 */
	public java.lang.String getRoutineName() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>information_schema.ROUTINES.ROUTINE_TYPE</code>.
	 */
	public void setRoutineType(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>information_schema.ROUTINES.ROUTINE_TYPE</code>.
	 */
	public java.lang.String getRoutineType() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>information_schema.ROUTINES.DATA_TYPE</code>.
	 */
	public void setDataType(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>information_schema.ROUTINES.DATA_TYPE</code>.
	 */
	public java.lang.String getDataType() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>information_schema.ROUTINES.CHARACTER_MAXIMUM_LENGTH</code>.
	 */
	public void setCharacterMaximumLength(java.lang.Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>information_schema.ROUTINES.CHARACTER_MAXIMUM_LENGTH</code>.
	 */
	public java.lang.Integer getCharacterMaximumLength() {
		return (java.lang.Integer) getValue(6);
	}

	/**
	 * Setter for <code>information_schema.ROUTINES.CHARACTER_OCTET_LENGTH</code>.
	 */
	public void setCharacterOctetLength(java.lang.Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>information_schema.ROUTINES.CHARACTER_OCTET_LENGTH</code>.
	 */
	public java.lang.Integer getCharacterOctetLength() {
		return (java.lang.Integer) getValue(7);
	}

	/**
	 * Setter for <code>information_schema.ROUTINES.NUMERIC_PRECISION</code>.
	 */
	public void setNumericPrecision(java.lang.Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>information_schema.ROUTINES.NUMERIC_PRECISION</code>.
	 */
	public java.lang.Integer getNumericPrecision() {
		return (java.lang.Integer) getValue(8);
	}

	/**
	 * Setter for <code>information_schema.ROUTINES.NUMERIC_SCALE</code>.
	 */
	public void setNumericScale(java.lang.Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>information_schema.ROUTINES.NUMERIC_SCALE</code>.
	 */
	public java.lang.Integer getNumericScale() {
		return (java.lang.Integer) getValue(9);
	}

	/**
	 * Setter for <code>information_schema.ROUTINES.CHARACTER_SET_NAME</code>.
	 */
	public void setCharacterSetName(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>information_schema.ROUTINES.CHARACTER_SET_NAME</code>.
	 */
	public java.lang.String getCharacterSetName() {
		return (java.lang.String) getValue(10);
	}

	/**
	 * Setter for <code>information_schema.ROUTINES.COLLATION_NAME</code>.
	 */
	public void setCollationName(java.lang.String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>information_schema.ROUTINES.COLLATION_NAME</code>.
	 */
	public java.lang.String getCollationName() {
		return (java.lang.String) getValue(11);
	}

	/**
	 * Setter for <code>information_schema.ROUTINES.DTD_IDENTIFIER</code>.
	 */
	public void setDtdIdentifier(java.lang.String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>information_schema.ROUTINES.DTD_IDENTIFIER</code>.
	 */
	public java.lang.String getDtdIdentifier() {
		return (java.lang.String) getValue(12);
	}

	/**
	 * Setter for <code>information_schema.ROUTINES.ROUTINE_BODY</code>.
	 */
	public void setRoutineBody(java.lang.String value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>information_schema.ROUTINES.ROUTINE_BODY</code>.
	 */
	public java.lang.String getRoutineBody() {
		return (java.lang.String) getValue(13);
	}

	/**
	 * Setter for <code>information_schema.ROUTINES.ROUTINE_DEFINITION</code>.
	 */
	public void setRoutineDefinition(java.lang.String value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>information_schema.ROUTINES.ROUTINE_DEFINITION</code>.
	 */
	public java.lang.String getRoutineDefinition() {
		return (java.lang.String) getValue(14);
	}

	/**
	 * Setter for <code>information_schema.ROUTINES.EXTERNAL_NAME</code>.
	 */
	public void setExternalName(java.lang.String value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>information_schema.ROUTINES.EXTERNAL_NAME</code>.
	 */
	public java.lang.String getExternalName() {
		return (java.lang.String) getValue(15);
	}

	/**
	 * Setter for <code>information_schema.ROUTINES.EXTERNAL_LANGUAGE</code>.
	 */
	public void setExternalLanguage(java.lang.String value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>information_schema.ROUTINES.EXTERNAL_LANGUAGE</code>.
	 */
	public java.lang.String getExternalLanguage() {
		return (java.lang.String) getValue(16);
	}

	/**
	 * Setter for <code>information_schema.ROUTINES.PARAMETER_STYLE</code>.
	 */
	public void setParameterStyle(java.lang.String value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>information_schema.ROUTINES.PARAMETER_STYLE</code>.
	 */
	public java.lang.String getParameterStyle() {
		return (java.lang.String) getValue(17);
	}

	/**
	 * Setter for <code>information_schema.ROUTINES.IS_DETERMINISTIC</code>.
	 */
	public void setIsDeterministic(java.lang.String value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>information_schema.ROUTINES.IS_DETERMINISTIC</code>.
	 */
	public java.lang.String getIsDeterministic() {
		return (java.lang.String) getValue(18);
	}

	/**
	 * Setter for <code>information_schema.ROUTINES.SQL_DATA_ACCESS</code>.
	 */
	public void setSqlDataAccess(java.lang.String value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>information_schema.ROUTINES.SQL_DATA_ACCESS</code>.
	 */
	public java.lang.String getSqlDataAccess() {
		return (java.lang.String) getValue(19);
	}

	/**
	 * Setter for <code>information_schema.ROUTINES.SQL_PATH</code>.
	 */
	public void setSqlPath(java.lang.String value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>information_schema.ROUTINES.SQL_PATH</code>.
	 */
	public java.lang.String getSqlPath() {
		return (java.lang.String) getValue(20);
	}

	/**
	 * Setter for <code>information_schema.ROUTINES.SECURITY_TYPE</code>.
	 */
	public void setSecurityType(java.lang.String value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>information_schema.ROUTINES.SECURITY_TYPE</code>.
	 */
	public java.lang.String getSecurityType() {
		return (java.lang.String) getValue(21);
	}

	/**
	 * Setter for <code>information_schema.ROUTINES.CREATED</code>.
	 */
	public void setCreated(java.sql.Timestamp value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>information_schema.ROUTINES.CREATED</code>.
	 */
	public java.sql.Timestamp getCreated() {
		return (java.sql.Timestamp) getValue(22);
	}

	/**
	 * Setter for <code>information_schema.ROUTINES.LAST_ALTERED</code>.
	 */
	public void setLastAltered(java.sql.Timestamp value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>information_schema.ROUTINES.LAST_ALTERED</code>.
	 */
	public java.sql.Timestamp getLastAltered() {
		return (java.sql.Timestamp) getValue(23);
	}

	/**
	 * Setter for <code>information_schema.ROUTINES.SQL_MODE</code>.
	 */
	public void setSqlMode(java.lang.String value) {
		setValue(24, value);
	}

	/**
	 * Getter for <code>information_schema.ROUTINES.SQL_MODE</code>.
	 */
	public java.lang.String getSqlMode() {
		return (java.lang.String) getValue(24);
	}

	/**
	 * Setter for <code>information_schema.ROUTINES.ROUTINE_COMMENT</code>.
	 */
	public void setRoutineComment(java.lang.String value) {
		setValue(25, value);
	}

	/**
	 * Getter for <code>information_schema.ROUTINES.ROUTINE_COMMENT</code>.
	 */
	public java.lang.String getRoutineComment() {
		return (java.lang.String) getValue(25);
	}

	/**
	 * Setter for <code>information_schema.ROUTINES.DEFINER</code>.
	 */
	public void setDefiner(java.lang.String value) {
		setValue(26, value);
	}

	/**
	 * Getter for <code>information_schema.ROUTINES.DEFINER</code>.
	 */
	public java.lang.String getDefiner() {
		return (java.lang.String) getValue(26);
	}

	/**
	 * Setter for <code>information_schema.ROUTINES.CHARACTER_SET_CLIENT</code>.
	 */
	public void setCharacterSetClient(java.lang.String value) {
		setValue(27, value);
	}

	/**
	 * Getter for <code>information_schema.ROUTINES.CHARACTER_SET_CLIENT</code>.
	 */
	public java.lang.String getCharacterSetClient() {
		return (java.lang.String) getValue(27);
	}

	/**
	 * Setter for <code>information_schema.ROUTINES.COLLATION_CONNECTION</code>.
	 */
	public void setCollationConnection(java.lang.String value) {
		setValue(28, value);
	}

	/**
	 * Getter for <code>information_schema.ROUTINES.COLLATION_CONNECTION</code>.
	 */
	public java.lang.String getCollationConnection() {
		return (java.lang.String) getValue(28);
	}

	/**
	 * Setter for <code>information_schema.ROUTINES.DATABASE_COLLATION</code>.
	 */
	public void setDatabaseCollation(java.lang.String value) {
		setValue(29, value);
	}

	/**
	 * Getter for <code>information_schema.ROUTINES.DATABASE_COLLATION</code>.
	 */
	public java.lang.String getDatabaseCollation() {
		return (java.lang.String) getValue(29);
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached RoutinesRecord
	 */
	public RoutinesRecord() {
		super(cleandb.information_schema.tables.Routines.ROUTINES);
	}

	/**
	 * Create a detached, initialised RoutinesRecord
	 */
	public RoutinesRecord(java.lang.String specificName, java.lang.String routineCatalog, java.lang.String routineSchema, java.lang.String routineName, java.lang.String routineType, java.lang.String dataType, java.lang.Integer characterMaximumLength, java.lang.Integer characterOctetLength, java.lang.Integer numericPrecision, java.lang.Integer numericScale, java.lang.String characterSetName, java.lang.String collationName, java.lang.String dtdIdentifier, java.lang.String routineBody, java.lang.String routineDefinition, java.lang.String externalName, java.lang.String externalLanguage, java.lang.String parameterStyle, java.lang.String isDeterministic, java.lang.String sqlDataAccess, java.lang.String sqlPath, java.lang.String securityType, java.sql.Timestamp created, java.sql.Timestamp lastAltered, java.lang.String sqlMode, java.lang.String routineComment, java.lang.String definer, java.lang.String characterSetClient, java.lang.String collationConnection, java.lang.String databaseCollation) {
		super(cleandb.information_schema.tables.Routines.ROUTINES);

		setValue(0, specificName);
		setValue(1, routineCatalog);
		setValue(2, routineSchema);
		setValue(3, routineName);
		setValue(4, routineType);
		setValue(5, dataType);
		setValue(6, characterMaximumLength);
		setValue(7, characterOctetLength);
		setValue(8, numericPrecision);
		setValue(9, numericScale);
		setValue(10, characterSetName);
		setValue(11, collationName);
		setValue(12, dtdIdentifier);
		setValue(13, routineBody);
		setValue(14, routineDefinition);
		setValue(15, externalName);
		setValue(16, externalLanguage);
		setValue(17, parameterStyle);
		setValue(18, isDeterministic);
		setValue(19, sqlDataAccess);
		setValue(20, sqlPath);
		setValue(21, securityType);
		setValue(22, created);
		setValue(23, lastAltered);
		setValue(24, sqlMode);
		setValue(25, routineComment);
		setValue(26, definer);
		setValue(27, characterSetClient);
		setValue(28, collationConnection);
		setValue(29, databaseCollation);
	}
}
