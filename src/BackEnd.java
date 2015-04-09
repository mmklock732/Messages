import java.util.ArrayList;
import java.util.List;


public class BackEnd {

	private List<List<String>> myStorage;
	
	public BackEnd()
	{
		myStorage = new ArrayList<List<String>>();
	}
	//returns a list of all plaintext messages submitted by a user
	public List<String> getMessage(String username)
	{
		for(int i = 0; i < myStorage.size(); i ++)
		{
			if(myStorage.get(i).get(0).equalsIgnoreCase(username))
				return myStorage.get(i);
		}
		
		return null;
	}
	
	//adds message to the encoded file, associated with username
	public void addMessage(String username, String message)
	{
		for(int i = 0; i < myStorage.size(); i ++)
		{
			if(myStorage.get(i).get(0).equalsIgnoreCase(username))
				myStorage.get(i).add(message);
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
