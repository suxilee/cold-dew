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
@Table(value = "cd_role_menu")
public class RoleMenuEntity {

    @Id(keyType = KeyType.Auto)
    private Integer id;

    @Column(value = "role_id")
    private Integer roleId;

    @Column(value = "menu_id")
    private Integer menuId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }
}
