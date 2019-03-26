package com.geekq.billhighuse.mapper;

import com.geekq.billhighuse.entity.ImportALog;
import com.geekq.billhighuse.entity.ImportALogKey;
import com.geekq.billhighuse.entity.ALog;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ImportAbillLogDao {
    int deleteByPrimaryKey(ImportALogKey key);

    int insert(ImportALog record);

    int insertSelective(ImportALog record);

    ImportALog selectByPrimaryKey(ImportALogKey key);

    int updateByPrimaryKeySelective(ImportALog record);

    int updateByPrimaryKey(ImportALog record);

    public Integer insertBatch(@Param("list") List<ALog> list, @Param("table") String tableName, @Param("day") String day, @Param("createTime") Date date);

    public List<ImportALog> queryDaily(@Param("table") String tableName, @Param("beginDate") Date beginDate, @Param("endDate") Date endDate, @Param("userId") Integer userId, @Param("startIndex") Integer startIndex, @Param("offset") Integer offset);

    public List<ImportALog> queryMonthly(@Param("table") String tableName, @Param("beginDate") Date beginDate, @Param("endDate") Date endDate, @Param("userId") Integer userId, @Param("startIndex") Integer startIndex, @Param("offset") Integer offset);

    public Integer queryDailyTotal(@Param("table") String tableName, @Param("beginDate") Date beginDate, @Param("endDate") Date endDate, @Param("userId") Integer userId);

    public Integer queryMonthlyTotal(@Param("table") String tableName, @Param("beginDate") Date beginDate, @Param("endDate") Date endDate, @Param("userId") Integer userId);

    public void deleteByDay(@Param("table") String tableName, @Param("day") String day);

    /**
     * 通过范围查询
     * @param monthString
     * @param day
     * @param rangeStart
     * @param rangeEnd
     * @return
     */
    List<ImportALog> selectByDayAndUserIdRange(@Param("monthString") String monthString,
                                               @Param("day") String day,
                                               @Param("rangeStart") Long rangeStart,
                                               @Param("rangeEnd") Long rangeEnd);

    /**
     * 查找上个月表除了第一天的所有数据，按照批次查询
     * @param monthString
     * @param startDay
     * @param rangeStart
     * @param rangeEnd
     * @return
     */
    List<ImportALog> selectByMonthAndUserIdRange(@Param("monthString") String monthString,
                                                 @Param("startDay") String startDay,
                                                 @Param("rangeStart") Long rangeStart,
                                                 @Param("rangeEnd") Long rangeEnd);
}