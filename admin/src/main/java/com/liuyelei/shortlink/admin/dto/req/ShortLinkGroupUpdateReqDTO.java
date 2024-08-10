package com.liuyelei.shortlink.admin.dto.req;

import lombok.Data;

/**
 * 短链接分组修改参数
 */
@Data
public class ShortLinkGroupUpdateReqDTO {

    /**
     * 分组标识
     */
    private String gid;
    /**
     * 短链接分组名
     */
    private String name;
}
