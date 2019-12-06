package com.jfatty.zcloud.wechat.feign;

import com.jfatty.zcloud.base.interfaces.BInterface;
import com.jfatty.zcloud.wechat.entity.MsgText;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 描述
 *
 * @author jfatty on 2019/11/13
 * @email jfatty@163.com
 */
@FeignClient(value = "zcloud-wechat-service" , path = "/api/msgText")
public interface MsgTextFeignClient extends BInterface<MsgText> {


}