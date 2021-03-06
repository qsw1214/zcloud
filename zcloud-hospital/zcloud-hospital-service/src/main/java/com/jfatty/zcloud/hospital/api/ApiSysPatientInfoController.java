package com.jfatty.zcloud.hospital.api;

import com.jfatty.zcloud.hospital.entity.SysPatientInfo;
import com.jfatty.zcloud.hospital.interfaces.ISysPatientInfo;
import com.jfatty.zcloud.hospital.req.SysPatientInfoReq;
import com.jfatty.zcloud.hospital.res.SysPatientInfoRes;
import com.jfatty.zcloud.hospital.service.SysPatientInfoService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * 描述
 *
 * @author jfatty on 2019/12/12
 * @email jfatty@163.com
 */
@Api(tags = "系统病人信息API" ,value = "系统病人信息")
@Slf4j
@RestController
@RequestMapping("/api/sysPatientInfo")
public class ApiSysPatientInfoController extends ApiBaseHospitalController<SysPatientInfo,SysPatientInfoReq,SysPatientInfoRes>  implements ISysPatientInfo {

    private SysPatientInfoService sysPatientInfoService ;

    @Autowired
    public void setSysPatientInfoService(SysPatientInfoService sysPatientInfoService) {
        super.setBaseService(sysPatientInfoService);
        this.sysPatientInfoService = sysPatientInfoService;
    }

    @RequestMapping(value = "/getMap" , method = RequestMethod.GET )
    public Object getMap(@RequestParam(value = "pageIndex" , defaultValue = "1" ) Integer pageIndex ,
                         @RequestParam(value = "pageSize" , defaultValue = "100") Integer pageSize){
        List<Map<String, Object>> list = sysPatientInfoService.getMap(pageIndex,pageSize);
        for (Map<String, Object> map:list ) {
            log.error("====================================================================" );
            for (Map.Entry<String,Object>  entry:map.entrySet() ) {  //遍历map的key集合 获取对应key的value
                log.error("键 [{}]  值 [{}]" ,entry.getKey(),entry.getValue() );
            }
            log.error("====================================================================" );
        }
        return list;
    }

}
