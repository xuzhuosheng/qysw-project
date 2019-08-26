package com.qysw.qyswproviderxtgn.controller;

import com.qysw.qyswproviderxtgn.entity.QysswjXxzxTXtUser;
import com.qysw.qyswproviderxtgn.service.QysswjXxzxTXtUserService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * (QysswjXxzxTXtUser)表控制层
 *
 * @author makejava
 * @since 2019-08-26 10:03:32
 */
@RestController
//@RequestMapping ("/xtgn")
@Api (value = "用户类")
public class QysswjXxzxTXtUserController {

    List<QysswjXxzxTXtUser> userList;

    QysswjXxzxTXtUser qysswjXxzxTXtUser;

    /**
     * 服务对象
     */
    @Resource
    private QysswjXxzxTXtUserService qysswjXxzxTXtUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping (value = "selectOne")
    @ResponseBody
    @ApiOperation (value = "根据ID获取用户", notes = "查询成功后，返回对象，一般作为修改用户信息用")
    @ApiImplicitParam (name = "id", value = "用户ID", required = true, paramType = "query")
    @ApiResponse (code = 400, message = "参数没有填好", response = String.class)
    public QysswjXxzxTXtUser selectOne(@RequestParam (required = true) Integer id) {
        qysswjXxzxTXtUser = new QysswjXxzxTXtUser();
        try {
            qysswjXxzxTXtUser = qysswjXxzxTXtUserService.queryById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return qysswjXxzxTXtUser;

    }


    @GetMapping (value = "getAllUser")
    @ResponseBody
    @ApiOperation (value = "查询所有用户", notes = "查询成功后，返回对象List，显示作用")
    @ApiImplicitParams (
            {
                    @ApiImplicitParam (name = "searchContent", value = "搜索内容", paramType = "query")
            }
    )
    @ApiResponse (code = 400, message = "参数没有填好", response = String.class)
    public List<QysswjXxzxTXtUser> getAllUser(@RequestParam (required = false) String searchContent) {
        userList = new ArrayList<>();
        try {
            userList = qysswjXxzxTXtUserService.queryAllUser(searchContent);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userList;

    }

    @GetMapping (value = "updateUser")
    @ResponseBody
    @ApiOperation (value = "更新用户信息", notes = "更新成功后，返回对象List")
    @ApiImplicitParams (
            {
                    @ApiImplicitParam (name = "username", value = "用户名", paramType = "query"),
                    @ApiImplicitParam (name = "password", value = "密码", paramType = "query"),
                    @ApiImplicitParam (name = "cellphone", value = "电话号码", paramType = "query"),
                    @ApiImplicitParam (name = "truename", value = "真实姓名", paramType = "query"),
                    @ApiImplicitParam (name = "id", value = "更新数据ID", required = true, paramType = "query")
            }
    )
    @ApiResponse (code = 400, message = "参数没有填好", response = String.class)
    public boolean updateUser(@RequestParam (required = false) String username,
                              @RequestParam (required = false) String password,
                              @RequestParam (required = false) String cellphone,
                              @RequestParam (required = false) String truename,
                              @RequestParam (required = true) Integer id) {

        boolean flag = false;
        try {
            qysswjXxzxTXtUser = new QysswjXxzxTXtUser();
            qysswjXxzxTXtUser.setUsername(username);
            qysswjXxzxTXtUser.setPassword(password);
            qysswjXxzxTXtUser.setCellphone(cellphone);
            qysswjXxzxTXtUser.setTruename(truename);
            qysswjXxzxTXtUser.setId(id);

            qysswjXxzxTXtUserService.update(qysswjXxzxTXtUser);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return flag;
    }

    @GetMapping (value = "insertUser")
    @ResponseBody
    @ApiOperation (value = "新增用户信息", notes = "插入成功后，返回成功标记")
    @ApiImplicitParams (
            {
                    @ApiImplicitParam (name = "username", value = "用户名", required = true, paramType = "query"),
                    @ApiImplicitParam (name = "password", value = "密码", required = true, paramType = "query"),
                    @ApiImplicitParam (name = "cellphone", value = "电话号码", required = true, paramType = "query"),
                    @ApiImplicitParam (name = "truename", value = "真实姓名", required = true, paramType = "query"),
            }
    )
    @ApiResponse (code = 400, message = "参数没有填好", response = String.class)
    public boolean insertUser(@RequestParam (required = true) String username,
                              @RequestParam (required = true) String password,
                              @RequestParam (required = true) String cellphone,
                              @RequestParam (required = true) String truename) {
        boolean flag = false;
        try {
            qysswjXxzxTXtUser = new QysswjXxzxTXtUser();
            qysswjXxzxTXtUser.setUsername(username);
            qysswjXxzxTXtUser.setPassword(password);
            qysswjXxzxTXtUser.setCellphone(cellphone);
            qysswjXxzxTXtUser.setTruename(truename);

            qysswjXxzxTXtUserService.insert(qysswjXxzxTXtUser);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    @GetMapping (value = "deleteUser")
    @ResponseBody
    @ApiOperation (value = "删除用户信息", notes = "删除成功后，返回成功标记")
    @ApiImplicitParam (name = "ids", value = "id字符串，格式为：id1,id2,idn", required = true, paramType = "query")
    @ApiResponse (code = 400, message = "参数没有填好", response = String.class)
    public boolean deleteUser(@RequestParam (required = true) String ids) {
        boolean flag = false;
        try {
            String idArr[] = ids.split(",");
            List<String> idList = new ArrayList<>();
            idList = Arrays.asList(idArr);
            qysswjXxzxTXtUserService.deleteById(idList);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

}