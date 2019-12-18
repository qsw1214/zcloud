package com.jfatty.zcloud.system.res;

import com.jfatty.zcloud.system.dto.AddressDTO;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * 描述
 *
 * @author jfatty on 2019/12/16
 * @email jfatty@163.com
 */
@Data
@ApiModel(description = "项目管理实体")
public class AddressRes extends AddressDTO<AddressRes> {
}