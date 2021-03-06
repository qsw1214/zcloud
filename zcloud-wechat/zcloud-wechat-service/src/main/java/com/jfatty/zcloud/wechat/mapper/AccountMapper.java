package com.jfatty.zcloud.wechat.mapper;


import com.jfatty.zcloud.base.mapper.IBaseMapper;
import com.jfatty.zcloud.wechat.entity.Account;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 微信账号表 Mapper 接口
 * </p>
 *
 * @author jfatty
 * @since 2019-04-04
 */
public interface AccountMapper extends IBaseMapper<Account> {

    /**
     * 根据微信账号信息进行查询
     * @param account
     * @return
     */
    Account getByAccount(String account);

    /**
     * 获取系统当前出去激活状态微信账号
     * @return
     */
    Account getActiveAccount();

    /**
     * 根据微信账号信息进行查询
     * @param appId
     * @return
     */
    Account getByAppId(@Param("appId") String appId);

    void setUnUsingState(@Param("appId") String appId);

    void setUsingState(@Param("appId") String appId);

    Account getByUsingState();
}
