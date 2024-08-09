package com.liuyelei.shortlink.admin.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.liuyelei.shortlink.admin.dao.entity.UserDO;
import com.liuyelei.shortlink.admin.dto.req.UserRegisterReqDTO;
import com.liuyelei.shortlink.admin.dto.resp.UserRespDTO;

/**
 * 用户接口层
 */
public interface UserService extends IService<UserDO> {

    /**
     * 根据用户名查询用户信息
     *
     * @param username 用户名
     * @return 用户实体
     */
    UserRespDTO getUserByUsername(String username);

    /**
     * 根据用户名检查用户是否存在
     * @param username 用户名
     * @return true：用户已存在； false：用户不存在
     */
    Boolean hasUsername(String username);

    /**
     * 注册用户
     * @param requestParam 注册用户请求参数
     */
    void register(UserRegisterReqDTO requestParam);
}
