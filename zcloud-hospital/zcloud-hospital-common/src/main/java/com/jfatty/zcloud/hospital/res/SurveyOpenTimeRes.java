package com.jfatty.zcloud.hospital.res;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jfatty.zcloud.hospital.dto.SurveyOpenTimeDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

/**
 * 描述 量表开放时间管理
 *
 * @author jfatty on 2020/6/10
 * @email jfatty@163.com
 */
@Data
@ApiModel(description = "量表开放时间管理响应实体")
public class SurveyOpenTimeRes extends SurveyOpenTimeDTO<SurveyOpenTimeRes> {

    /**
     * 创建人
     */
    @ApiModelProperty(name = "createOperator", position = 12 , value = "创建人" , example = "张三" )
    private String createOperator;

    /**
     * 创建时间
     */
    @ApiModelProperty(name = "createTime", position = 13 , value = "创建时间" ,allowableValues = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime ;

}
