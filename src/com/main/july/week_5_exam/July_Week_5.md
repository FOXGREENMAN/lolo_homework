6. 数字位数缩减
设计一个方法, 接收三个参数, 一个长整型, 传入随机数; 一个整型, 传入缩减长度; 一个整型, 传入 0, 10, 100 或1000;
根据长度将随机数缩减为指定长度,  然后除以第三个参数, 将得到结果返回; 

7. 字母数字转换
设计一个方法, 接收两个参数, 一个字母, 一个数字;
将字母和数字建立对应的映射关系, 如: a=1, b=2, c=3 ... z=26;
返回一个建立好映射关系的map;
如果输入的映射关系不存在, 则加入map, 否则打印错误语句, 放弃操作;

8. 单词的价格
设计一个方法, 接收一个参数, 一个英文单词; 返回一个数字;
方法根据 题目7 中的方法, 计算每个字母对应的数字的总和, 并返回; 
例如: 
输入: apple
已建立的映射关系: a=1, p=16, p=16, l=12, e=5
返回结果 1+16+16+12+5=51

9. 基本数据类型和包装类

代码:
java
```
        Double d = new Double("0"); // 第一行
        
        d = 2; // 第二行

        double dou = 3; // 第三行
```
问题:
-- > 为什么第二行会编译报错;
-- > 为什么第三行编译不报错;
-- > 第二行如何修改, 有几种修改方式;

10. Integer类 valueOf方法的使用
分别传入以下参数，观察程序输出结果：
1)传入数字类型字符串；
2)传入非数字类型字符串；
3)传入null；
思考：为什么能传入null？

11.Byte类 使用intValue方法将一个int类型数字转换为Integer；
思考：Byte类中可以有将int类型转换为byte类型的方法吗？有的话有什么问题？

12.String类 基本操作，自己实现栗子
1)截取字符串：输入“foxman”，输出“fox”；
2)反向截取字符串：输入“foxman-lolo“，输出“lolo“；
3)截取字符串子串：输入“FOXgreenMAN@163.com”，输出“green“
4)截取一级域名：输入“www.chainup.com”，输出“chainup“，进阶要求，输入任意www.xxxyyyzzz.com或者www.aaabbb.net这种域名，都能截取到www和com中间的字符串；
5)获取字符串长度，自己写栗子；
6)字符串大小写转换，自己写栗子；
7)字符串字母提取，将一个单词的每个字母依次输出，例如 chainup，依次输出c，h，a，i，n，u，p；要求：不能在输入时手动写入分隔符；










