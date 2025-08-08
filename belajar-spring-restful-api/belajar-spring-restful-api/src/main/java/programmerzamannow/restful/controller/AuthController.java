package programmerzamannow.restful.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import programmerzamannow.restful.entity.User;
import programmerzamannow.restful.model.LoginUserRequest;
import programmerzamannow.restful.model.TokenRespose;
import programmerzamannow.restful.model.WebResponse;
import programmerzamannow.restful.service.AuthService;

@RestController
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping(
            path = "/api/auth/login",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public WebResponse<TokenRespose> login(@RequestBody LoginUserRequest request) {

        TokenRespose tokenRespose = authService.login(request);

        return WebResponse.<TokenRespose>builder().data(tokenRespose).build();
    }

    @DeleteMapping(
            path = "api/auth/logout",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public WebResponse<String> logOut(User user) {
        authService.logOut(user);
        return WebResponse.<String>builder().data("OK").build();
    }
}
