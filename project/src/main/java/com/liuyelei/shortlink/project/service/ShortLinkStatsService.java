package com.liuyelei.shortlink.project.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.liuyelei.shortlink.project.dto.req.ShortLinkStatsAccessRecordReqDTO;
import com.liuyelei.shortlink.project.dto.req.ShortLinkStatsReqDTO;
import com.liuyelei.shortlink.project.dto.resp.ShortLinkStatsAccessRecordRespDTO;
import com.liuyelei.shortlink.project.dto.resp.ShortLinkStatsRespDTO;

/**
 * 短链接监控接口层
 */
public interface ShortLinkStatsService {

    /**
     * 获取单个短链接监控数据
     *
     * @param requestParam 获取短链接监控数据入参
     * @return 短链接监控数据
     */
    ShortLinkStatsRespDTO oneShortLinkStats(ShortLinkStatsReqDTO requestParam);

    /**
     * 短链接监控访问记录分页查询
     */
    IPage<ShortLinkStatsAccessRecordRespDTO> shortLinkStatsAccessRecord(ShortLinkStatsAccessRecordReqDTO requestParam);
}