package com.mage.crm.service;

import com.mage.crm.mapper.UserMapper;
import com.mage.crm.model.MessageModel;
import com.mage.crm.model.User;
import org.springframework.stereotype.Service;
import util.StringUtil;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

//    @Autowired
//    @Qualifier("userMapper")
    @Resource
    private UserMapper userMapper;

    public List<User> findAll() {
        List<User> users = userMapper.findAll();
        return users;
    }

//    @Transactional
    public void updateTrueName(Integer userId, String trueName) {

        userMapper.updateTrueName(userId, trueName);
        // int i = 1/0;
    }

    public MessageModel login(String userName,String password) {
        MessageModel messageModel = new MessageModel();
        if(StringUtil.isEmpty(userName)||StringUtil.isEmpty(password)){
            messageModel.setCode(500);
            messageModel.setMsg("用户名与密码不能为空");
      }
       User user = userMapper.getUserByUserName(userName);
      if(user==null){
          messageModel.setCode(500);
          messageModel.setMsg("用户为空");

      }
      if(!password.equals(user.getUserPwd())){
          messageModel.setCode(500);
        messageModel.setMsg("密码不正确");
      }
        return messageModel;
    }
}
