package com.invo.common.generator;

import com.invo.common.config.AppCofig;

/**
 * 自动生成代码，指定输入路径！
 * 配置重写父类的set**方法即可
 *
 * @author wuwanggao@pinming.cn
 * @dete 2018-1-23
 */
public class MybatisGenerator extends AbstractGeneratorConfig {


    @Override
    protected String setClassPath() {
        return AppCofig.CLASSPATH;
    }

}
