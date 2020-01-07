package com.appsys.dao;

import com.appsys.pojo.BackendUser;
import org.apache.ibatis.annotations.Param;

public interface BackendMapper {

    /**
     * 登录
     * @param userCode
     * @param userPassword
     * @return
     */
    BackendUser login(@Param("userCode") String userCode,
                      @Param("userPassword") String userPassword);
}
