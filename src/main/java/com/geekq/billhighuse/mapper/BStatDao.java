package com.geekq.billhighuse.mapper;

import com.geekq.billhighuse.entity.BStat;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BStatDao {
    int deleteByPrimaryKey(Integer id);

    int insert(BStat record);

    int insertSelective(BStat record);

    BStat selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BStat record);

    int updateByPrimaryKey(BStat record);

    BStat getByUserIdAndSubPointType(@Param("userId") Integer userId, @Param("subPointType") String subPointType);

    List<BStat> getUserStatList(@Param("beginId") Integer beginId, @Param("limit") Integer limit, @Param("subPointType") String subPointType);

    public List<BStat> queryAllByOffset(@Param("offset") Integer offset, @Param("limit") Integer limit);

    public Integer getCount();

    public long queryMaxId();

    List<BStat> queryAllByIdRange(@Param("rangeStart") long rangeStart, @Param("rangeEnd") long rangeEnd);

}