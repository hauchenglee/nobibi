package com.nobibi.nobibicore.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nobibi.common.bean.ResultBean;
import com.nobibi.common.bean.ResultCode;
import com.nobibi.common.utils.Constants;
import com.nobibi.nobibicore.model.Demo;
import com.nobibi.nobibicore.service.DemoService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping(value = "/api/demo", produces = Constants.CONTENT_TYPE_JSON)
    public String demo(HttpServletRequest request, @RequestBody String receiveJSON) {
        int result = 2;
        return "{\"aaa\": \"" + result + "\"}";
    }

    @GetMapping(value = "/api/demo/error", produces = Constants.CONTENT_TYPE_JSON)
    public ResultBean<String> error(HttpServletRequest request, @RequestBody String receiveJSON) {
        return ResultBean.error(ResultCode.Exception.getCode(), ResultCode.Exception.getMessage());
    }

    @GetMapping(value = "/api/demo/findById", produces = Constants.CONTENT_TYPE_JSON)
    public ResultBean<Demo> findById(HttpServletRequest request, @RequestBody String receiveJSON) throws JsonProcessingException {
        System.out.println(receiveJSON);
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(receiveJSON);
        String id = jsonNode.get("id").asText();
        Optional<Demo> demo = demoService.findById(id);
        return ResultBean.success(demo);
    }

    @SneakyThrows
    @PostMapping(value = "/api/demo/addDemo", produces = Constants.CONTENT_TYPE_JSON)
    public ResultBean<Boolean> addDemo(HttpServletRequest request, @RequestBody String receiveJSON) {
        System.out.println(receiveJSON);
        ObjectMapper mapper = new ObjectMapper();
        Demo demo = mapper.readValue(receiveJSON, Demo.class);
        demoService.save(demo);
        return ResultBean.success(true);
    }
}
