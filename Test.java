package shiyan4;

public class Test {
    public static void main(String[] args) {
        Graduate graduate = new Graduate();
        graduate.setName("wsjt");//��������
        graduate.setmoney(5000, 1500);//����ÿѧ�ڵķ���,�¹���
        System.out.println("wsjtѧ��Ϊ��"+graduate.getxuefei());
        System.out.println("wsjt������Ϊ��"+graduate.getsalary()); 
        System.out.println("wsjt��˰�"+((graduate.getsalary()*0.25)-1005));
        graduate.setmoney(5000, 2000);//����ÿѧ�ڵķ���,�¹���
        System.out.println("jtѧ��Ϊ��"+graduate.getxuefei());
        System.out.println("jt������Ϊ��"+graduate.getsalary()); 
        System.out.println("jt��˰�"+((graduate.getsalary()*0.25)-1005));	
        }
        
        
}