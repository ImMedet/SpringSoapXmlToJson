package kz.medet.test_spring_h2_soap.users;

import jakarta.xml.bind.annotation.*;
import lombok.Getter;
import lombok.Setter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "user"
})
@XmlRootElement(name = "GetUserResponse")
@Getter
@Setter
public class GetUserResponse {

    @XmlElement(name = "UserDetail", required = true)
    protected UserDto user;



}
