package com.jfatty.zcloud.health.res;

import com.jfatty.zcloud.health.dto.HCSHealthCardInfoDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 描述
 *
 * @author jfatty on 2019/12/29
 * @email jfatty@163.com
 */
@Data
@ApiModel(description = "电子健康卡列表响应实体")
public class SimpleHealthCardInfoRes extends HCSHealthCardInfoDTO<SimpleHealthCardInfoRes> {


    //20200526新增
    @ApiModelProperty(name = "codeColor", position = 0, value = "二维码颜色",required = true ,example = "0：黑色 -未申报1：绿色-低风险2：黄色-中风险3：红色-高风险")
    private int codeColor ;

    //20200521 更新 返回页面都用身份证作为凭证
    //系统健康卡ID
    @ApiModelProperty(name = "id", position = 0, value = "系统健康卡ID",required = true ,example = "2C9580916F47F3AA016F47F3AA0F0000")
    private String id;
    /**
     * 姓名
     */
    @ApiModelProperty(name = "name", position = 0, value = "姓名",required = true ,example = "李志")
    private String name;
    /**
     * 证件号码
     */
    @ApiModelProperty(name = "idNumber", position = 0, value = "证件号码",required = true ,example = "42900419******4038")
    private String idNumber;
    /**
     * 二维码文本
     */
    @ApiModelProperty(name = "qrCodeText", position = 0, value = "二维码文本",required = true ,example = "E1D10AAC73D0B947060B099128732C969A6EF97A6014BF41B3D19EEF9A4FBB18:1")
    private String qrCodeText;

    @ApiModelProperty(name = "detailUrl", position = 0, value = "电子健康卡详情展示跳转地址",required = true ,example = "")
    private String detailUrl ;


    /**
     * 发卡机构名称
     */
    @ApiModelProperty(name = "issueCardOrg", position = 0, value = "发卡机构名称",required = true ,example = "湖南省卫生健康委员会")
    private String issueCardOrg ;


}
