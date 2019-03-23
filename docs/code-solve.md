#####  高可用策略分析 

**1.如何利用切面在springboot2.0中配置多个数据源**

    1.DataSourceConfig 负责启动加载 多个数据库配置
    2.DataSourceContextHolder threadlocal 负责中间传递作用
    3.DynamicDataSource AbstractRoutingDataSource 根据key获取数据源
    4.DynamicDataSourceAspet 数据源切换注解必须注到service层否则使用切面
    5.GeekQSourceConnection 数据源切换注解
    
    每个类中已讲解具体作用与流程  包jdbc
    
**2.数据库表设计思路**
 