package org.pzz.common.api;

import org.pzz.common.vo.CommonSysUser;

public interface CommonAPI {

    /**
     * 根据用户名获取用户信息
     * @param username
     * @return
     */
    CommonSysUser getUserByUsername(String username);

}
