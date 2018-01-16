package action;

import bean.Student;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by zyf on 2018/1/16.
 */
public class OgnlAction extends ActionSupport {

	private Student student;


	public String stu(){
		System.out.println(student);
		return SUCCESS;
	}






	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}
