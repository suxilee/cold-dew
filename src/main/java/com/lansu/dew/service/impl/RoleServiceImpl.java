package com.lansu.dew.service.impl;


import org.springframework.stereotype.Service;
import com.lansu.dew.service.RoleService;
import com.lansu.dew.domain.RoleEntity;
import com.lansu.dew.mapper.RoleMapper;
import com.mybatisflex.spring.service.impl.ServiceImpl;

/**
 * 服务层实现。
 *
 * @author lansu
 * @since 1.0
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, RoleEntity> implements RoleService {

}