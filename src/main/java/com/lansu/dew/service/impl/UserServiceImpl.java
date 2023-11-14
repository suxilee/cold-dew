package com.lansu.dew.service.impl;


import org.springframework.stereotype.Service;
import com.lansu.dew.service.UserService;
import com.lansu.dew.domain.UserEntity;
import com.lansu.dew.mapper.UserMapper;
import com.mybatisflex.spring.service.impl.ServiceImpl;

/**
 * 服务层实现。
 *
 * @author lansu
 * @since 1.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {

}