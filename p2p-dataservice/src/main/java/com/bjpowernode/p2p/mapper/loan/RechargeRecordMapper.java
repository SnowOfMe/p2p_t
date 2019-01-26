package com.bjpowernode.p2p.mapper.loan;

import com.bjpowernode.p2p.model.loan.RechargeRecord;

import java.util.List;
import java.util.Map;

public interface RechargeRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_recharge_record
     *
     * @mbggenerated Tue Jul 10 11:25:39 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_recharge_record
     *
     * @mbggenerated Tue Jul 10 11:25:39 CST 2018
     */
    int insert(RechargeRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_recharge_record
     *
     * @mbggenerated Tue Jul 10 11:25:39 CST 2018
     */
    int insertSelective(RechargeRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_recharge_record
     *
     * @mbggenerated Tue Jul 10 11:25:39 CST 2018
     */
    RechargeRecord selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_recharge_record
     *
     * @mbggenerated Tue Jul 10 11:25:39 CST 2018
     */
    int updateByPrimaryKeySelective(RechargeRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_recharge_record
     *
     * @mbggenerated Tue Jul 10 11:25:39 CST 2018
     */
    int updateByPrimaryKey(RechargeRecord record);

    /**
     * 根据用户标识分页查询充值记录
     * @param paramMap
     * @return
     */
    List<RechargeRecord> selectRechargeRecordByPage(Map<String, Object> paramMap);

    /**
     * 查询用户的所有充值记录条数
     * @param paramMap
     * @return
     */
    Long selectTotal(Map<String, Object> paramMap);

    /**
     * 根据充值订单号修改充值记录信息
     * @param rechargeRecord
     * @return
     */
    int updateRechargeRecordByRechargeNo(RechargeRecord rechargeRecord);
}