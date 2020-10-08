package com.fragment.use.vegetables.web;

import com.fragment.use.vegetables.entity.Purchase;
import com.fragment.use.vegetables.service.VegetableService;
import com.fragment.use.vegetables.util.request.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(description = "蔬菜")
@RestController
@RequestMapping("/vegetable")
public class VegetableController {

    @Autowired
    private VegetableService vegetableService;

    @PostMapping("/getAll")
    @ApiOperation(value = "测试")
    public JsonResult<List<Purchase>> getAll() {
        return vegetableService.getAll();
    }
}
