package kz.medet.test_spring_h2_soap.users;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserDetail", propOrder = {
        "id",
        "name",
        "surname",
        "email"
})
public class UserDto {
    private Long id;
    private String name;
    private String surname;
    private String email;
}
