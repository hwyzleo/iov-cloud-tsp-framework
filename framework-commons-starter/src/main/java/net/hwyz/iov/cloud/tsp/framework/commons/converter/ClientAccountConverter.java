package net.hwyz.iov.cloud.tsp.framework.commons.converter;

import cn.hutool.core.util.StrUtil;
import cn.hutool.core.util.URLUtil;
import cn.hutool.json.JSONUtil;
import net.hwyz.iov.cloud.tsp.framework.commons.bean.ClientAccount;
import org.springframework.core.convert.converter.Converter;

/**
 * 客户账号转换类
 *
 * @author hwyz_leo
 */
public class ClientAccountConverter implements Converter<String, ClientAccount> {

    @Override
    public ClientAccount convert(String clientAccountJson) {
        ClientAccount clientAccount = null;
        if (StrUtil.isNotBlank(clientAccountJson)) {
            clientAccount = JSONUtil.toBean(URLUtil.decode(clientAccountJson), ClientAccount.class);
        }
        return clientAccount;
    }

}
