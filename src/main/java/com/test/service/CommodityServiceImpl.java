package com.test.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.test.mapper.CommodityMapper;
import com.test.pojo.Commodity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityServiceImpl implements CommodityService{
    @Autowired
    private CommodityMapper commodityMapper;

    @Override
    public List<Commodity> findAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Commodity> commodities = commodityMapper.findAll();
        PageInfo<Commodity> pageInfo = new PageInfo<>(commodities);
        return pageInfo.getList();
    }

    @Override
    public List<Commodity> findByCommodity(Commodity commodity) {
        return commodityMapper.findByCommodity(commodity);
    }

    @Override
    public int update(Commodity commodity) {
        commodity.setStatus("1".equals(commodity.getStatus()) ? "0" : "1");
        return commodityMapper.update(commodity);
    }

    @Override
    public int updateCommodity(Commodity commodity) {
        this.update(commodity);
        return commodityMapper.updateCommodity(commodity);
    }

    @Override
    public int insert(Commodity commodity) {
        return commodityMapper.insert(commodity);
    }
}
