package com.invo.common.generator;

import com.baomidou.mybatisplus.generator.config.DataSourceConfig;

import javax.sql.DataSource;

/**
 * @author wuwanggao@pinming.cn
 * @dete 2018-1-24
 */
public class DuridDataSourceConfig extends DataSourceConfig {

    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
