package com.ccbs.am.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ccbs.am.service.AmRoleUserInfoService;
import com.ccbs.am.domain.AmRoleUserInfo;
import com.ccbs.am.domain.AmRoleUserInfoKey;
@RestController
@RequestMapping("/ccbs/AmRoleUserInfo")
public class AmRoleUserInfoController {
@Autowired
private AmRoleUserInfoService amRoleUserInfoService;
@RequestMapping("/deleteByPrimaryKey")
public     int deleteByPrimaryKey(AmRoleUserInfoKey key){
return amRoleUserInfoService.deleteByPrimaryKey(key);
}
@RequestMapping("/insert")
public     int insert(AmRoleUserInfo record){
return amRoleUserInfoService.insert(record);
}
@RequestMapping("/insertSelective")
public     int insertSelective(AmRoleUserInfo record){
return amRoleUserInfoService.insertSelective(record);
}
@RequestMapping("/selectByPrimaryKey")
public     AmRoleUserInfo selectByPrimaryKey(AmRoleUserInfoKey key){
return amRoleUserInfoService.selectByPrimaryKey(key);
}
@RequestMapping("/updateByPrimaryKeySelective")
public     int updateByPrimaryKeySelective(AmRoleUserInfo record){
return amRoleUserInfoService.updateByPrimaryKeySelective(record);
}
@RequestMapping("/updateByPrimaryKey")
public     int updateByPrimaryKey(AmRoleUserInfo record){
return amRoleUserInfoService.updateByPrimaryKey(record);
}

}