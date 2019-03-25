![互联网数据安全高可用策略](https://raw.githubusercontent.com/qiurunze123/imageall/master/anquangaokeyong.png)

> 邮箱 : [QiuRunZe_key@163.com](QiuRunZe_key@163.com)

> Github : [https://github.com/qiurunze123](https://github.com/qiurunze123)

> QQ : [3341386488](3341386488)

> QQ群 :

![整体流程](https://raw.githubusercontent.com/qiurunze123/imageall/master/qq.png)

[![Travis](https://img.shields.io/badge/language-Java-yellow.svg)](https://github.com/qiurunze123)

本系列是针对如何进行大数据量（经测试几亿数据完全搞的定）进行安全高可用的策略，示例为账单的高可用策略,如何进行`切面多数据源配置`,`数据分片`,`数据导入`,`账单计算`,`多线程策略`等等
本文属于进阶系列，有问题或者更好的想法可以一起探讨！
一点小建议：学习本系列知识之前，如果你完全没接触过 `SpringBoot`、`Redis`、`Dubbo`、`ZK` 、`Maven`,`lua`等，那么我建议你可以先在网上搜一下每一块知识的快速入门，
也可以下载本项目边做边学习，我的项目完全是实战加讲解不想写一堆的文章，浪费我们的生命，你还不懂内层含义，想要明白就边实际操作边学习，效果会更好！加油💪💪

### here  we  go !

> 软件环境 : 请选择稳定版 

![整体流程](https://raw.githubusercontent.com/qiurunze123/imageall/master/技术栈.png)


> 软件环境 : 数据库表设计

![整体流程](https://raw.githubusercontent.com/qiurunze123/imageall/master/zhangdangaokeyong1.png)


###  以下所有内容都已完成，但是因内容多需逐渐整理上传！

###  [如要提交代码请先看--提交合并代码规范提交者的后面都会有署名方便大家问问题](/docs/code-criterion.md)

| ID | Problem  | Article | 
| --- | ---   | :--- |
| 000 |切面进行多数据源配置 | [解决思路](/docs/code-solve.md) |
| 001 |数据库表设计思路 | [解决思路](/docs/code-solve.md) |
| 002 |手动事务保证数据一致性 | [解决思路](/docs/code-solve.md) |
| 003 |如何在程序断主从与恢复 | [解决思路](/docs/code-solve.md) |
| 004 |定时任务配置 | [解决思路](/docs/code-solve.md) |
| 005 |账单导入批次策略 | [解决思路](/docs/code-solve.md) |
| 006 |存量策略 | [解决思路](/docs/code-solve.md) |
| 007 |增量策略 | [解决思路](/docs/code-solve.md) |
| 008 |数据库分表策略 | [解决思路](/docs/code-solve.md) |
| 009 |数据一致性如何保证 | [解决思路](/docs/code-solve.md) |
| 010 |数据如何进行补偿| [解决思路](/docs/code-solve.md) |
| 011 |如何进行幂等性设计 | [解决思路](/docs/code-solve.md) |
| 012 |多线程跑批如何保证数据一致性 | [解决思路](/docs/code-solve.md) |
| 013 |如何保证数据抽取可靠性 | [解决思路](/docs/code-solve.md) |
| 014 |导入批次如果失败怎么办 | [解决思路](/docs/code-solve.md) |
| 015 |业务报警 | [解决思路](/docs/code-solve.md) |
