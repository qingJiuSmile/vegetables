package com.fragment.use.vegetables.service;

import com.fragment.use.vegetables.base.BaseClass;
import com.fragment.use.vegetables.entity.Purchase;
import com.fragment.use.vegetables.mapper.master.PurchaseMapper;
import com.fragment.use.vegetables.util.request.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VegetableService extends BaseClass {

    @Autowired
    private PurchaseMapper purchaseMapper;

    public JsonResult<List<Purchase>> getAll(){
       return succMsgData(purchaseMapper.getAll());
    }
}
