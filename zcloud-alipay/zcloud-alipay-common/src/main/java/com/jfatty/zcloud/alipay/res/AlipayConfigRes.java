package com.jfatty.zcloud.alipay.res;

import com.jfatty.zcloud.alipay.dto.AlipayConfigDTO;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * 描述 支付宝支付配置信息
 *
 * @author jfatty on 2020/4/26
 * @email jfatty@163.com
 */
@Data
@ApiModel(description = "支付宝支付配置信息响应实体")
public class AlipayConfigRes extends AlipayConfigDTO<AlipayConfigRes> {



}
