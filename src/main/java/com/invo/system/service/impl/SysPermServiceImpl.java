package com.invo.system.service.impl;

import com.invo.system.entity.SysPerm;
import com.invo.system.mapper.SysPermMapper;
import com.invo.system.service.ISysPermService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 权限表：关联角色表和菜单表 服务实现类
 * </p>
 *
 * @author wuwanggao@163.com123
 * @since 2018-01-23
 */
@Service
public class SysPermServiceImpl extends ServiceImpl<SysPermMapper, SysPerm> implements ISysPermService {

}
