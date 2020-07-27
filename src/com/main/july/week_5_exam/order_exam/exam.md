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
将订单存入 src\com\main\july\week_5_exam\order_exam\DatabaseHungry.java 对象的map属性中; 

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