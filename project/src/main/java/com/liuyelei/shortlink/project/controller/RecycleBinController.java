package com.liuyelei.shortlink.project.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.liuyelei.shortlink.project.common.convention.result.Result;
import com.liuyelei.shortlink.project.common.convention.result.Results;
import com.liuyelei.shortlink.project.dto.req.RecycleBinRecoverReqDTO;
import com.liuyelei.shortlink.project.dto.req.RecycleBinRemoveReqDTO;
import com.liuyelei.shortlink.project.dto.req.RecycleBinSaveReqDTO;
import com.liuyelei.shortlink.project.dto.req.ShortLinkRecycleBinPageReqDTO;
import com.liuyelei.shortlink.project.dto.resp.ShortLinkPageRespDTO;
import com.liuyelei.shortlink.project.service.RecycleBinService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 回收站管理控制层
 */
@RestController
@RequiredArgsConstructor
public class RecycleBinController {

    private final RecycleBinService recycleBinService;

    /**
     * 保存回收站
     */
    @PostMapping("/api/short-link/v1/recycle-bin/save")
    public Result<Void> saveRecycleBin(@RequestBody RecycleBinSaveReqDTO requestParam) {
        recycleBinService.saveRecycleBin(requestParam);
        return Results.success();
    }

    /**
     * 分页查询短链接
     */
    @GetMapping("/api/short-link/v1/recycle-bin/page")
    public Result<IPage<ShortLinkPageRespDTO>> pageShortLink(ShortLinkRecycleBinPageReqDTO requestParam) {
        return Results.success(recycleBinService.pageShortLink(requestParam));
    }

    /**
     * 恢复短链接
     */
    @PostMapping("/api/short-link/v1/recycle-bin/recover")
    public Result<Void> recoverRecycleBin(@RequestBody RecycleBinRecoverReqDTO requestParam) {
        recycleBinService.recoverRecycleBin(requestParam);
        return Results.success();
    }

    /**
     * 移除短链接
     */
    @PostMapping("/api/short-link/v1/recycle-bin/remove")
    public Result<Void> removeRecycleBin(@RequestBody RecycleBinRemoveReqDTO requestParam) {
        recycleBinService.removeRecycleBin(requestParam);
        return Results.success();
    }
}
