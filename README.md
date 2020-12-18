# taxi-meter

## 出租车计价：

不大于2公里时只收起步价6元。
超过2公里的部分每公里收取0.8元。
超过8公里的部分，每公里加收50%长途费。
停车等待时加收每分钟0.25元。
最后计价的时候司机会四舍五入只收到元。


## 测试数据：
1公里,等待0分钟
3公里,等待0分钟
10公里,等待0分钟
2公里,等待3分钟

## 期望输出：
收费6元
收费7元
收费13元
收费7元


## 需求分析

名词:
出租车计价器  taxi meter
公里数 mileage
等待时间 waiting time
价格 price
起步价 starting price

动词:
计价  calculate the price


## 加入标准

通过checkstyle规则

> 单个Java文件不得超过50行。
单行代码长度不得超过150个字符。
单个方法长度不得超过10行。
单个方法的圈复杂度不得超过4。
单个方法参数个数不得超过3。
友好的方法命名。

测试覆盖率100%，没有严重的Sonar问题。

采用TDD开发模式。
