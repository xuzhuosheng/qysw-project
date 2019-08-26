package com.qysw.qyswproviderxtgn.dao;

import com.qysw.qyswproviderxtgn.entity.QysswjXxzxTXtUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (QysswjXxzxTXtUser)表数据库访问层
 *
 * @author makejava
 * @since 2019-08-26 10:03:30
 */
@Repository ("qysswjXxzxTXtUserDao")
public interface QysswjXxzxTXtUserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    QysswjXxzxTXtUser queryById(@Param ("id") Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<QysswjXxzxTXtUser> queryAllByLimit(@Param ("offset") int offset, @Param ("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param qysswjXxzxTXtUser 实例对象
     * @return 对象列表
     */
    List<QysswjXxzxTXtUser> queryAll(QysswjXxzxTXtUser qysswjXxzxTXtUser);

    /**
     * 新增数据
     *
     * @param qysswjXxzxTXtUser 实例对象
     * @return 影响行数
     */
    void insert(@Param ("qysswjXxzxTXtUser") QysswjXxzxTXtUser qysswjXxzxTXtUser);

    /**
     * 修改数据
     *
     * @param qysswjXxzxTXtUser 实例对象
     * @return 影响行数
     */
    void update(@Param ("qysswjXxzxTXtUser") QysswjXxzxTXtUser qysswjXxzxTXtUser);

    /**
     * 通过主键删除数据
     *
     * @param idList 主键
     * @return 影响行数
     */
    void deleteById(@Param ("idList")List<String> idList);


    /**
     * 获取所有用户
     */
    List<QysswjXxzxTXtUser> queryAllUser(@Param ("searchContent") String searchContent);
}