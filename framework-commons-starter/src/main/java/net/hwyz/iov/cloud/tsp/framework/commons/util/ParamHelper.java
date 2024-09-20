package net.hwyz.iov.cloud.tsp.framework.commons.util;

import cn.hutool.core.util.StrUtil;
import net.hwyz.iov.cloud.tsp.framework.commons.bean.ClientAccount;

/**
 * 参数辅助类
 *
 * @author hwyz_leo
 */
public class ParamHelper {

    /**
     * 获取客户端账号信息
     *
     * @param clientAccount 客户端账号信息
     * @return 客户端账号信息
     */
    public static String getClientAccountInfo(ClientAccount clientAccount) {
        if (clientAccount == null) {
            return null;
        }
        return StrUtil.emptyIfNull(clientAccount.getClientId()) + ":" + StrUtil.emptyIfNull(clientAccount.getAccountId());
    }

}
