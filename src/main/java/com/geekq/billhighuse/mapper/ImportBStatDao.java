package com.geekq.billhighuse.mapper;

import com.geekq.billhighuse.entity.BStat;
import com.geekq.billhighuse.entity.ImportBStat;
import com.geekq.billhighuse.entity.ImportBStatKey;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImportBStatDao {
    int deleteByPrimaryKey(ImportBStatKey key);

    int insert(ImportBStat record);

    int insertSelective(ImportBStat record);

    ImportBStat selectByPrimaryKey(ImportBStatKey key);

    int updateByPrimaryKeySelective(ImportBStat record);

    int updateByPrimaryKey(ImportBStat record);

    public Integer insertBatch(@Param("list") List<BStat> list, @Param("table") String tableName, @Param("day") String day);

    public List<ImportBStat> queryDaily(@Param("table") String tableName, @Param("day") String day, @Param("userId") Integer userId, @Param("subPointType") String subPointType, @Param("startIndex") Integer startIndex, @Param("offset") Integer offset);

    public List<ImportBStat> queryMonthly(@Param("table") String tableName, @Param("day") String day, @Param("userId") Integer userId, @Param("subPointType") String subPointType, @Param("startIndex") Integer startIndex, @Param("offset") Integer offset);

    public Integer queryDailyTotal(@Param("table") String tableName, @Param("day") String day, @Param("userId") Integer userId, @Param("subPointType") String subPointType);

    public Integer queryMonthlyTotal(@Param("table") String tableName, @Param("day") String day, @Param("userId") Integer userId, @Param("subPointType") String subPointType);

    public void deleteByDay(@Param("table") String tableName, @Param("day") String day);

    /**
     * 根据范围查
     * @param monthString
     * @param day
     * @param rangeStart
     * @param rangeEnd
     * @return
     */
    List<ImportBStat> selectByDayAndUserIdRange(@Param("monthString") String monthString,
                                                @Param("day") String day,
                                                @Param("rangeStart") Long rangeStart,
                                                @Param("rangeEnd") Long rangeEnd);

}