package kz.medet.test_spring_h2_soap.service;

import kz.medet.test_spring_h2_soap.users.UserDto;

import java.io.IOException;

public interface XmlToJsonConverterService {

    UserDto convertXmlToJson(String xml) throws IOException;
}
