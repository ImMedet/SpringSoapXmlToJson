package kz.medet.test_spring_h2_soap.controller;

import kz.medet.test_spring_h2_soap.service.UserService;
import kz.medet.test_spring_h2_soap.users.GetUserRequest;
import kz.medet.test_spring_h2_soap.users.GetUserResponse;
import kz.medet.test_spring_h2_soap.users.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserEndpoint {

    @Autowired
    private UserService userService;

    @PayloadRoot(namespace = "http://localhost:8089/user", localPart = "GetUserRequest")
    @ResponsePayload
    public GetUserResponse processCourseDetailsRequest(@RequestPayload GetUserRequest request) {
        var response = new GetUserResponse();
        var user = userService.getUserById(request.getId());

        //todo add mapstruct converter
        UserDto userDto = new UserDto(user.getId(), user.getName(), user.getSurname(), user.getEmail());
        response.setUser(userDto);

        return response;
    }

}
