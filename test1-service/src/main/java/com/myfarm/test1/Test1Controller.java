package com.myfarm.test1;

import com.farm.common.FarmResponse;
import io.swagger.annotations.*;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;

@Api(value = "这是test1", tags = "test1")
@Validated
@RestController
@RequestMapping("/test1")
public class Test1Controller {

    @ApiOperation(value = "Test1Controller的method1")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code  = 400, message = "参数校验异常", response = FarmResponse.class)
    })
    @GetMapping(value = "/method1")
    public FarmResponse<String> method1(@RequestParam(value = "param", required = true)
                                        @NotBlank(message = "param不能为空值")
                                        @ApiParam(value = "参数", required = true, example = "test")
                                                String param){
        return FarmResponse.success();
    }
}
