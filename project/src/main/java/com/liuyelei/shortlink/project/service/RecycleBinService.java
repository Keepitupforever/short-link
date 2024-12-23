package com.liuyelei.shortlink.project.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.liuyelei.shortlink.project.dao.entity.ShortLinkDO;
import com.liuyelei.shortlink.project.dto.req.RecycleBinRecoverReqDTO;
import com.liuyelei.shortlink.project.dto.req.RecycleBinRemoveReqDTO;
import com.liuyelei.shortlink.project.dto.req.RecycleBinSaveReqDTO;
import com.liuyelei.shortlink.project.dto.req.ShortLinkRecycleBinPageReqDTO;
import com.liuyelei.shortlink.project.dto.resp.ShortLinkPageRespDTO;

/**
 * 回收站管理接口层
 */
public interface RecycleBinService extends IService<ShortLinkDO> {

    /**
     * 保存回收站
     *
     * @param requestParam 请求参数
     */
    void saveRecycleBin(RecycleBinSaveReqDTO requestParam);

    /**
     * 分页查询短链接
     * @param requestParam 分页查询短链接请求参数
     * @return 分页查询短链接返回参数
     */
    IPage<ShortLinkPageRespDTO> pageShortLink(ShortLinkRecycleBinPageReqDTO requestParam);

    /**
     * 从回收站恢复短链接
     * @param requestParam 恢复短链接请求参数
     */
    void recoverRecycleBin(RecycleBinRecoverReqDTO requestParam);

    /**
     * 从回收站删除短链接
     * @param requestParam 删除短链接请求参数
     */
    void removeRecycleBin(RecycleBinRemoveReqDTO requestParam);
}