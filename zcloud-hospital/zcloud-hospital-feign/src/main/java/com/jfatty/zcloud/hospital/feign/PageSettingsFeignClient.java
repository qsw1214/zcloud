package com.jfatty.zcloud.hospital.feign;

import com.jfatty.zcloud.base.interfaces.BInterface;
import com.jfatty.zcloud.base.utils.RELResultUtils;
import com.jfatty.zcloud.base.utils.ResultUtils;
import com.jfatty.zcloud.hospital.entity.HOSPageSettings;
import com.jfatty.zcloud.hospital.req.HOSPageSettingsReq;
import com.jfatty.zcloud.hospital.res.HOSPageSettingsRes;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * 描述
 *
 * @author jfatty on 2020/4/17
 * @email jfatty@163.com
 */
@FeignClient(value = "zcloud-hospital-service" , path = "/api/pageSettings" )
public interface PageSettingsFeignClient extends BInterface<HOSPageSettings,HOSPageSettingsReq,HOSPageSettingsRes> {

    @RequestMapping(value={"/table/list"},method = RequestMethod.POST)
    RELResultUtils<HOSPageSettingsRes> table(@RequestBody Map<String,Object> params) ;


    @RequestMapping(value={"/table/list"},method = RequestMethod.GET )
    RELResultUtils<HOSPageSettingsRes> table(@RequestParam(value = "v" , defaultValue = "20191101") String v ,
                                        @RequestParam(value = "pageIndex" , defaultValue = "1" ) Integer pageIndex ,
                                        @RequestParam(value = "pageSize" , defaultValue = "10") Integer pageSize) ;

    @RequestMapping(value={"/list"},method=RequestMethod.GET)
    ResultUtils list() ;

    @RequestMapping(value={"/list"},method=RequestMethod.POST)
    List<HOSPageSettingsRes> list(@RequestParam(value = "v" , defaultValue = "20191101") Long v);

    @RequestMapping(value={"/save"},method=RequestMethod.POST)
    ResultUtils save(@RequestBody HOSPageSettingsReq entity) ;

    @RequestMapping(value={"/edit"},method=RequestMethod.GET)
    ResultUtils view(@RequestParam(value = "id" , defaultValue = "AQAQAQ") String id ) ;

    @RequestMapping(value={"/edit"},method=RequestMethod.POST)
    ResultUtils edit(@RequestBody HOSPageSettingsReq entity) ;

    @RequestMapping(value={"/delete"},method=RequestMethod.POST)
    ResultUtils delete(@RequestBody Map<String,Object> params) ;
}
