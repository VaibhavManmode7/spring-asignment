package Controlers;
import org.springframework.web.bind.annotation.RestMapping;

import controlles.AuthRequest;
import controlles.PostMapping;
import controlles.RequestBody;
import controlles.RequestMapping;
import controlles.ResponseEntity;

import org.springframework.web.bind.annotation.RestController;

@RestControllers
@RequestMappint("/users")
public class Usercontroler {
    @Autowired
    private Userservice userservice;
    //all user
    @GetMapping("/")
    public List<User> getAllUsers(){
        return this.userservice.getAllUsers();
    }
    //return single user
public User get(String username)

package controlles;

public class authorisation {

	// AuthController.java
	@RestController
	@RequestMapping("/api/auth")
	public class AuthController {

	    @PostMapping("/login")
	    public ResponseEntity<String> authenticateUser(@RequestBody AuthRequest authRequest) {
	        // Implementation for authenticating user and generating JWT token
	    }
	}

}
