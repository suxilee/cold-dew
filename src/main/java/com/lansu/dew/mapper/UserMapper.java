package com.lansu.dew.mapper;

import com.lansu.dew.domain.UserEntity;
import com.mybatisflex.core.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 映射层。
 *
 * @author lansu
 * @since 1.0
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {


}
