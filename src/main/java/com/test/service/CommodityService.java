package com.test.service;


import com.test.pojo.Commodity;

import java.util.List;

public interface CommodityService {
    public List<Commodity> findAll(Integer pageNum, Integer pageSize);
    public List<Commodity> findByCommodity(Commodity commodity);
    public int update(Commodity commodity);
    public int updateCommodity(Commodity commodity);
    public int insert(Commodity commodity);
}
