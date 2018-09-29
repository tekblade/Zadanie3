package Zadanie3.Zadanie3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;
@Service
public class UserPositionRepository {
	List<UserPosition> listOfUsers=new ArrayList<UserPosition>();
	Random rand;
	public void addUserData(UserPosition user) {
		listOfUsers.add(user);
	}
	public UserPosition getRandomUser() {
		int i=0;
		if(listOfUsers.size()<1)
			throw new IndexOutOfBoundsException("No data in the system");
		rand=new Random();
		i=rand.nextInt(listOfUsers.size());
		UserPosition user=listOfUsers.get(i);
		return user;
	}
}
