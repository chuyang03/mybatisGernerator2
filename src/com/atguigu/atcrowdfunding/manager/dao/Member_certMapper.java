package com.atguigu.atcrowdfunding.manager.dao;

import com.atguigu.atcrowdfunding.bean.Member_cert;
import com.atguigu.atcrowdfunding.bean.Member_certExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Member_certMapper {
    int countByExample(Member_certExample example);

    int deleteByExample(Member_certExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Member_cert record);

    int insertSelective(Member_cert record);

    List<Member_cert> selectByExample(Member_certExample example);

    Member_cert selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Member_cert record, @Param("example") Member_certExample example);

    int updateByExample(@Param("record") Member_cert record, @Param("example") Member_certExample example);

    int updateByPrimaryKeySelective(Member_cert record);

    int updateByPrimaryKey(Member_cert record);
}