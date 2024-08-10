package com.liuyelei.shortlink.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liuyelei.shortlink.admin.dao.entity.GroupDO;
import com.liuyelei.shortlink.admin.dao.mapper.GroupMapper;
import com.liuyelei.shortlink.admin.service.GroupService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 短链接分组服务实现
 */
@Slf4j
@Service
public class GroupServiceImpl extends ServiceImpl<GroupMapper, GroupDO> implements GroupService {
}
