package kz.medet.test_spring_h2_soap.service.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import kz.medet.test_spring_h2_soap.service.XmlToJsonConverterService;
import kz.medet.test_spring_h2_soap.users.GetUserResponse;
import kz.medet.test_spring_h2_soap.users.UserDto;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class XmlToJsonConverterServiceImpl implements XmlToJsonConverterService {

        private final ObjectMapper objectMapper;

        public XmlToJsonConverterServiceImpl() {
            JacksonXmlModule xmlModule = new JacksonXmlModule();
            objectMapper = new XmlMapper(xmlModule);
        }

        @Override
        public UserDto convertXmlToJson(String xml) throws IOException {
            JsonNode jsonNode = objectMapper.readTree(xml.getBytes());
            var userResponse = objectMapper.treeToValue(jsonNode, GetUserResponse.class);
            return userResponse.getUser();
        }
    }

