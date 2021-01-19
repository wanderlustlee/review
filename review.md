## JUC
- [从ConcurrentHashMap的演进看Java多线程核心技术](http://www.jasongj.com/java/concurrenthashmap/)

##AQS
- [从ReentrantLock的实现看AQS的原理及应用](https://tech.meituan.com/2019/12/05/aqs-theory-and-apply.html)
- [ReentrantLock可中断锁](https://www.dazhuanlan.com/2020/02/28/5e5848fa51bef/)

## JVM
- [JVM内存布局及GC原理](https://www.infoq.cn/article/3wyretkqrhivtw4frmr3)
- [JVM 类加载机制](https://juejin.cn/post/6844904113726193671)

## 并发与多线程
- [线程状态](https://zhuanlan.zhihu.com/p/73354504)
- [ThreadLocal的内存泄露的原因分析以及如何避免](https://my.oschina.net/ccwwlx/blog/3274700)
- [volatile保证可见性与有序性原理](https://www.cnblogs.com/dolphin0520/p/3920373.html)

## Spring
- [通过循环依赖解决你SpringIOC的所有疑惑](https://zhuanlan.zhihu.com/p/83239501)
- [Spring源码分析之Bean的解析](https://www.jianshu.com/p/19e01388ccc5)
- [深入理解JDK动态代理机制](https://www.jianshu.com/p/471c80a7e831)
- [深入理解CGLIB动态代理机制](https://www.jianshu.com/p/9a61af393e41)

## RocketMQ

- [RocketMQ 消息队列模型](https://zhuanlan.zhihu.com/p/102895005)
- [RocketMQ 设计](https://developer.aliyun.com/article/636883)

1、RocketMQ 如何确保 消息的成功投递和成功消费

2、RocketMQ 延迟消息怎么实现的
- [RocketMQ 延迟消息的使用与原理分析](http://silence.work/2018/12/16/RocketMQ-%E5%BB%B6%E8%BF%9F%E6%B6%88%E6%81%AF%E7%9A%84%E4%BD%BF%E7%94%A8%E4%B8%8E%E5%8E%9F%E7%90%86%E5%88%86%E6%9E%90/)
- [为什么开源的RocketMQ没有支持任意精度的延时消息](https://juejin.im/post/5dfb3f506fb9a0162d60b01b)
- [RocketMQ 源码分析 —— 定时消息与消息重试](http://www.iocoder.cn/RocketMQ/message-schedule-and-retry/?vip)

3、RocketMQ broker的注册机制
- [《浅入浅出》-RocketMQ](https://mp.weixin.qq.com/s/y-4TVwbc7AFGEA7q-_OkYw)

4、如何实现消息有序

## Redis
1、Redis 持久化策略

2、缓存预热怎么做
- [redis 冷启动和缓存预热](https://joyxj.com/backend/51789/)
- [缓存预热解决方案：基于 storm 实时热点统计的分布式并行缓存预热](https://zq99299.github.io/note-book/cache-pdp/069.html)

3、怎么防止缓存雪崩、缓存穿透

4、Redis 主从模式、哨兵模式、集群模式
- [你了解 Redis 的三种集群模式吗？](https://juejin.im/post/5ed51964e51d457889261c13)
- [Redis Cluster集群模式](https://phachon.com/redis/redis-3.html)

5、Redis zset的实现
- [Redis zset的数据结构:SkipList(跳表)的原理及实现](https://zhuanlan.zhihu.com/p/125767246)

6、Redis 分布式锁怎么保证释放正确
- [细说Redis分布式锁](https://juejin.im/post/5e61a454e51d4526f071e1df)

7、Redis事务
- [事务 — Redis 设计与实现](https://redisbook.readthedocs.io/en/latest/feature/transaction.html)

8、缓存更新策略
- [缓存服务的更新策略有哪些？](https://zhuanlan.zhihu.com/p/42276548)
- [如何保证缓存(redis)与数据库(MySQL)的一致性](https://developer.aliyun.com/article/712285)
- [MySQL to Redis缓存同步](https://github.com/wanderlustlee/review/blob/master/Redis/MySQL%20to%20Redis%E7%BC%93%E5%AD%98%E5%90%8C%E6%AD%A5.md)



## MySQL

- [Innodb MVCC实现原理](https://zhuanlan.zhihu.com/p/52977862)

1、MySQL explain

2、MySQL 有哪几种锁

3、MySQL insert加什么锁，insert id=6的同时 insert id=7可以吗

4、MySQL 间隙锁使用场景

5、如何解决主从数据不一致的问题


## 算法
1、TopK问题
- [Top K 的两种经典解法（堆/快排变形）与优劣比较](https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/solution/tu-jie-top-k-wen-ti-de-liang-chong-jie-fa-you-lie-/)
- [算法必学：经典的 Top K 问题](https://juejin.im/entry/5c565fb7f265da2d84105958)

2、零钱兑换问题
- [动态规划 零钱兑换](https://zhuanlan.zhihu.com/p/60906200)

3、链表求和

4、图 可不可达

5、几种排序算法的实现及复杂度（重点：快速排序、堆排序）