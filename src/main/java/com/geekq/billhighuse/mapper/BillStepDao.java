package com.geekq.billhighuse.mapper;


import com.geekq.billhighuse.entity.BillStep;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BillStepDao {
    int deleteByPrimaryKey(Integer id);

    int insert(BillStep record);

    int insertSelective(BillStep record);

    BillStep selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BillStep record);

    int updateByPrimaryKey(BillStep record);

    /**
     * 通过taskId查询所有的step
     * @param taskId
     * @return
     */
    List<BillStep> selectByTaskId(@Param("taskId") Integer taskId);

    /**
     * 通过taskId和状态查询
     * @param taskId
     * @param status
     * @return
     */
    List<BillStep> selectByTaskIdAndStatus(@Param("taskId") Integer taskId,
                                           @Param("status") Integer status);
}