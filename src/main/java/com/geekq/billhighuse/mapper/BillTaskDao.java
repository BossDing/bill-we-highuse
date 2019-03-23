package com.geekq.billhighuse.mapper;


import com.geekq.billhighuse.entity.BillTask;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BillTaskDao {
    int deleteByPrimaryKey(Integer id);

    int insert(BillTask record);

    int insertSelective(BillTask record);

    BillTask selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BillTask record);

    int updateByPrimaryKey(BillTask record);

    /**
     * 通过String类型的yyyyMMdd查找是否已经生成了task
     * @param billDate
     * @return
     */
    BillTask selectByBillDateStringAndType(@Param("billDate") String billDate, @Param("BillTaskType") String BillTaskType);

    /**
     * 通过类型和状态获取数据
     * @param billTaskType
     * @param status
     * @return
     */
    List<BillTask> selectByTypeAndStatus(@Param("billTaskType") String billTaskType, @Param("status") Integer status);
}