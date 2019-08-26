package com.qysw.qyswproviderxtgn.service.impl;

import com.qysw.qyswproviderxtgn.entity.QysswjXxzxTXtUser;
import com.qysw.qyswproviderxtgn.dao.QysswjXxzxTXtUserDao;
import com.qysw.qyswproviderxtgn.service.QysswjXxzxTXtUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (QysswjXxzxTXtUser)表服务实现类
 *
 * @author makejava
 * @since 2019-08-26 10:03:31
 */
@Service ("qysswjXxzxTXtUserService")
public class QysswjXxzxTXtUserServiceImpl implements QysswjXxzxTXtUserService {
    @Resource
    private QysswjXxzxTXtUserDao qysswjXxzxTXtUserDao;

    private List<QysswjXxzxTXtUser> userList;

    private QysswjXxzxTXtUser qysswjXxzxTXtUser;

    @Override
    public List<QysswjXxzxTXtUser> queryAllUser(String searchContent) {
        userList = qysswjXxzxTXtUserDao.queryAllUser(searchContent);
        return userList;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public QysswjXxzxTXtUser queryById(Integer id) {
        qysswjXxzxTXtUser = qysswjXxzxTXtUserDao.queryById(id);
        return qysswjXxzxTXtUser;
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<QysswjXxzxTXtUser> queryAllByLimit(int offset, int limit) {
        return this.qysswjXxzxTXtUserDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param qysswjXxzxTXtUser 实例对象
     * @return 实例对象
     */
    @Override
    public void insert(QysswjXxzxTXtUser qysswjXxzxTXtUser) {
        qysswjXxzxTXtUserDao.insert(qysswjXxzxTXtUser);
    }

    /**
     * 修改数据
     *
     * @param qysswjXxzxTXtUser 实例对象
     * @return 实例对象
     */
    @Override
    public void update(QysswjXxzxTXtUser qysswjXxzxTXtUser) {
        qysswjXxzxTXtUserDao.update(qysswjXxzxTXtUser);
    }

    /**
     * 通过主键删除数据
     *
     * @param idList 主键
     * @return 是否成功
     */
    @Override
    public void deleteById(List<String> idList) {
        qysswjXxzxTXtUserDao.deleteById(idList);
    }
}