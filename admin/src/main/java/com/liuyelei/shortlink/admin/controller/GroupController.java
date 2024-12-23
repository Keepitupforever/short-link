package com.liuyelei.shortlink.admin.controller;

import com.liuyelei.shortlink.admin.common.convention.result.Result;
import com.liuyelei.shortlink.admin.common.convention.result.Results;
import com.liuyelei.shortlink.admin.dto.req.ShortLinkGroupSaveReqDTO;
import com.liuyelei.shortlink.admin.dto.req.ShortLinkGroupSortReqDTO;
import com.liuyelei.shortlink.admin.dto.req.ShortLinkGroupUpdateReqDTO;
import com.liuyelei.shortlink.admin.dto.resp.ShortLinkGroupRespDTO;
import com.liuyelei.shortlink.admin.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 短链接分组控制层
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/short-link/admin/v1/group")
public class GroupController {

    private final GroupService groupService;

    /**
     * 新增短链接分组
     */
    @PostMapping
    public Result<Void> save(@RequestBody ShortLinkGroupSaveReqDTO requestParam) {
        groupService.saveGroup(requestParam.getName());
        return Results.success();
    }

    /**
     * 查询短链接分组集合
     */
    @GetMapping
    public Result<List<ShortLinkGroupRespDTO>> listGroup() {
        return Results.success(groupService.listGroup());
    }

    /**
     * 修改短链接分组名称
     */
    @PutMapping
    public Result<Void> updateGroup(@RequestBody ShortLinkGroupUpdateReqDTO requestParam) {
        groupService.updateGroup(requestParam);
        return Results.success();
    }

    /**
     * 修改短链接分组名称
     */
    @PostMapping("/sort")
    public Result<Void> sortGroup(@RequestBody List<ShortLinkGroupSortReqDTO> requestParam) {
        groupService.sortGroup(requestParam);
        return Results.success();
    }
}
