package com.lansu.dew.service.impl;


import org.springframework.stereotype.Service;
import com.lansu.dew.service.UserRoleService;
import com.lansu.dew.domain.UserRoleEntity;
import com.lansu.dew.mapper.UserRoleMapper;
import com.mybatisflex.spring.service.impl.ServiceImpl;

/**
 * 服务层实现。
 *
 * @author lansu
 * @since 1.0
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRoleEntity> implements UserRoleService {

}