package Services;
import com.firstcurd.model.usre;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class Userservice {
    List<User>  list = new ArrayList<>();

    public Userservice(){
        list.add(new User(username:"abc",password:"1234"));
        list.add(new User(username:"xyz",password:"5678"));
        list.add(new User(username:"efg",password:"8765"));
    }
    //get all users
    public list<User> getAllUser(){
        return this.list;
    }
    //get single user
    public User getUser(String username){
        return this.list.stream().filter((User)->User.getuserrname().equals(username)).findAny().orElse(other:null);
    }
    //add new user
    public User addUser(User user){
        this.list.add(user);
        return user;
    }

}
