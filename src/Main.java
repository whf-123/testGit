
import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;
public class Main {
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	String name1=scan.next();
    Student stuA=new Student(name1);
    stuA.addCourse();
    
    String name2=scan.next();
    Student stuB=new Student(name2);
    stuB.addCourse();
    
    String name3=scan.next();
    Student stuC=new Student(name3);
    stuC.addCourse();
    
    System.out.println(stuA);
    System.out.println(stuB);
    System.out.println(stuC);
	}  
}
class Student{
	String name;
	ArrayList arr=new ArrayList();
	public Student(String name){
		this.name=name;
	}
    public void addCourse(){
    	while(true){
    		Scanner scan=new Scanner(System.in);
    		String name=scan.nextLine();
    		if(name.equals("#")){
    			break;
    		}
    		int score=Integer.parseInt(scan.nextLine());
    		arr.add(new Course(name,score));
    	}
    }
    public double getAverageScore(){
    	int averageScore=0;
    	if(arr.size()>0){
    	for(Object obj:arr){
    		Course course=(Course)obj;
    		averageScore+=course.getScore();
    	}
    	double grade= 1.0*averageScore/arr.size();
    	return grade;}else{
    		return (double)averageScore;
    	}
    }
    public String toString(){
    	DecimalFormat df=new DecimalFormat("0.0");
    	String out=name+"-"+arr.size()+"-"+df.format(getAverageScore());
    	return out;
    }
}
class Course{
	private String courseName;
	private int score;
	public Course(String courseName, int score) {
		this.courseName = courseName;
		this.score = score;
	}
	public int getScore(){
		return score;
	}
	
	
}
