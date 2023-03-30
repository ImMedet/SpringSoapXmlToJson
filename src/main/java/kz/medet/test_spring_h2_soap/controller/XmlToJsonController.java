package kz.medet.test_spring_h2_soap.controller;

import kz.medet.test_spring_h2_soap.service.XmlToJsonConverterService;
import kz.medet.test_spring_h2_soap.users.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class XmlToJsonController {

    @Autowired
    private XmlToJsonConverterService xmlToJsonConverterService;


    @PostMapping("/xml-to-json")
    public UserDto convertXmlToJson(@RequestParam("xml") String xml) throws IOException {
        return xmlToJsonConverterService.convertXmlToJson(xml);
    }
}