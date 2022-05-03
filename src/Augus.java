class Student {
    String no;//学号
    String name;//名字
    int age;//年龄

    public void goToClass() {
        System.out.println(name + " GO TO CLASS!");//"+"表示字符串连接
    }//学生上课的方法
}

public class Augus {
    //入口函数
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Student stu = new Student();//实例化一个Student对象
        stu.no = "soft001";//给对象赋初值
        stu.name = "AUGUS";
        stu.age = 21;
        stu.goToClass();//通过对象调用上课的方法
    }

}
