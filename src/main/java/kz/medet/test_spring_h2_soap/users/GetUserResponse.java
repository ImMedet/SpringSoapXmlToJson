package kz.medet.test_spring_h2_soap.users;

import jakarta.xml.bind.annotation.*;
import lombok.Getter;
import lombok.Setter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "user"
})
@XmlRootElement(name = "getUserResponse")
@Getter
@Setter
public class GetUserResponse {

    @XmlElement(name = "user", required = true)
    protected UserDto user;



}
