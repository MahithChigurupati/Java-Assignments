public class UserMainCode{ 
	public static int ValidatePassword(String password){
		if(password.matches(".*[0-9]{1,}.*") && password.matches(".*[@#$]{1,}.*")
		&& password.length()>=6 && password.length()<=20)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}