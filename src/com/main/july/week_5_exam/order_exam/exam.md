# 订单查询 

1. 创建订单对象, 名称 Order

属性字段: 

orderId // 订单ID, 长整型
price // 价格, 双精度浮点
volume // 数量, 双精度浮点
side // 字符串, 买卖单方向, "SELL"为买单, "BUY"为卖单
oStatus // 字节类型, 订单状态 0 初始订单, 1 新订单, 2 完全成交订单, 6 异常单;
tradeList // List 类型, 泛型指定为Trade对象, 成交记录列表;
ctime // 日期类型, 创建时间
mtime // 日期类型, 更新时间


2. 创建成交记录对象, 名称 Trade

tradeId // 成交记录ID, 长整型
price // 价格, 双精度浮点
volume // 数量, 双精度浮点
ctime // 日期类型, 创建时间
mtime // 日期类型, 更新时间


3. 创建一个方法, 用于存储订单

方法接收一个订单, key使用订单ID, value使用订单对象本身;
将订单存入 src\com\main\july\week_5_exam\order_exam\dao\DatabaseHungry.java 对象的 dbMap 属性中; 

调用方式 Map<String,Object> orderDb = Database_laze.getInstance().dbMap;

创建订单方法存入时需要校验订单ID是否存在, 如果存在则报错, 阻止存入;


4. 创建订单业务

需求: 接收前端参数, 类型为map, 其中有创建订单三要素: 价格, 数量, 买卖单方向;
订单ID使用系统当前时间戳;
订单状态初始化为0;
订单创建日期和更新日期使用当前时间; 

系统架构要求:

有Controller层和Service层; 
Controller层负责接收参数, 传递给Service层; 
在Service层中, 将订单存入第三步创建的数据库map中; 

5. 撤销订单业务

创建一个方法, 接收一个参数, 订单ID; 方法返回删除结果;
根据订单ID 在map中找到订单, 进行删除;

要求: 对找到的订单判断状态, 状态不为2的订单才可以删除, 否则打印报错, 返回删除失败;


6. 对第四题进行改造;

接收前端参数时, 对参数进行校验;

1) 校验price字段为非负数;
2) 校验price字段为数字, 非字母;
3) 校验price字段不能大于单日最大下单价格;
单日最大下单价格定义为常量, 名称: price_day_max
4) 校验price字段不能小于单日最小下单价格;
单日最小下单价格定义为常量, 名称: price_day_min

校验通过则进行下一步, 不通过打印错误提示, 阻止方法运行; 


7. 将第6题的校验逻辑封装成一个对象, 名称: CheckParam
定义一个对象方法, 名称 check();

用这个对象改造第六题的校验步骤; 