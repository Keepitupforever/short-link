package com.liuyelei.shortlink.admin.dto.req;

import lombok.Data;

/**
 * 短链接分组排序参数
 */
@Data
public class ShortLinkGroupSortReqDTO {

    /**
     * 分组iD
     */
    private String gid;
    /**
     * 排序字段
     */
    private Integer sortOrder;
}
