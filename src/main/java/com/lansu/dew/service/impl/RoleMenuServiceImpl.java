package com.lansu.dew.service.impl;


import org.springframework.stereotype.Service;
import com.lansu.dew.service.RoleMenuService;
import com.lansu.dew.domain.RoleMenuEntity;
import com.lansu.dew.mapper.RoleMenuMapper;
import com.mybatisflex.spring.service.impl.ServiceImpl;

/**
 * 服务层实现。
 *
 * @author lansu
 * @since 1.0
 */
@Service
public class RoleMenuServiceImpl extends ServiceImpl<RoleMenuMapper, RoleMenuEntity> implements RoleMenuService {

}