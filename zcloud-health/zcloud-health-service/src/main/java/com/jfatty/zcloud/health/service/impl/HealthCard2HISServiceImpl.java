package com.jfatty.zcloud.health.service.impl;

import com.jfatty.zcloud.health.datasource.TargetDataSource;
import com.jfatty.zcloud.health.entity.HCSHealthCardInfo;
import com.jfatty.zcloud.health.mapper.HealthCard2HISMapper;
import com.jfatty.zcloud.health.service.HealthCard2HISService;
import com.jfatty.zcloud.health.vo.RegHealthCardInfoVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述 电子健康卡信息同步HIS实现
 *
 * @author jfatty on 2020/5/11
 * @email jfatty@163.com
 */
@Slf4j
@Service
public class HealthCard2HISServiceImpl implements HealthCard2HISService {


    @Autowired
    private HealthCard2HISMapper healthCard2HISMapper ;


    @TargetDataSource(name="mssql")
    @Override
    public RegHealthCardInfoVO regHealthCardInfo(HCSHealthCardInfo hcsHealthCardInfo) throws Exception {
        log.error("同步his电子健康信息 exec dbo.pro_reg_health_card_info '{}','{}','{}','{}','{}','{}','{}','{}'",
                hcsHealthCardInfo.getName(),
                hcsHealthCardInfo.getGender(),
                hcsHealthCardInfo.getBirthday(),
                hcsHealthCardInfo.getAddress(),
                hcsHealthCardInfo.getPhone1(),
                hcsHealthCardInfo.getHealthCardId(),
                hcsHealthCardInfo.getQrCodeText(),
                hcsHealthCardInfo.getIdNumber());
        return healthCard2HISMapper.regHealthCardInfo(hcsHealthCardInfo);
    }

}
