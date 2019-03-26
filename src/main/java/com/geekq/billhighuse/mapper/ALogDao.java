package com.geekq.billhighuse.mapper;

import com.geekq.billhighuse.entity.ALog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ALogDao {

    /**
     * 批量插入PointLog
     * @return
     */
    public int insertBatch(List<ALog> list);

    int deleteByPrimaryKey(Integer pointlogid);

    int insert(ALog record);

    int insertSelective(ALog record);

    ALog selectByPrimaryKey(Integer pointlogid);

    int updateByPrimaryKeySelective(ALog record);

    int updateByPrimaryKey(ALog record);

    public List<ALog> queryAllByOffset(@Param("id") Long minId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    public int getCount();

    public int getOffsetCount(@Param("id") Long id);

    public ALog getLateRecord();

    public Long getMaxPointLogId();

    public List<ALog> queryPointLogByRange(@Param("rangeStart") long rangeStart, @Param("rangeEnd") long rangeEnd);
}