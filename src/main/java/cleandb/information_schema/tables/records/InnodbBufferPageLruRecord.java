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
public class InnodbBufferPageLruRecord extends org.jooq.impl.TableRecordImpl<cleandb.information_schema.tables.records.InnodbBufferPageLruRecord> implements org.jooq.Record20<org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong, java.lang.String, org.jooq.types.ULong, org.jooq.types.ULong, java.lang.String, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong, java.lang.String, java.lang.String, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong, java.lang.String, java.lang.String, java.lang.String, org.jooq.types.ULong> {

	private static final long serialVersionUID = 978266893;

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.POOL_ID</code>.
	 */
	public void setPoolId(org.jooq.types.ULong value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.POOL_ID</code>.
	 */
	public org.jooq.types.ULong getPoolId() {
		return (org.jooq.types.ULong) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.LRU_POSITION</code>.
	 */
	public void setLruPosition(org.jooq.types.ULong value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.LRU_POSITION</code>.
	 */
	public org.jooq.types.ULong getLruPosition() {
		return (org.jooq.types.ULong) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.SPACE</code>.
	 */
	public void setSpace(org.jooq.types.ULong value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.SPACE</code>.
	 */
	public org.jooq.types.ULong getSpace() {
		return (org.jooq.types.ULong) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.PAGE_NUMBER</code>.
	 */
	public void setPageNumber(org.jooq.types.ULong value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.PAGE_NUMBER</code>.
	 */
	public org.jooq.types.ULong getPageNumber() {
		return (org.jooq.types.ULong) getValue(3);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.PAGE_TYPE</code>.
	 */
	public void setPageType(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.PAGE_TYPE</code>.
	 */
	public java.lang.String getPageType() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.FLUSH_TYPE</code>.
	 */
	public void setFlushType(org.jooq.types.ULong value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.FLUSH_TYPE</code>.
	 */
	public org.jooq.types.ULong getFlushType() {
		return (org.jooq.types.ULong) getValue(5);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.FIX_COUNT</code>.
	 */
	public void setFixCount(org.jooq.types.ULong value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.FIX_COUNT</code>.
	 */
	public org.jooq.types.ULong getFixCount() {
		return (org.jooq.types.ULong) getValue(6);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.IS_HASHED</code>.
	 */
	public void setIsHashed(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.IS_HASHED</code>.
	 */
	public java.lang.String getIsHashed() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.NEWEST_MODIFICATION</code>.
	 */
	public void setNewestModification(org.jooq.types.ULong value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.NEWEST_MODIFICATION</code>.
	 */
	public org.jooq.types.ULong getNewestModification() {
		return (org.jooq.types.ULong) getValue(8);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.OLDEST_MODIFICATION</code>.
	 */
	public void setOldestModification(org.jooq.types.ULong value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.OLDEST_MODIFICATION</code>.
	 */
	public org.jooq.types.ULong getOldestModification() {
		return (org.jooq.types.ULong) getValue(9);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.ACCESS_TIME</code>.
	 */
	public void setAccessTime(org.jooq.types.ULong value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.ACCESS_TIME</code>.
	 */
	public org.jooq.types.ULong getAccessTime() {
		return (org.jooq.types.ULong) getValue(10);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.TABLE_NAME</code>.
	 */
	public void setTableName(java.lang.String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.TABLE_NAME</code>.
	 */
	public java.lang.String getTableName() {
		return (java.lang.String) getValue(11);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.INDEX_NAME</code>.
	 */
	public void setIndexName(java.lang.String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.INDEX_NAME</code>.
	 */
	public java.lang.String getIndexName() {
		return (java.lang.String) getValue(12);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.NUMBER_RECORDS</code>.
	 */
	public void setNumberRecords(org.jooq.types.ULong value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.NUMBER_RECORDS</code>.
	 */
	public org.jooq.types.ULong getNumberRecords() {
		return (org.jooq.types.ULong) getValue(13);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.DATA_SIZE</code>.
	 */
	public void setDataSize(org.jooq.types.ULong value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.DATA_SIZE</code>.
	 */
	public org.jooq.types.ULong getDataSize() {
		return (org.jooq.types.ULong) getValue(14);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.COMPRESSED_SIZE</code>.
	 */
	public void setCompressedSize(org.jooq.types.ULong value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.COMPRESSED_SIZE</code>.
	 */
	public org.jooq.types.ULong getCompressedSize() {
		return (org.jooq.types.ULong) getValue(15);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.COMPRESSED</code>.
	 */
	public void setCompressed(java.lang.String value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.COMPRESSED</code>.
	 */
	public java.lang.String getCompressed() {
		return (java.lang.String) getValue(16);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.IO_FIX</code>.
	 */
	public void setIoFix(java.lang.String value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.IO_FIX</code>.
	 */
	public java.lang.String getIoFix() {
		return (java.lang.String) getValue(17);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.IS_OLD</code>.
	 */
	public void setIsOld(java.lang.String value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.IS_OLD</code>.
	 */
	public java.lang.String getIsOld() {
		return (java.lang.String) getValue(18);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.FREE_PAGE_CLOCK</code>.
	 */
	public void setFreePageClock(org.jooq.types.ULong value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.FREE_PAGE_CLOCK</code>.
	 */
	public org.jooq.types.ULong getFreePageClock() {
		return (org.jooq.types.ULong) getValue(19);
	}

	// -------------------------------------------------------------------------
	// Record20 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row20<org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong, java.lang.String, org.jooq.types.ULong, org.jooq.types.ULong, java.lang.String, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong, java.lang.String, java.lang.String, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong, java.lang.String, java.lang.String, java.lang.String, org.jooq.types.ULong> fieldsRow() {
		return (org.jooq.Row20) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row20<org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong, java.lang.String, org.jooq.types.ULong, org.jooq.types.ULong, java.lang.String, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong, java.lang.String, java.lang.String, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong, java.lang.String, java.lang.String, java.lang.String, org.jooq.types.ULong> valuesRow() {
		return (org.jooq.Row20) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field1() {
		return cleandb.information_schema.tables.InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.POOL_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field2() {
		return cleandb.information_schema.tables.InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.LRU_POSITION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field3() {
		return cleandb.information_schema.tables.InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.SPACE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field4() {
		return cleandb.information_schema.tables.InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.PAGE_NUMBER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return cleandb.information_schema.tables.InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.PAGE_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field6() {
		return cleandb.information_schema.tables.InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.FLUSH_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field7() {
		return cleandb.information_schema.tables.InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.FIX_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return cleandb.information_schema.tables.InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.IS_HASHED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field9() {
		return cleandb.information_schema.tables.InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.NEWEST_MODIFICATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field10() {
		return cleandb.information_schema.tables.InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.OLDEST_MODIFICATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field11() {
		return cleandb.information_schema.tables.InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.ACCESS_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field12() {
		return cleandb.information_schema.tables.InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.TABLE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field13() {
		return cleandb.information_schema.tables.InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.INDEX_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field14() {
		return cleandb.information_schema.tables.InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.NUMBER_RECORDS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field15() {
		return cleandb.information_schema.tables.InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.DATA_SIZE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field16() {
		return cleandb.information_schema.tables.InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.COMPRESSED_SIZE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field17() {
		return cleandb.information_schema.tables.InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.COMPRESSED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field18() {
		return cleandb.information_schema.tables.InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.IO_FIX;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field19() {
		return cleandb.information_schema.tables.InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.IS_OLD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field20() {
		return cleandb.information_schema.tables.InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.FREE_PAGE_CLOCK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value1() {
		return getPoolId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value2() {
		return getLruPosition();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value3() {
		return getSpace();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value4() {
		return getPageNumber();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getPageType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value6() {
		return getFlushType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value7() {
		return getFixCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getIsHashed();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value9() {
		return getNewestModification();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value10() {
		return getOldestModification();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value11() {
		return getAccessTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value12() {
		return getTableName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value13() {
		return getIndexName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value14() {
		return getNumberRecords();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value15() {
		return getDataSize();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value16() {
		return getCompressedSize();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value17() {
		return getCompressed();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value18() {
		return getIoFix();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value19() {
		return getIsOld();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value20() {
		return getFreePageClock();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value1(org.jooq.types.ULong value) {
		setPoolId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value2(org.jooq.types.ULong value) {
		setLruPosition(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value3(org.jooq.types.ULong value) {
		setSpace(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value4(org.jooq.types.ULong value) {
		setPageNumber(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value5(java.lang.String value) {
		setPageType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value6(org.jooq.types.ULong value) {
		setFlushType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value7(org.jooq.types.ULong value) {
		setFixCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value8(java.lang.String value) {
		setIsHashed(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value9(org.jooq.types.ULong value) {
		setNewestModification(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value10(org.jooq.types.ULong value) {
		setOldestModification(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value11(org.jooq.types.ULong value) {
		setAccessTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value12(java.lang.String value) {
		setTableName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value13(java.lang.String value) {
		setIndexName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value14(org.jooq.types.ULong value) {
		setNumberRecords(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value15(org.jooq.types.ULong value) {
		setDataSize(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value16(org.jooq.types.ULong value) {
		setCompressedSize(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value17(java.lang.String value) {
		setCompressed(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value18(java.lang.String value) {
		setIoFix(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value19(java.lang.String value) {
		setIsOld(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value20(org.jooq.types.ULong value) {
		setFreePageClock(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord values(org.jooq.types.ULong value1, org.jooq.types.ULong value2, org.jooq.types.ULong value3, org.jooq.types.ULong value4, java.lang.String value5, org.jooq.types.ULong value6, org.jooq.types.ULong value7, java.lang.String value8, org.jooq.types.ULong value9, org.jooq.types.ULong value10, org.jooq.types.ULong value11, java.lang.String value12, java.lang.String value13, org.jooq.types.ULong value14, org.jooq.types.ULong value15, org.jooq.types.ULong value16, java.lang.String value17, java.lang.String value18, java.lang.String value19, org.jooq.types.ULong value20) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached InnodbBufferPageLruRecord
	 */
	public InnodbBufferPageLruRecord() {
		super(cleandb.information_schema.tables.InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU);
	}

	/**
	 * Create a detached, initialised InnodbBufferPageLruRecord
	 */
	public InnodbBufferPageLruRecord(org.jooq.types.ULong poolId, org.jooq.types.ULong lruPosition, org.jooq.types.ULong space, org.jooq.types.ULong pageNumber, java.lang.String pageType, org.jooq.types.ULong flushType, org.jooq.types.ULong fixCount, java.lang.String isHashed, org.jooq.types.ULong newestModification, org.jooq.types.ULong oldestModification, org.jooq.types.ULong accessTime, java.lang.String tableName, java.lang.String indexName, org.jooq.types.ULong numberRecords, org.jooq.types.ULong dataSize, org.jooq.types.ULong compressedSize, java.lang.String compressed, java.lang.String ioFix, java.lang.String isOld, org.jooq.types.ULong freePageClock) {
		super(cleandb.information_schema.tables.InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU);

		setValue(0, poolId);
		setValue(1, lruPosition);
		setValue(2, space);
		setValue(3, pageNumber);
		setValue(4, pageType);
		setValue(5, flushType);
		setValue(6, fixCount);
		setValue(7, isHashed);
		setValue(8, newestModification);
		setValue(9, oldestModification);
		setValue(10, accessTime);
		setValue(11, tableName);
		setValue(12, indexName);
		setValue(13, numberRecords);
		setValue(14, dataSize);
		setValue(15, compressedSize);
		setValue(16, compressed);
		setValue(17, ioFix);
		setValue(18, isOld);
		setValue(19, freePageClock);
	}
}
