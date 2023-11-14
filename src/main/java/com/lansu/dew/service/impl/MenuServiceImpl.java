package com.lansu.dew.service.impl;


import org.springframework.stereotype.Service;
import com.lansu.dew.service.MenuService;
import com.lansu.dew.domain.MenuEntity;
import com.lansu.dew.mapper.MenuMapper;
import com.mybatisflex.spring.service.impl.ServiceImpl;

/**
 * 服务层实现。
 *
 * @author lansu
 * @since 1.0
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, MenuEntity> implements MenuService {

}