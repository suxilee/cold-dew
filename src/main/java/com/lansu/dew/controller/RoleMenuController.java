package com.lansu.dew.controller;

import com.mybatisflex.core.paginate.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.lansu.dew.service.RoleMenuService;
import com.lansu.dew.domain.RoleMenuEntity;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.List;

/**
 * 控制层。
 *
 * @author lansu
 * @since 1.0
 */
@RestController
@RequestMapping("/roleMenu")
public class RoleMenuController {

    @Autowired
    private RoleMenuService roleMenuService;

    /**
     * 添加
     *
     * @param roleMenu
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("/save")
    public boolean save(@RequestBody RoleMenuEntity roleMenu) {
        return roleMenuService.save(roleMenu);
    }


    /**
     * 根据主键删除
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("/remove/{id}")
    public boolean remove(@PathVariable Serializable id) {
        return roleMenuService.removeById(id);
    }


    /**
     * 根据主键更新
     *
     * @param roleMenu
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("/update")
    public boolean update(@RequestBody RoleMenuEntity roleMenu) {
        return roleMenuService.updateById(roleMenu);
    }


    /**
     * 查询所有
     *
     * @return 所有数据
     */
    @GetMapping("/list")
    public List<RoleMenuEntity> list() {
        return roleMenuService.list();
    }


    /**
     * 根据主键获取详细信息。
     *
     * @param id roleMenu主键
     * @return 详情
     */
    @GetMapping("/getInfo/{id}")
    public RoleMenuEntity getInfo(@PathVariable Serializable id) {
        return roleMenuService.getById(id);
    }


    /**
     * 分页查询
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("/page")
    public Page<RoleMenuEntity> page(Page<RoleMenuEntity> page) {
        return roleMenuService.page(page);
    }
}