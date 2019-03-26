package com.geekq.billhighuse.mapper;

import com.geekq.billhighuse.entity.A;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface ADao {

    /**
     * 根据用户ID查询该用户的point
     *
     * @param userId
     * @return
     */
    public A getPointByUserId(Integer userId);

    /**
     * 根据主键更新主账户信息
     * @param point
     * @return 影响的行数
     */
    public int updateByid(A point);

    int deleteByPrimaryKey(Integer pointid);

    int insert(A record);

    int insertSelective(A record);

    A selectByPrimaryKey(Integer pointid);

    int updateByPrimaryKeySelective(A record);

    public List<A> queryAllByOffset(@Param("offset") Integer offset, @Param("limit") Integer limit);

    public Integer getCount();

    public long getMaxPointId();

    public List<A> queryAllByPointId(@Param("start") Long start, @Param("end") Long end);


}