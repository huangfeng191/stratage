package com.fengfeng.strategy.mapper;

import com.fengfeng.strategy.entry.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    @Select("select name from user where id=#{id}")
    String getNameById(@Param("id") int id);

    User selectUser(int id);

    void inertUser(User user);

}
