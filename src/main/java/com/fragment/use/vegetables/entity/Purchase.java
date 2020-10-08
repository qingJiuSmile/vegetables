package com.fragment.use.vegetables.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 蔬菜类实体
 *
 * @author tjy
 * @date 2020/10/5
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Purchase {

    private Integer id;

    @ApiModelProperty(value = "")
    private String name;

    private Integer number;

    private BigDecimal price;


}