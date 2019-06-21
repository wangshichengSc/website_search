package com.wsc.websitesearch.login.dao;

import com.wsc.websitesearch.login.model.LoginInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface LoginDao {

    /*
    sql使用注解或xml两周方式均可
     */
    @Update("UPDATE login SET token = #{data.token}, `timestamp` = #{data.timeStamp}" +
            " WHERE user_name = #{data.loginName}")
    void updateToken(@Param("data") LoginInfo loginInfo);
}
