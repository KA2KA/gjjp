package com.invo.common.utils;

import com.invo.common.generator.MybatisGenerator;

/**
 * @author wuwanggao@pinming.cn
 * @dete 2018-1-24
 */
public class CodeUtil {
    /**
     * 自动生成代码
     */
    public static void generateCode() {
        MybatisGenerator mybatisGenerator = new MybatisGenerator();
        mybatisGenerator.init();
    }

    public static void main(String[] args) {
        CodeUtil.generateCode();
    }
}
