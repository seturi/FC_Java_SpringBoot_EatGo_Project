package kr.co.fastcampus.eatgo.eatgo.interfaces;

import jdk.nashorn.internal.ir.FunctionNode;
import kr.co.fastcampus.eatgo.eatgo.application.UserService;
import kr.co.fastcampus.eatgo.eatgo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotEmpty;
import java.net.URI;
import java.net.URISyntaxException;

@CrossOrigin
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public ResponseEntity<?> create(
            @RequestBody User resource
    ) throws URISyntaxException {
        String email = resource.getEmail();
        String name = resource.getName();
        String password = resource.getPassword();

        User user = userService.registerUser(email, name, password);

        String url = "/users/" + user.getId();
        return ResponseEntity.created(new URI(url)).body("{}");
    }
}
