package com.jfatty.zcloud.system.interfaces;

import com.jfatty.zcloud.base.interfaces.BInterface;
import com.jfatty.zcloud.system.entity.Dictionary;
import com.jfatty.zcloud.system.req.DictionaryReq;
import com.jfatty.zcloud.system.res.DictionaryRes;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 描述
 *
 * @author jfatty on 2019/11/13
 * @email jfatty@163.com
 */
@RequestMapping(value={"/dictionary"})
public interface IDictionary extends BInterface<Dictionary,DictionaryReq,DictionaryRes> {

}
