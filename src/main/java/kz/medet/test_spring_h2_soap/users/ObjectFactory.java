package kz.medet.test_spring_h2_soap.users;

import jakarta.xml.bind.annotation.XmlRegistry;
import kz.medet.test_spring_h2_soap.model.User;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {
    }

    public GetUserRequest createGetUserRequest() {
        return new GetUserRequest();
    }

    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    public User createUser() {
        return new User();
    }
}
