import java.util.ArrayList;
import java.util.List;


public class BackEnd {

	public List<List<String>> myStorage;
	
	//returns a list of all plaintext messages submitted by a user
	public List<String> getMessage(String username)
	{
		for(List<String> s : myStorage)
		{
			if(s.get(0).equalsIgnoreCase(username))
				return s;
		}
		
		return null;
	}
	
	//adds message to the encoded file, associated with username
	public void addMessage(String username, String message)
	{
		for(List<String> s: myStorage)
		{
			if(s.get(0).equalsIgnoreCase(username))
				s.add(message);
			else
			{
			List<String> newString = new ArrayList<String>();
			newString.add(username);
			newString.add(message);
			myStorage.add(newString);
			}
		}
		
		
	}
	
	//returns a list of all users who have submitted a message
	public List<String> getUsers()
	{
		List<String> users = new ArrayList<String>();
		for(List<String> s : myStorage)
		{
			users.add(s.get(0));
		}
		
		return users;
	}
}
