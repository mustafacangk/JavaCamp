package work3;

public class StudentManager extends UserManager{
	public void addStudent(User user)
	{
		System.out.println(user.getFirstName()+user.getLastName()+" isimli ��renci sisteme kay�t edildi.");
	}
}
