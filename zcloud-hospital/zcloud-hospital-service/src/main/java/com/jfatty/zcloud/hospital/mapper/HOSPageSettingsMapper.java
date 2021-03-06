package com.jfatty.zcloud.hospital.mapper;

import com.jfatty.zcloud.base.mapper.IBaseMapper;
import com.jfatty.zcloud.hospital.entity.HOSPageSettings;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 智慧医疗页面配置信息表 Mapper 接口
 * </p>
 *
 * @author jfatty
 * @since 2019-12-30
 */
public interface HOSPageSettingsMapper extends IBaseMapper<HOSPageSettings> {

    HOSPageSettings getByAppId(@Param("appId") String appId, @Param("version") String version);
}
