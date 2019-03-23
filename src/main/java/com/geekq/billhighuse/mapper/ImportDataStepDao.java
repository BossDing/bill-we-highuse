package com.geekq.billhighuse.mapper;


import com.geekq.billhighuse.entity.ImportDataStep;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImportDataStepDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ImportDataStep record);

    Integer insertBatch(List<ImportDataStep> steps);

    int insertSelective(ImportDataStep record);

    ImportDataStep selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ImportDataStep record);

    int updateByPrimaryKey(ImportDataStep record);

    List<ImportDataStep> queryAllStep(@Param("taskId") Integer taskId, @Param("day") String day, @Param("type") String type);


    ImportDataStep queryStepByTypeAndDay(@Param("type") String type, @Param("day") String day);


    void updateByRangeStartAndTypeAndDay(@Param("rangeStart") Long rangeStart, @Param("type") String type,
                                         @Param("day") String day, @Param("status") Integer status);

    public List<ImportDataStep> queryNotDealStep(Integer status);

    public Integer queryCountNotDealStep(@Param("day") String day, @Param("status") Integer status);

}