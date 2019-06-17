package com.wsc.websitesearch.login.dao;

import com.wsc.websitesearch.login.model.LoginInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

//@Mapper
public interface LoginDao {

    void updateToken(@Param("data") LoginInfo loginInfo);
}
