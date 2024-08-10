package com.liuyelei.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liuyelei.shortlink.admin.dao.entity.GroupDO;
import com.liuyelei.shortlink.admin.dto.req.ShortLinkGroupSortReqDTO;
import com.liuyelei.shortlink.admin.dto.req.ShortLinkGroupUpdateReqDTO;
import com.liuyelei.shortlink.admin.dto.resp.ShortLinkGroupRespDTO;

import java.util.List;

/**
 * 短链接分组接口
 */
public interface GroupService extends IService<GroupDO> {
    /**
     * 新增短链接分组
     *
     * @param groupName 短链接分组名
     */
    void saveGroup(String groupName);

    /**
     * 查询用户短链接分组集合
     *
     * @return 用户短链接分组集合
     */
    List<ShortLinkGroupRespDTO> listGroup();

    /**
     * 修改短链接分组
     *
     * @param requestParam 修改短链接分组参数
     */
    void updateGroup(ShortLinkGroupUpdateReqDTO requestParam);
    /**
     * 短链接分组排序
     *
     * @param requestParam 短链接分组排序参数
     */
    void sortGroup(List<ShortLinkGroupSortReqDTO> requestParam);
}
