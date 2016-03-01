#项目简介
本项目以jeesite为蓝本,采用spring boot 等新技术,对项目进行boot化，并进行解耦才分操作。项目主旨为项目组成员学习，并未学习javaee的童鞋提供学习蓝本。目前团队两人，主要利用上班之外的空余时间编写，进度会比较缓慢，有兴趣的朋友可以联系我们加入项目。

# 技术选型
|technology choose|
|---|
|spring-boot|
|thymeleaf|
|mybatis|
|shiro|
|start-bootstrap admin 2|

#主要技术介绍
* spring-boot 是继SSH 后，javaee 领域的主流技术之一，使用spring-boot 可以快速进行微服务开发。
* mybatis 这里我们运用了国内的两个有名的开源项目（同一作者）
    * [通用mapper](http://git.oschina.net/free/Mapper)，故名思意，极其方便的使用MyBatis单表的增删改查
    * [Mybatis-PageHelper](https://github.com/pagehelper/Mybatis-PageHelper)，mybatis 简单易用的分页插件 

* [start admin2](https://github.com/BlackrockDigital/startbootstrap-sb-admin-2),github上比较火的一个bootstrap框架，国内jeeshop 后台也使用了这来做后台界面，使用bower 包管理技术对js插件进行管理。
* thymeleaf模板，spring-boot官网推荐模板，最大的有点是可以直接打开看效果。

# 主要模块介绍
* boot-dao  主要是由mybatis  generator 生成的代码
* boot-common  放置了些公共配置文件，并且 依赖于boot-dao


# 快速运行
* windows 下点击 run.bat
* linux 下在跟目录下运行脚本  ./run.sh

# 测试登陆
```
curl -X POST  --data-ascii "loginName=thinkgem&password=admin" http://localhost:9090/login |iconv -f UTF-8
```
#目的计划
*  时间精力有限，学习交流第一，功能实现其次。
*  在jeesite 的基础上，可能引入dubbo 进行服务治理
