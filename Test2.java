package Run;

import Information.Courses;
import Information.Teachers;
import Information.Students;
import java.util.Scanner;
public abstract class Test2 {

	public static void main(String[] args) {
		// People peo0= new People();ÿ�ζ���Ϊһ���ˣ��ٷ�ѧ����ʦ
		Students stu0 = new Students(1,"Lily","Ů","S1001",0);
		//Students stu1 = new Students("S1002","Bob");
		Teachers tea1 = new Teachers(1,"Sua","T1001","���Դ���");
		Courses cou0 = new Courses(1,"���Դ���","��104",0);
		
		for(;;) {
		System.out.println("<ѧ��ѡ��ϵͳ>");
		System.out.println("<ѧ����Ϣ>");
		System.out.println("���   ����   ѧ��   ����");
		System.out.println("  "+stu0.getNo()+"  "+stu0.getStudentName()+" "+stu0.getStudentId()+"   "+stu0.getCourses());
		//System.out.println("Name:"+stu1.getStudentName()+"ID:"+stu1.getStudentId());
		Scanner reader = new Scanner(System.in);
		System.out.println("������ѧ����ţ�");
		int x =reader.nextInt();
		if(x==1) {//1��ѧ��
			System.out.println("ѡ�Σ�������1");
			System.out.println("�˿Σ�������2");
			int y =reader.nextInt();
	        
		if(y==1){//1Ϊѡ��
			System.out.println("<�γ���Ϣ>");
			System.out.println("���   �γ�����   ��ѧ�ص�   ѡ������");
			System.out.println("  "+cou0.getNo()+"      "+cou0.getName()+"     "+cou0.getAdd()+"           "+cou0.getStuNo());
			System.out.println("������ѡ��γ̱�ţ�");
			int z =reader.nextInt();
			if(z==1) {
				cou0.addStuNo(cou0.getStuNo());
				stu0.addCourses(stu0.getCourses());
				System.out.println("ѡ������"+cou0.getStuNo()+"ѡ����"+stu0.getCourses());
				System.out.println("<��ʦ��Ϣ>");
				System.out.println("���   ����   ѧ��   �ڿ�");
				System.out.println("  "+tea1.getNo()+"  "+tea1.getTeacherName()+" "+tea1.getTeacherId()+" "+tea1.getTeaCourse());
						}
			else {
				System.out.println("�޴˿γ���Ϣ��������ѡ��");
			}
		}
		else if(y==2) {//2Ϊ�˿�
			System.out.println("<�γ���Ϣ>");
			System.out.println("���   �γ�����   ��ѧ�ص�   ѡ������");
			System.out.println("  "+cou0.getNo()+"      "+cou0.getName()+"     "+cou0.getAdd()+"           "+cou0.getStuNo());
			System.out.println("������ѡ��γ̱�ţ�");
			int z =reader.nextInt();
			if(z==1) {
				cou0.reduceStuNo(cou0.getStuNo());
				stu0.reduceCourses(stu0.getCourses());
				System.out.println("ѡ������"+cou0.getStuNo()+"ѡ����"+stu0.getCourses());
				System.out.println("<��ʦ��Ϣ>");
				System.out.println("���   ����   ѧ��   �ڿ�");
				System.out.println("  "+tea1.getNo()+"  "+tea1.getTeacherName()+" "+tea1.getTeacherId()+" "+tea1.getTeaCourse());
						}
			else {
				System.out.println("�޴˿γ���Ϣ��������ѡ��");
			}
		}
		else System.out.println("��������������1~2");
	}
		else System.out.println("û�����ѧ����Ϣ");
	}
	}
}
