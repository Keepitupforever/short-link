package com.liuyelei.shortlink.admin.dto.req;

import lombok.Data;

/**
 * 回收站删除功能
 */
@Data
public class RecycleBinRemoveReqDTO {

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 全部短链接
     */
    private String fullShortUrl;
}