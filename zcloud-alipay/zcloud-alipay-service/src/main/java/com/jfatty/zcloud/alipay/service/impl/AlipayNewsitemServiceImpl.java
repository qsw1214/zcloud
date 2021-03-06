package com.jfatty.zcloud.alipay.service.impl;

import com.jfatty.zcloud.alipay.entity.AlipayNewsitem;
import com.jfatty.zcloud.alipay.mapper.AlipayNewsitemMapper;
import com.jfatty.zcloud.alipay.service.AlipayNewsitemService;
import com.jfatty.zcloud.base.service.impl.BaseServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 图文素材新闻 服务实现类
 * </p>
 *
 * @author jfatty
 * @since 2019-11-08
 */
@Slf4j
@Service
public class AlipayNewsitemServiceImpl extends BaseServiceImpl<AlipayNewsitem, AlipayNewsitemMapper> implements AlipayNewsitemService {

    private  AlipayNewsitemMapper alipayNewsitemMapper ;

    @Autowired
    public void setAlipayNewsitemMapper(AlipayNewsitemMapper alipayNewsitemMapper) {
        super.setBaseMapper(alipayNewsitemMapper);
        this.alipayNewsitemMapper = alipayNewsitemMapper;
    }
}
