package com.lansu.dew.domain;

import com.mybatisflex.annotation.Column;
import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;

/**
 * 实体类。
 *
 * @author lansu
 * @since 1.0
 */
@Table(value = "cd_user_role")
public class UserRoleEntity {

    @Id(keyType = KeyType.Auto)
    private Integer id;

    @Column(value = "user_id")
    private Integer userId;

    @Column(value = "role_id")
    private Integer roleId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
