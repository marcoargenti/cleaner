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
public class InnodbBufferPageLru extends org.jooq.impl.TableImpl<cleandb.information_schema.tables.records.InnodbBufferPageLruRecord> {

	private static final long serialVersionUID = 142360734;

	/**
	 * The reference instance of <code>information_schema.INNODB_BUFFER_PAGE_LRU</code>
	 */
	public static final cleandb.information_schema.tables.InnodbBufferPageLru INNODB_BUFFER_PAGE_LRU = new cleandb.information_schema.tables.InnodbBufferPageLru();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<cleandb.information_schema.tables.records.InnodbBufferPageLruRecord> getRecordType() {
		return cleandb.information_schema.tables.records.InnodbBufferPageLruRecord.class;
	}

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.POOL_ID</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.InnodbBufferPageLruRecord, org.jooq.types.ULong> POOL_ID = createField("POOL_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.LRU_POSITION</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.InnodbBufferPageLruRecord, org.jooq.types.ULong> LRU_POSITION = createField("LRU_POSITION", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.SPACE</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.InnodbBufferPageLruRecord, org.jooq.types.ULong> SPACE = createField("SPACE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.PAGE_NUMBER</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.InnodbBufferPageLruRecord, org.jooq.types.ULong> PAGE_NUMBER = createField("PAGE_NUMBER", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.PAGE_TYPE</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.InnodbBufferPageLruRecord, java.lang.String> PAGE_TYPE = createField("PAGE_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.FLUSH_TYPE</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.InnodbBufferPageLruRecord, org.jooq.types.ULong> FLUSH_TYPE = createField("FLUSH_TYPE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.FIX_COUNT</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.InnodbBufferPageLruRecord, org.jooq.types.ULong> FIX_COUNT = createField("FIX_COUNT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.IS_HASHED</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.InnodbBufferPageLruRecord, java.lang.String> IS_HASHED = createField("IS_HASHED", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.NEWEST_MODIFICATION</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.InnodbBufferPageLruRecord, org.jooq.types.ULong> NEWEST_MODIFICATION = createField("NEWEST_MODIFICATION", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.OLDEST_MODIFICATION</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.InnodbBufferPageLruRecord, org.jooq.types.ULong> OLDEST_MODIFICATION = createField("OLDEST_MODIFICATION", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.ACCESS_TIME</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.InnodbBufferPageLruRecord, org.jooq.types.ULong> ACCESS_TIME = createField("ACCESS_TIME", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.TABLE_NAME</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.InnodbBufferPageLruRecord, java.lang.String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.INDEX_NAME</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.InnodbBufferPageLruRecord, java.lang.String> INDEX_NAME = createField("INDEX_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.NUMBER_RECORDS</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.InnodbBufferPageLruRecord, org.jooq.types.ULong> NUMBER_RECORDS = createField("NUMBER_RECORDS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.DATA_SIZE</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.InnodbBufferPageLruRecord, org.jooq.types.ULong> DATA_SIZE = createField("DATA_SIZE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.COMPRESSED_SIZE</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.InnodbBufferPageLruRecord, org.jooq.types.ULong> COMPRESSED_SIZE = createField("COMPRESSED_SIZE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.COMPRESSED</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.InnodbBufferPageLruRecord, java.lang.String> COMPRESSED = createField("COMPRESSED", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.IO_FIX</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.InnodbBufferPageLruRecord, java.lang.String> IO_FIX = createField("IO_FIX", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.IS_OLD</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.InnodbBufferPageLruRecord, java.lang.String> IS_OLD = createField("IS_OLD", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.FREE_PAGE_CLOCK</code>.
	 */
	public final org.jooq.TableField<cleandb.information_schema.tables.records.InnodbBufferPageLruRecord, org.jooq.types.ULong> FREE_PAGE_CLOCK = createField("FREE_PAGE_CLOCK", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>information_schema.INNODB_BUFFER_PAGE_LRU</code> table reference
	 */
	public InnodbBufferPageLru() {
		this("INNODB_BUFFER_PAGE_LRU", null);
	}

	/**
	 * Create an aliased <code>information_schema.INNODB_BUFFER_PAGE_LRU</code> table reference
	 */
	public InnodbBufferPageLru(java.lang.String alias) {
		this(alias, cleandb.information_schema.tables.InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU);
	}

	private InnodbBufferPageLru(java.lang.String alias, org.jooq.Table<cleandb.information_schema.tables.records.InnodbBufferPageLruRecord> aliased) {
		this(alias, aliased, null);
	}

	private InnodbBufferPageLru(java.lang.String alias, org.jooq.Table<cleandb.information_schema.tables.records.InnodbBufferPageLruRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, cleandb.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public cleandb.information_schema.tables.InnodbBufferPageLru as(java.lang.String alias) {
		return new cleandb.information_schema.tables.InnodbBufferPageLru(alias, this);
	}

	/**
	 * Rename this table
	 */
	public cleandb.information_schema.tables.InnodbBufferPageLru rename(java.lang.String name) {
		return new cleandb.information_schema.tables.InnodbBufferPageLru(name, null);
	}
}
