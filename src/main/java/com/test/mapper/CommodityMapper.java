package com.test.mapper;

import com.test.pojo.Commodity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CommodityMapper {
    public List<Commodity> findByCommodity(Commodity commodity);
    public List<Commodity> findAll();
    public int update(Commodity commodity);
    public int updateCommodity(Commodity commodity);
    public int insert(Commodity commodity);

}
