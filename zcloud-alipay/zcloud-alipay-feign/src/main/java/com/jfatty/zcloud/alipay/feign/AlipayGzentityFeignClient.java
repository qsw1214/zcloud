package com.jfatty.zcloud.alipay.feign;

import com.jfatty.zcloud.alipay.entity.AlipayGzentity;
import com.jfatty.zcloud.alipay.req.AlipayGzentityReq;
import com.jfatty.zcloud.alipay.res.AlipayGzentityRes;
import com.jfatty.zcloud.base.interfaces.BInterface;
import com.jfatty.zcloud.base.utils.RELResultUtils;
import com.jfatty.zcloud.base.utils.ResultUtils;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * 描述 关注回复
 *
 * @author jfatty on 2020/4/26
 * @email jfatty@163.com
 */
@FeignClient(value = "zcloud-alipay-service" , path = "/api/alipayGzentity" )
public interface AlipayGzentityFeignClient extends BInterface<AlipayGzentity,AlipayGzentityReq,AlipayGzentityRes> {


    @RequestMapping(value={"/table/list"},method = RequestMethod.POST)
    RELResultUtils<AlipayGzentityRes> table(@RequestBody Map<String,Object> params) ;


    @RequestMapping(value={"/table/list"},method = RequestMethod.GET )
    RELResultUtils<AlipayGzentityRes> table(@RequestParam(value = "v" , defaultValue = "20191101") String v ,
                                          @RequestParam(value = "pageIndex" , defaultValue = "1" ) Integer pageIndex ,
                                          @RequestParam(value = "pageSize" , defaultValue = "10") Integer pageSize) ;

    @RequestMapping(value={"/list"},method=RequestMethod.GET)
    ResultUtils list() ;

    @RequestMapping(value={"/list"},method=RequestMethod.POST)
    List<AlipayGzentityRes> list(@RequestParam(value = "v" , defaultValue = "20191101") Long v);

    @RequestMapping(value={"/save"},method=RequestMethod.POST)
    ResultUtils save(@RequestBody AlipayGzentityReq entity) ;

    @RequestMapping(value={"/edit"},method=RequestMethod.GET)
    ResultUtils view(@RequestParam(value = "id" , defaultValue = "AQAQAQ") String id ) ;

    @RequestMapping(value={"/edit"},method=RequestMethod.POST)
    ResultUtils edit(@RequestBody AlipayGzentityReq entity) ;

    @RequestMapping(value={"/delete"},method=RequestMethod.POST)
    ResultUtils delete(@RequestBody Map<String,Object> params) ;


}
