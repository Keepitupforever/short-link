package com.liuyelei.shortlink.admin.remote;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.TypeReference;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.liuyelei.shortlink.admin.common.convention.result.Result;
import com.liuyelei.shortlink.admin.remote.dto.req.ShortLinkCreateReqDTO;
import com.liuyelei.shortlink.admin.remote.dto.req.ShortLinkPageReqDTO;
import com.liuyelei.shortlink.admin.remote.dto.req.ShortLinkUpdateReqDTO;
import com.liuyelei.shortlink.admin.remote.dto.resp.ShortLinkCreateRespDTO;
import com.liuyelei.shortlink.admin.remote.dto.resp.ShortLinkGroupCountQueryRespDTO;
import com.liuyelei.shortlink.admin.remote.dto.resp.ShortLinkPageRespDTO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ShortLinkRemoteService {

    /**
     * 创建短链接
     * @param requestParam 创建短链接请求参数
     * @return 创建短链接响应
     */
    default Result<ShortLinkCreateRespDTO> createShortLink(ShortLinkCreateReqDTO requestParam) {
        String resultBodyStr = HttpUtil.post("http://127.0.0.1:8001/api/short-link/v1/create", JSON.toJSONString(requestParam));
        return JSON.parseObject(resultBodyStr, new TypeReference<Result<ShortLinkCreateRespDTO>>() {
        });
    }

    /**
     * 修改短链接
     * @param requestParam 修改短链接请求参数
     */
    default void updateShortLink(ShortLinkUpdateReqDTO requestParam) {
        HttpUtil.post("http://127.0.0.1:8001/api/short-link/v1/update", JSON.toJSONString(requestParam));
    }

    /**
     * 短链接分页查询
     * @param requestParam 短链接分页查询请求参数
     * @return 短链接分页查询响应
     */
    default Result<IPage<ShortLinkPageRespDTO>> pageShortLink(ShortLinkPageReqDTO requestParam) {
        Map<String, Object> requestMap = new HashMap<>();
        requestMap.put("gid", requestParam.getGid());
        requestMap.put("current", requestParam.getCurrent());
        requestMap.put("size", requestParam.getSize());
        String resultPage = HttpUtil.get("http://127.0.0.1:8001/api/short-link/v1/page", requestMap);
        return JSON.parseObject(resultPage, new TypeReference<Result<IPage<ShortLinkPageRespDTO>>>() {
        });
    }

    /**
     * 短链接分组短链接容量
     * @param requestParam 短链接分组短链接容量请求参数
     * @return 短链接分组短链接容量响应
     */
    default Result<List<ShortLinkGroupCountQueryRespDTO>> listGroupShortLinkCount(List<String> requestParam) {
        Map<String, Object> requestMap = new HashMap<>();
        requestMap.put("requestParam", requestParam);
        String resultPage = HttpUtil.get("http://127.0.0.1:8001/api/short-link/v1/count", requestMap);
        return JSON.parseObject(resultPage, new TypeReference<Result<List<ShortLinkGroupCountQueryRespDTO>>>() {
        });
    }

    /**
     * 根据 URL 获取标题
     *
     * @param url 目标网站地址
     * @return 网站标题
     */
    default Result<String> getTitleByUrl(String url) {
        String resultStr = HttpUtil.get("http://127.0.0.1:8001/api/short-link/v1/title?url=" + url);
        return JSON.parseObject(resultStr, new TypeReference<Result<String>>() {
        });
    }
}
