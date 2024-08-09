package com.liuyelei.shortlink.admin.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.liuyelei.shortlink.admin.dao.entity.UserDO;
import com.liuyelei.shortlink.admin.dto.req.UserLoginReqDTO;
import com.liuyelei.shortlink.admin.dto.req.UserRegisterReqDTO;
import com.liuyelei.shortlink.admin.dto.req.UserUpdateReqDTO;
import com.liuyelei.shortlink.admin.dto.resp.UserLoginRespDTO;
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

    /**
     * 根据用户名修改用户
     * @param requestParam 修改用户请求参数
     */
    void update(UserUpdateReqDTO requestParam);

    /**
     * 用户登录
     *
     * @param requestParam 用户登录请求参数
     * @return 用户登录返回参数 Token
     */
    UserLoginRespDTO login(UserLoginReqDTO requestParam);

    /**
     * 检查用户登录信息
     * @param username 用户名
     * @param token 用户登录Token
     * @return 用户是否登录
     */
    Boolean checkLogin(String username, String token);
}
