package com.geekq.billhighuse.mapper;


import com.geekq.billhighuse.entity.ImportDataTask;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImportDataTaskDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ImportDataTask record);

    int insertSelective(ImportDataTask record);

    ImportDataTask selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ImportDataTask record);

    int updateByPrimaryKey(ImportDataTask record);

    List<ImportDataTask> queryTaskDatas(@Param("type") String type, @Param("day") String day);

    void updateByTaskIdAndTypeAndDay(@Param("taskId") Integer taskId, @Param("type") String type,
                                     @Param("day") String day, @Param("status") Integer status);

    Integer queryNotDealTask();
}