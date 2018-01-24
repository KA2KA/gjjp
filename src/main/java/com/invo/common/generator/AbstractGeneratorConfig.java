package com.invo.common.generator;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * @author wuwanggao@pinming.cn
 * @dete 2018-1-23
 */
public abstract class AbstractGeneratorConfig {

    /**
     * 自动生成代码的入口
     */
    private static final AutoGenerator autoGenerator = new AutoGenerator();

    public void init() {
        initGlobalConfig();
        initDataSourceConfig();
        initStrategyConfig();
        initPackageConfig();
        initCfgConfig();
        initTemplateConfig();
        autoGenerator.execute();


    }


    private static void initTemplateConfig() {
        TemplateConfig tc = new TemplateConfig();
        autoGenerator.setTemplate(tc);
    }

    private static void initCfgConfig() {
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {

            }
        };
        autoGenerator.setCfg(cfg);
    }

    private void initPackageConfig() {
        PackageConfig pc = new PackageConfig();
        setPackageConfig(pc);
        autoGenerator.setPackageInfo(pc);

    }

    public void setPackageConfig(PackageConfig pc) {
        pc.setParent("com.invo");
        pc.setModuleName("system");
    }

    private static void initStrategyConfig() {
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        autoGenerator.setStrategy(strategy);
    }


    private void initDataSourceConfig() {
        DataSourceConfig dsc = new DataSourceConfig();
        setDataSourceConfig(dsc);
        autoGenerator.setDataSource(dsc);
    }

    private void setDataSourceConfig(DataSourceConfig dsc) {
        dsc.setDbType(DbType.MYSQL);
        dsc.setUrl("jdbc:mysql://sh-cdb-ackq1gr4.sql.tencentcdb.com:63563/gjjp");
        dsc.setUsername("root");
        dsc.setPassword("kaka@520");
        dsc.setDriverName("com.mysql.jdbc.Driver");
    }

    /**
     * 初始化全局变量
     */
    private void initGlobalConfig() {
        GlobalConfig gc = new GlobalConfig();
        setGlobalConfig(gc);
        autoGenerator.setGlobalConfig(gc);
    }


    public void setGlobalConfig(GlobalConfig globalConfig) {
        globalConfig.setOutputDir(setClassPath());
        globalConfig.setFileOverride(false);
        globalConfig.setActiveRecord(true);
        globalConfig.setBaseResultMap(false);
        globalConfig.setBaseColumnList(false);
        globalConfig.setKotlin(false);
        globalConfig.setAuthor("wuwanggao@163.com");
    }

    /**
     * 指定classpath路径
     *
     * @return
     */
    protected abstract String setClassPath();
}
