package PST;

import PST.Courses;
import PST.Teachers;
import PST.Students;
import java.util.Scanner;
public abstract class Test2 {

	public static void main(String[] args) {
		// People peo0= new People();每次定义为一个人，再分学生老师
		Students stu0 = new Students(1,"Lily","女","S1001",0);
		//Students stu1 = new Students("S1002","Bob");
		Teachers tea1 = new Teachers(1,"Sua","T1001","线性代数");
		Courses cou0 = new Courses(1,"线性代数","教104",0);
		
		for(;;) {
		System.out.println("<学生选课系统>");
		System.out.println("<学生信息>");
		System.out.println("编号   姓名   学号   课数");
		System.out.println("  "+stu0.getNo()+"  "+stu0.getStudentName()+" "+stu0.getStudentId()+"   "+stu0.getCourses());
		//System.out.println("Name:"+stu1.getStudentName()+"ID:"+stu1.getStudentId());
		Scanner reader = new Scanner(System.in);
		System.out.println("请输入学生编号：");
		int x =reader.nextInt();
		if(x==1) {//1号学生
			System.out.println("选课：请输入1");
			System.out.println("退课：请输入2");
			int y =reader.nextInt();
	        
		if(y==1){//1为选课
			System.out.println("<课程信息>");
			System.out.println("编号   课程名称   教学地点   选课人数");
			System.out.println("  "+cou0.getNo()+"      "+cou0.getName()+"     "+cou0.getAdd()+"           "+cou0.getStuNo());
			System.out.println("请输入选择课程编号：");
			int z =reader.nextInt();
			if(z==1) {
				cou0.addStuNo(cou0.getStuNo());
				stu0.addCourses(stu0.getCourses());
				System.out.println("选课人数"+cou0.getStuNo()+"选课数"+stu0.getCourses());
				System.out.println("<教师信息>");
				System.out.println("编号   姓名   学号   授课");
				System.out.println("  "+tea1.getNo()+"  "+tea1.getTeacherName()+" "+tea1.getTeacherId()+" "+tea1.getTeaCourse());
						}
			else {
				System.out.println("无此课程信息，请重新选择！");
			}
		}
		else if(y==2) {//2为退课
			System.out.println("<课程信息>");
			System.out.println("编号   课程名称   教学地点   选课人数");
			System.out.println("  "+cou0.getNo()+"      "+cou0.getName()+"     "+cou0.getAdd()+"           "+cou0.getStuNo());
			System.out.println("请输入选择课程编号：");
			int z =reader.nextInt();
			if(z==1) {
				cou0.reduceStuNo(cou0.getStuNo());
				stu0.reduceCourses(stu0.getCourses());
				System.out.println("选课人数"+cou0.getStuNo()+"选课数"+stu0.getCourses());
				System.out.println("<教师信息>");
				System.out.println("编号   姓名   学号   授课");
				System.out.println("  "+tea1.getNo()+"  "+tea1.getTeacherName()+" "+tea1.getTeacherId()+" "+tea1.getTeaCourse());
						}
			else {
				System.out.println("无此课程信息，请重新选择！");
			}
		}
		else System.out.println("输入有误，请输入1~2");
	}
		else System.out.println("没有相关学生信息");
	}
	}
}

实验目的 初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法
掌握面向对象的类设计方法（属性、方法）
掌握类的继承用法，通过构造方法实例化对象
学会使用super()，用于实例化子类
掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中

实验过程 用类描述计算机中CPU的速度和硬盘的容量，要求Java应用程序由4个类，名字分别是PC、CPU、HardDisk、和Test，其中Test是主类。 其中，CPU类要求getSpeed()返回speed的值，要求setSpeed(int m)方法将参数m的值赋值给speed；HardDisk类要求getAmount()返回amount的值， 要求setAmount（int m）方法将参数m的值赋值给amount；PC类要求setCPU(CPU c)将参数c的值赋值给CPU，要求setHardDisk(HardDisk h)方法将参数h的值赋值给HD， 要求show()方法能显示CPU的速度和硬盘的容量。 主类Test的要求 （1）main方法中创建一个CPU对象cpu，cpu将自己的speed设置为2200. （2）main方法中创建一个HardDisk对象disk，disk将自己的amount设置为200。 （3）main方法中创建一个PC对象pc。 （4）pc调用setCPU(CPU c)方法，调用时实参是cpu。 （5）pc调用setHardDisk(HardDisk h）方法，调用时实参是disk。 （6）pc调用show方法。 (新增内容同理)
实验要求
1.编写上述实体类以及测试主类（注意类之间继承关系的适用）
2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师）；模拟学生退课操作，再打印课程信息。
3.编写实验报告。
实验感受 通过本次实验我学习了类的继承，方法的调用，属性定义，对构造方法的学习与认识以及使用。 对于java继承和构造方法等方便有很多收获和略微更深的理解，增加了对Java的学习欲望和热情。  


