#####  高可用策略分析 

**1.如何利用切面在springboot2.0中配置多个数据源**

    1.DataSourceConfig 负责启动加载 多个数据库配置
    2.DataSourceContextHolder threadlocal 负责中间传递作用
    3.DynamicDataSource AbstractRoutingDataSource 根据key获取数据源
    4.DynamicDataSourceAspet 数据源切换注解必须注到service层否则使用切面
    5.GeekQSourceConnection 数据源切换注解
    
    每个类中已讲解具体作用与流程  包jdbc
    
**2.数据库表设计思路**

高可用表设计的时候考虑到业务量数据量太大，所以不可能在一个范围内把数据吃掉，所以分成了两个部分：

1.bill_task ,bill_step 等 类似于一个task对应多个step 每个step 对应一个范围，每个范围对应不用的数据

2.task和step  设置为`同生共死` 

3.import_xxx_03 ,import_xxx_04 等等根据每个月份分表来减少数据库压力

4.多个数据源来从不同的数据库中搂数据然后进行分片，每个来自不同类型的数据定义为不同类型

5.利用每个step的不同表范围 range_start , range_end来进行分批导入

_数据库结构_

step：
 ![整体流程](https://raw.githubusercontent.com/qiurunze123/imageall/master/gaokeyong2.png)

task:
![整体流程](https://raw.githubusercontent.com/qiurunze123/imageall/master/gaokeyong3.png)

 