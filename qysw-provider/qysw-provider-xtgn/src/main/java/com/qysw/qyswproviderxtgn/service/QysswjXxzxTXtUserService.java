package com.qysw.qyswproviderxtgn.service;

import com.qysw.qyswproviderxtgn.entity.QysswjXxzxTXtUser;

import java.util.List;

/**
 * (QysswjXxzxTXtUser)表服务接口
 *
 * @author makejava
 * @since 2019-08-26 10:03:31
 */
public interface QysswjXxzxTXtUserService {


    /**
     * 查询所有用户
     *
     * @param searchContent 搜索内容
     * @return 实例对象
     */
    List<QysswjXxzxTXtUser> queryAllUser(String searchContent);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    QysswjXxzxTXtUser queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<QysswjXxzxTXtUser> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param qysswjXxzxTXtUser 实例对象
     * @return 实例对象
     */
    void insert(QysswjXxzxTXtUser qysswjXxzxTXtUser);

    /**
     * 修改数据
     *
     * @param qysswjXxzxTXtUser 实例对象
     * @return 实例对象
     */
    void update(QysswjXxzxTXtUser qysswjXxzxTXtUser);

    /**
     * 通过主键删除数据
     *
     * @param idList 主键
     * @return 是否成功
     */
    void deleteById(List<String> idList);


}