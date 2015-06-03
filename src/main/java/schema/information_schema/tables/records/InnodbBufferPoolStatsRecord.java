/**
 * This class is generated by jOOQ
 */
package schema.information_schema.tables.records;

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
public class InnodbBufferPoolStatsRecord extends org.jooq.impl.TableRecordImpl<schema.information_schema.tables.records.InnodbBufferPoolStatsRecord> {

	private static final long serialVersionUID = 1563906804;

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.POOL_ID</code>.
	 */
	public void setPoolId(org.jooq.types.ULong value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.POOL_ID</code>.
	 */
	public org.jooq.types.ULong getPoolId() {
		return (org.jooq.types.ULong) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.POOL_SIZE</code>.
	 */
	public void setPoolSize(org.jooq.types.ULong value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.POOL_SIZE</code>.
	 */
	public org.jooq.types.ULong getPoolSize() {
		return (org.jooq.types.ULong) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.FREE_BUFFERS</code>.
	 */
	public void setFreeBuffers(org.jooq.types.ULong value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.FREE_BUFFERS</code>.
	 */
	public org.jooq.types.ULong getFreeBuffers() {
		return (org.jooq.types.ULong) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.DATABASE_PAGES</code>.
	 */
	public void setDatabasePages(org.jooq.types.ULong value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.DATABASE_PAGES</code>.
	 */
	public org.jooq.types.ULong getDatabasePages() {
		return (org.jooq.types.ULong) getValue(3);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.OLD_DATABASE_PAGES</code>.
	 */
	public void setOldDatabasePages(org.jooq.types.ULong value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.OLD_DATABASE_PAGES</code>.
	 */
	public org.jooq.types.ULong getOldDatabasePages() {
		return (org.jooq.types.ULong) getValue(4);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.MODIFIED_DATABASE_PAGES</code>.
	 */
	public void setModifiedDatabasePages(org.jooq.types.ULong value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.MODIFIED_DATABASE_PAGES</code>.
	 */
	public org.jooq.types.ULong getModifiedDatabasePages() {
		return (org.jooq.types.ULong) getValue(5);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PENDING_DECOMPRESS</code>.
	 */
	public void setPendingDecompress(org.jooq.types.ULong value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PENDING_DECOMPRESS</code>.
	 */
	public org.jooq.types.ULong getPendingDecompress() {
		return (org.jooq.types.ULong) getValue(6);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PENDING_READS</code>.
	 */
	public void setPendingReads(org.jooq.types.ULong value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PENDING_READS</code>.
	 */
	public org.jooq.types.ULong getPendingReads() {
		return (org.jooq.types.ULong) getValue(7);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PENDING_FLUSH_LRU</code>.
	 */
	public void setPendingFlushLru(org.jooq.types.ULong value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PENDING_FLUSH_LRU</code>.
	 */
	public org.jooq.types.ULong getPendingFlushLru() {
		return (org.jooq.types.ULong) getValue(8);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PENDING_FLUSH_LIST</code>.
	 */
	public void setPendingFlushList(org.jooq.types.ULong value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PENDING_FLUSH_LIST</code>.
	 */
	public org.jooq.types.ULong getPendingFlushList() {
		return (org.jooq.types.ULong) getValue(9);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_MADE_YOUNG</code>.
	 */
	public void setPagesMadeYoung(org.jooq.types.ULong value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_MADE_YOUNG</code>.
	 */
	public org.jooq.types.ULong getPagesMadeYoung() {
		return (org.jooq.types.ULong) getValue(10);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_NOT_MADE_YOUNG</code>.
	 */
	public void setPagesNotMadeYoung(org.jooq.types.ULong value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_NOT_MADE_YOUNG</code>.
	 */
	public org.jooq.types.ULong getPagesNotMadeYoung() {
		return (org.jooq.types.ULong) getValue(11);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_MADE_YOUNG_RATE</code>.
	 */
	public void setPagesMadeYoungRate(java.lang.Double value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_MADE_YOUNG_RATE</code>.
	 */
	public java.lang.Double getPagesMadeYoungRate() {
		return (java.lang.Double) getValue(12);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_MADE_NOT_YOUNG_RATE</code>.
	 */
	public void setPagesMadeNotYoungRate(java.lang.Double value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_MADE_NOT_YOUNG_RATE</code>.
	 */
	public java.lang.Double getPagesMadeNotYoungRate() {
		return (java.lang.Double) getValue(13);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_READ</code>.
	 */
	public void setNumberPagesRead(org.jooq.types.ULong value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_READ</code>.
	 */
	public org.jooq.types.ULong getNumberPagesRead() {
		return (org.jooq.types.ULong) getValue(14);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_CREATED</code>.
	 */
	public void setNumberPagesCreated(org.jooq.types.ULong value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_CREATED</code>.
	 */
	public org.jooq.types.ULong getNumberPagesCreated() {
		return (org.jooq.types.ULong) getValue(15);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_WRITTEN</code>.
	 */
	public void setNumberPagesWritten(org.jooq.types.ULong value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_WRITTEN</code>.
	 */
	public org.jooq.types.ULong getNumberPagesWritten() {
		return (org.jooq.types.ULong) getValue(16);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_READ_RATE</code>.
	 */
	public void setPagesReadRate(java.lang.Double value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_READ_RATE</code>.
	 */
	public java.lang.Double getPagesReadRate() {
		return (java.lang.Double) getValue(17);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_CREATE_RATE</code>.
	 */
	public void setPagesCreateRate(java.lang.Double value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_CREATE_RATE</code>.
	 */
	public java.lang.Double getPagesCreateRate() {
		return (java.lang.Double) getValue(18);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_WRITTEN_RATE</code>.
	 */
	public void setPagesWrittenRate(java.lang.Double value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_WRITTEN_RATE</code>.
	 */
	public java.lang.Double getPagesWrittenRate() {
		return (java.lang.Double) getValue(19);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_GET</code>.
	 */
	public void setNumberPagesGet(org.jooq.types.ULong value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_GET</code>.
	 */
	public org.jooq.types.ULong getNumberPagesGet() {
		return (org.jooq.types.ULong) getValue(20);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.HIT_RATE</code>.
	 */
	public void setHitRate(org.jooq.types.ULong value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.HIT_RATE</code>.
	 */
	public org.jooq.types.ULong getHitRate() {
		return (org.jooq.types.ULong) getValue(21);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.YOUNG_MAKE_PER_THOUSAND_GETS</code>.
	 */
	public void setYoungMakePerThousandGets(org.jooq.types.ULong value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.YOUNG_MAKE_PER_THOUSAND_GETS</code>.
	 */
	public org.jooq.types.ULong getYoungMakePerThousandGets() {
		return (org.jooq.types.ULong) getValue(22);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.NOT_YOUNG_MAKE_PER_THOUSAND_GETS</code>.
	 */
	public void setNotYoungMakePerThousandGets(org.jooq.types.ULong value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.NOT_YOUNG_MAKE_PER_THOUSAND_GETS</code>.
	 */
	public org.jooq.types.ULong getNotYoungMakePerThousandGets() {
		return (org.jooq.types.ULong) getValue(23);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_READ_AHEAD</code>.
	 */
	public void setNumberPagesReadAhead(org.jooq.types.ULong value) {
		setValue(24, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_READ_AHEAD</code>.
	 */
	public org.jooq.types.ULong getNumberPagesReadAhead() {
		return (org.jooq.types.ULong) getValue(24);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_READ_AHEAD_EVICTED</code>.
	 */
	public void setNumberReadAheadEvicted(org.jooq.types.ULong value) {
		setValue(25, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_READ_AHEAD_EVICTED</code>.
	 */
	public org.jooq.types.ULong getNumberReadAheadEvicted() {
		return (org.jooq.types.ULong) getValue(25);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.READ_AHEAD_RATE</code>.
	 */
	public void setReadAheadRate(java.lang.Double value) {
		setValue(26, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.READ_AHEAD_RATE</code>.
	 */
	public java.lang.Double getReadAheadRate() {
		return (java.lang.Double) getValue(26);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.READ_AHEAD_EVICTED_RATE</code>.
	 */
	public void setReadAheadEvictedRate(java.lang.Double value) {
		setValue(27, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.READ_AHEAD_EVICTED_RATE</code>.
	 */
	public java.lang.Double getReadAheadEvictedRate() {
		return (java.lang.Double) getValue(27);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.LRU_IO_TOTAL</code>.
	 */
	public void setLruIoTotal(org.jooq.types.ULong value) {
		setValue(28, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.LRU_IO_TOTAL</code>.
	 */
	public org.jooq.types.ULong getLruIoTotal() {
		return (org.jooq.types.ULong) getValue(28);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.LRU_IO_CURRENT</code>.
	 */
	public void setLruIoCurrent(org.jooq.types.ULong value) {
		setValue(29, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.LRU_IO_CURRENT</code>.
	 */
	public org.jooq.types.ULong getLruIoCurrent() {
		return (org.jooq.types.ULong) getValue(29);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.UNCOMPRESS_TOTAL</code>.
	 */
	public void setUncompressTotal(org.jooq.types.ULong value) {
		setValue(30, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.UNCOMPRESS_TOTAL</code>.
	 */
	public org.jooq.types.ULong getUncompressTotal() {
		return (org.jooq.types.ULong) getValue(30);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.UNCOMPRESS_CURRENT</code>.
	 */
	public void setUncompressCurrent(org.jooq.types.ULong value) {
		setValue(31, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.UNCOMPRESS_CURRENT</code>.
	 */
	public org.jooq.types.ULong getUncompressCurrent() {
		return (org.jooq.types.ULong) getValue(31);
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached InnodbBufferPoolStatsRecord
	 */
	public InnodbBufferPoolStatsRecord() {
		super(schema.information_schema.tables.InnodbBufferPoolStats.INNODB_BUFFER_POOL_STATS);
	}

	/**
	 * Create a detached, initialised InnodbBufferPoolStatsRecord
	 */
	public InnodbBufferPoolStatsRecord(org.jooq.types.ULong poolId, org.jooq.types.ULong poolSize, org.jooq.types.ULong freeBuffers, org.jooq.types.ULong databasePages, org.jooq.types.ULong oldDatabasePages, org.jooq.types.ULong modifiedDatabasePages, org.jooq.types.ULong pendingDecompress, org.jooq.types.ULong pendingReads, org.jooq.types.ULong pendingFlushLru, org.jooq.types.ULong pendingFlushList, org.jooq.types.ULong pagesMadeYoung, org.jooq.types.ULong pagesNotMadeYoung, java.lang.Double pagesMadeYoungRate, java.lang.Double pagesMadeNotYoungRate, org.jooq.types.ULong numberPagesRead, org.jooq.types.ULong numberPagesCreated, org.jooq.types.ULong numberPagesWritten, java.lang.Double pagesReadRate, java.lang.Double pagesCreateRate, java.lang.Double pagesWrittenRate, org.jooq.types.ULong numberPagesGet, org.jooq.types.ULong hitRate, org.jooq.types.ULong youngMakePerThousandGets, org.jooq.types.ULong notYoungMakePerThousandGets, org.jooq.types.ULong numberPagesReadAhead, org.jooq.types.ULong numberReadAheadEvicted, java.lang.Double readAheadRate, java.lang.Double readAheadEvictedRate, org.jooq.types.ULong lruIoTotal, org.jooq.types.ULong lruIoCurrent, org.jooq.types.ULong uncompressTotal, org.jooq.types.ULong uncompressCurrent) {
		super(schema.information_schema.tables.InnodbBufferPoolStats.INNODB_BUFFER_POOL_STATS);

		setValue(0, poolId);
		setValue(1, poolSize);
		setValue(2, freeBuffers);
		setValue(3, databasePages);
		setValue(4, oldDatabasePages);
		setValue(5, modifiedDatabasePages);
		setValue(6, pendingDecompress);
		setValue(7, pendingReads);
		setValue(8, pendingFlushLru);
		setValue(9, pendingFlushList);
		setValue(10, pagesMadeYoung);
		setValue(11, pagesNotMadeYoung);
		setValue(12, pagesMadeYoungRate);
		setValue(13, pagesMadeNotYoungRate);
		setValue(14, numberPagesRead);
		setValue(15, numberPagesCreated);
		setValue(16, numberPagesWritten);
		setValue(17, pagesReadRate);
		setValue(18, pagesCreateRate);
		setValue(19, pagesWrittenRate);
		setValue(20, numberPagesGet);
		setValue(21, hitRate);
		setValue(22, youngMakePerThousandGets);
		setValue(23, notYoungMakePerThousandGets);
		setValue(24, numberPagesReadAhead);
		setValue(25, numberReadAheadEvicted);
		setValue(26, readAheadRate);
		setValue(27, readAheadEvictedRate);
		setValue(28, lruIoTotal);
		setValue(29, lruIoCurrent);
		setValue(30, uncompressTotal);
		setValue(31, uncompressCurrent);
	}
}
