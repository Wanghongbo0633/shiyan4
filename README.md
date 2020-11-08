# shiyan4
shiyan4
一、实验目的

掌握Java中抽象类和抽象方法的定义；
掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法
了解异常的使用方法，并在程序中根据输入情况做异常处理

二、实验内容

某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。
设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。
设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。要求
编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额。

三、实验要求

在博士研究生类中实现各个接口定义的抽象方法;
对年学费和年收入进行统计，用收入减去学费，求得纳税额；
国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static final修饰定义。
实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。
根据输入情况，要在程序中做异常处理。

四、 实验流程:

    根据实验内容，设立两个接口，学生管理接口和教师管理接口，并声明缴纳学费，查询学费（学生管理接口），支付薪水，查询薪水（教师管理接口）
    根据实验内容，设计博士研究生类，并利用set与get方法来实现以上两个接口，同时添加姓名，性别，年龄，每学期学费，每月薪水属性。
    对博士研究生类进行复写（toString），以便在Test类中输出。
    自定义异常类Aexception，以便在Test类中能使用户输入正确的姓名。
    设计Test类
    (1) 用static final定义修饰个人所得税系数z1，z2
    (2) 建立博士研究生类数组x[2]
    (3) 利用for循环初始化数组中每个元素
    (4) 利用Scanner类变量，set函数，完成对博士研究生类中的各个元素进行赋值 (5) 利用try……catch语句，来捕获对博士研究生类赋值过程中的异常，并利用while(true)死循环来设定，只有用户正确输入后，程序才会往下运行。
    (6) 利用正则表达式与try……语句，以及自定义异常，throw语句，来规定只有用户输入姓名时，全为英文，程序才会向下运行。
    (7) 利用for循环来遍历博士研究生类数组中每一个数组下标，并设立while(true)
    (8) 利用Switch，Scanner语句来设计查询列表，完成当用户输入相关功能代码时，程序实现指定功能，并利用break<标签>，来实现跳出以上循环。
    (9) 利用if语句判断，当博士研究生的学费与薪水的差值为不同税率时，计算不同情况下的个人所得税与税后薪水。
    程序结束

五、 核心代码

package shiyan4;


public class Graduate implements StudentInterface, TeacherInterface{
    private String name;
    private String sex;
    private int age;
    private double xuefei;
    private double salary;
    public void setName(String a) {
        name = a;
    }
    public void setSex(String a) {
        sex = a;
    }
    public void setAge(int a) {
        age = a;
    }
    public void setmoney(double a, double b) {
        xuefei = a;
        salary = b;
    }
    public double setxuefei(){
        return 0;
    }
    public double getxuefei(){//返回每学年的费用
        return xuefei * 2;
    }
    public double setsalary(){
        return 0;
    }
    public double getsalary(){//返回年收入
        return salary * 12;
    }

}
六、实验结果

https://github.com/Wanghongbo0633/shiyan4/blob/main/%E7%BB%93%E6%9E%9C.PNG

七、实验感想

这次实验主要体现了抽象类，接口与异常处理的使用，以及当程序完成后，对程序细节的优化，抽象类与接口的使用，可以在接口中去仅仅做函数的声明，在其余抽象类中去实现相关函数的方法，且相同函数声明在不同类中能用不同的方法的实现。在企业生产中，可以分配给不同员工，写不同的任务，并且可以同时在测试类中体现。
