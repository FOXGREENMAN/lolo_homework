### 创建一个父类, 名称: Articles
+ 创建三个Articles的子类, 名称: News, Notice, EventNotification; 

+ 父类Articles 有以下属性:

    + + lang(String)
    
    + + title(String)
    
    + + content(String)
    
    + + describe(String)
    
    + + size(Integer)
    
+ 子类有自己的独立属性:

    + + News的独立属性: createTime(Date), reporter(String)
    
    + + Notice的独立属性: validTime(Date)
    
    + + EventNotification的独立属性: isRelease(Byte)
    
+ Demo中建立以下方法:

    1. 通过title创建News对象, 其他属性添加默认值; 日期类型添加当前时间, 字符串类型添加"None";
    
    2. 通过reporter更新News对象, 接收reporter参数, 和原始News对象, 返回更新后的News对象;
    
    3. 编写一个方法, 接收两个参数, pName, cName; 要求: cName 传入子类对象的名称, pName传入父类对象的名称; 
    
    方法内新建一个对象, 初始title为cName, 打印一次对象内容, 然后将title更新为pName, 再打印一次对象内容;
   
    4. 父类Articles中定义方法 setLangByTitle:
    
    接收三个参数, art 为对象实体, langKey 设置art的属性lang, title 设置art的title属性;
    
    在子类News的构造方法里调用这个方法, 接收两个参数 langkey设置属性lang, title设置属性title;
    
    在Demo中编写测试方法实现上面逻辑;
    
    5. 是否能定义一个父类对象, 但新建一个子类对象对其赋值; 用代码证明结论;
          
          