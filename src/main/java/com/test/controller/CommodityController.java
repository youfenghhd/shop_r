package com.test.controller;


import com.test.pojo.Commodity;
import com.test.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/commodity")
public class CommodityController {
    @Autowired
    private CommodityService commodityService;

    @GetMapping(value = "")
    public List<Commodity> findAll(Integer pageNum, Integer pageSize) {
        return commodityService.findAll(pageNum, pageSize);
    }

    @PostMapping(value = "/findByCommodity")
    public List<Commodity> findByCommodity(Commodity commodity) {
        return commodityService.findByCommodity(commodity);
    }

    @PutMapping(value = "/update")
    public boolean update(Commodity commodity) {
        return commodityService.update(commodity) > 0;
    }

    @PutMapping(value = "/updateCommodity")
    public boolean updateCommodity(Commodity commodity) {
        return commodityService.updateCommodity(commodity) > 0;
    }

    @PostMapping(value = "/insert")
    public boolean insert(Commodity commodity) {
        return commodityService.insert(commodity) > 0;
    }

}
