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
@Table(value = "cd_menu")
public class MenuEntity {

    @Id(keyType = KeyType.Auto)
    private Integer menuId;

    @Column(value = "menu_name")
    private String menuName;

    @Column(value = "menu_code")
    private String menuCode;


    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }
}
