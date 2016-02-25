package com.boot.sys.conf;

import org.springframework.context.annotation.PropertySource;

/**
 * Created by Ming on 2016/2/25.
 */

@PropertySource(value = "classpath:jeesite.properties")
public class Global {

    /**
     * 当前对象实例
     */
    private static Global global = new Global();


}
