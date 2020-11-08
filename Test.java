package shiyan4;

public class Test {
    public static void main(String[] args) {
        Graduate graduate = new Graduate();
        graduate.setName("wsjt");//设置姓名
        graduate.setmoney(5000, 1500);//设置每学期的费用,月工资
        System.out.println("wsjt学费为："+graduate.getxuefei());
        System.out.println("wsjt年收入为："+graduate.getsalary()); 
        System.out.println("wsjt纳税额："+((graduate.getsalary()*0.25)-1005));
        graduate.setmoney(5000, 2000);//设置每学期的费用,月工资
        System.out.println("jt学费为："+graduate.getxuefei());
        System.out.println("jt年收入为："+graduate.getsalary()); 
        System.out.println("jt纳税额："+((graduate.getsalary()*0.25)-1005));	
        }
        
        
}