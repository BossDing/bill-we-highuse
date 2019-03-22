package com.geekq.billhighuse.jdbc;

/**
 * songxianjia
 */
public class DataSourceProvider {
    private static final ThreadLocal<MutableDataSource> dataSourceHolder = new ThreadLocal<MutableDataSource>();

    public static void setDataSource(final MutableDataSource customerType) {
        dataSourceHolder.set(customerType);
    }

    public static MutableDataSource getDataSource() {
        MutableDataSource ads = (MutableDataSource) dataSourceHolder.get();
        return ads;
    }

    public static void clearDataSource() {
        dataSourceHolder.remove();
    }

}
