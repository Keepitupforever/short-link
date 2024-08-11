package com.liuyelei.shortlink.admin.controller;

import cn.hutool.core.bean.BeanUtil;
import com.liuyelei.shortlink.admin.common.convention.result.Result;
import com.liuyelei.shortlink.admin.common.convention.result.Results;
import com.liuyelei.shortlink.admin.dto.req.UserLoginReqDTO;
import com.liuyelei.shortlink.admin.dto.req.UserRegisterReqDTO;
import com.liuyelei.shortlink.admin.dto.req.UserUpdateReqDTO;
import com.liuyelei.shortlink.admin.dto.resp.UserActualRespDTO;
import com.liuyelei.shortlink.admin.dto.resp.UserLoginRespDTO;
import com.liuyelei.shortlink.admin.dto.resp.UserRespDTO;
import com.liuyelei.shortlink.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * 用户管理层
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/short-link/admin/v1")
public class UserController {

    private final UserService userService;

    /**
     * 根据用户名查询用户信息
     */
    @GetMapping("/user/{username}")
    public Result<UserRespDTO> getUserByUsername(@PathVariable("username") String username) {
        return Results.success(userService.getUserByUsername(username));
    }

    /**
     * 根据用户名查询用户无脱敏信息
     */
    @GetMapping("/actual/user/{username}")
    public Result<UserActualRespDTO> getActualUserByUsername(@PathVariable("username") String username) {
        return Results.success(BeanUtil.toBean(userService.getUserByUsername(username), UserActualRespDTO.class));
    }

    /**
     * 根据用户名查询用户是否存在
     */
    @GetMapping("/user/has-username")
    public Result<Boolean> hasUsername(String username) {
        return Results.success(userService.hasUsername(username));
    }

    /**
     * 注册用户
     */
    @PostMapping("/user")
    public Result<Void> register(@RequestBody UserRegisterReqDTO requestParam) {
        userService.register(requestParam);
        return Results.success();
    }

    /**
     * 修改用户
     */
    @PutMapping("/user")
    public Result<Void> update(@RequestBody UserUpdateReqDTO requestParam) {
        userService.update(requestParam);
        return Results.success();
    }
    /**
     * 用户登录
     */
    @PostMapping("/user/login")
    public Result<UserLoginRespDTO> login(@RequestBody UserLoginReqDTO requestParam) {
        return Results.success(userService.login(requestParam));
    }

    /**
     * 检查用户是否登录
     */
    @GetMapping("/user/check-login")
    public Result<Boolean> checkLogin(@RequestParam("username") String username, @RequestParam("token") String token) {
        return Results.success(userService.checkLogin(username, token));
    }

    /**
     * 注销用户登录
     */
    @DeleteMapping("/user/logout")
    public Result<Void> logout(@RequestParam("username") String username, @RequestParam("token") String token) {
        userService.logout(username, token);
        return Results.success();
    }
}
