package com.jfatty.zcloud.hospital.api;


import com.jfatty.zcloud.base.utils.RELResultUtils;
import com.jfatty.zcloud.hospital.entity.BannerImg;
import com.jfatty.zcloud.hospital.entity.Navigation;
import com.jfatty.zcloud.hospital.interfaces.IBannerImg;
import com.jfatty.zcloud.hospital.req.BannerImgReq;
import com.jfatty.zcloud.hospital.res.BannerImgRes;
import com.jfatty.zcloud.hospital.res.MenuRes;
import com.jfatty.zcloud.hospital.res.NavigationRes;
import com.jfatty.zcloud.hospital.service.BannerImgService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jfatty
 * @since 2019-12-12
 */
@Api(tags = "首页轮播图API" ,value = "首页轮播图")
@Slf4j
@RestController
@RequestMapping("/api/bannerImg")
public class ApiBannerImgController extends ApiBaseHospitalController<BannerImg,BannerImgReq,BannerImgRes>  implements IBannerImg {

    private BannerImgService bannerImgService;

    @Autowired
    public void setBannerImgService(BannerImgService bannerImgService) {
        super.setBaseService(bannerImgService);
        this.bannerImgService = bannerImgService;
    }

    @ApiOperation(value="根据定位/默认获取首页轮播图")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "appId", value = "每个应用都对应有appId支付宝、微信、第三方APP",dataType = "String",defaultValue = "wxe3336a60d2685379"),
            @ApiImplicitParam(name = "version", value = "版本号",dataType = "String",defaultValue = "1.0.0"),
            @ApiImplicitParam(name = "position", value = "定位",dataType = "String",defaultValue = "index")
    })
    @RequestMapping(value={"/index"},method=RequestMethod.GET)
    public RELResultUtils<BannerImgRes> index(@RequestParam(value = "appId" , defaultValue = "wxe3336a60d2685379" ) String appId  ,
                                         @RequestParam(value = "version" , defaultValue = "1.0.0") String version ,
                                         @RequestParam(value = "position" , defaultValue = "index" ) String position ){
        List<BannerImg> bannerImgs = bannerImgService.getDiffBannerImgs(appId,version,null,null);
        if(CollectionUtils.isEmpty(bannerImgs))
            return RELResultUtils.success("未查询到对应轮播图");
        List<BannerImgRes> bannerImgReses = new ArrayList<BannerImgRes>();
        bannerImgs.forEach(
                bannerImg -> {
                    BannerImgRes bannerImgRes = new BannerImgRes();
                    BeanUtils.copyProperties(bannerImg,bannerImgRes);
                    bannerImgReses.add(bannerImgRes);
                }
        );
        return new RELResultUtils(bannerImgReses);
    }


}

