package kz.medet.test_spring_h2_soap.users;

import jakarta.xml.bind.annotation.*;
import kz.medet.test_spring_h2_soap.model.User;
import lombok.Getter;
import lombok.Setter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "id"
})
@XmlRootElement(name = "GetUserRequest")
@Getter
@Setter
public class GetUserRequest {

    protected Integer id;

}
