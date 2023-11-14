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
import com.lansu.dew.service.UserRoleService;
import com.lansu.dew.domain.UserRoleEntity;
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
@RequestMapping("/userRole")
public class UserRoleController {

    @Autowired
    private UserRoleService userRoleService;

    /**
     * 添加
     *
     * @param userRole
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("/save")
    public boolean save(@RequestBody UserRoleEntity userRole) {
        return userRoleService.save(userRole);
    }


    /**
     * 根据主键删除
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("/remove/{id}")
    public boolean remove(@PathVariable Serializable id) {
        return userRoleService.removeById(id);
    }


    /**
     * 根据主键更新
     *
     * @param userRole
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("/update")
    public boolean update(@RequestBody UserRoleEntity userRole) {
        return userRoleService.updateById(userRole);
    }


    /**
     * 查询所有
     *
     * @return 所有数据
     */
    @GetMapping("/list")
    public List<UserRoleEntity> list() {
        return userRoleService.list();
    }


    /**
     * 根据主键获取详细信息。
     *
     * @param id userRole主键
     * @return 详情
     */
    @GetMapping("/getInfo/{id}")
    public UserRoleEntity getInfo(@PathVariable Serializable id) {
        return userRoleService.getById(id);
    }


    /**
     * 分页查询
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("/page")
    public Page<UserRoleEntity> page(Page<UserRoleEntity> page) {
        return userRoleService.page(page);
    }
}