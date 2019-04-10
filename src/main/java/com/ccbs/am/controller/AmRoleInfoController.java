package com.ccbs.am.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ccbs.am.service.AmRoleInfoService;
import com.ccbs.am.domain.AmRoleInfo;
@RestController
@RequestMapping("/ccbs/AmRoleInfo")
public class AmRoleInfoController {
@Autowired
private AmRoleInfoService amRoleInfoService;
@RequestMapping("/deleteByPrimaryKey")
public     int deleteByPrimaryKey(String numRoleid){
return amRoleInfoService.deleteByPrimaryKey(numRoleid);
}
@RequestMapping("/insert")
public     int insert(AmRoleInfo record){
return amRoleInfoService.insert(record);
}
@RequestMapping("/insertSelective")
public     int insertSelective(AmRoleInfo record){
return amRoleInfoService.insertSelective(record);
}
@RequestMapping("/selectByPrimaryKey")
public     AmRoleInfo selectByPrimaryKey(String numRoleid){
return amRoleInfoService.selectByPrimaryKey(numRoleid);
}
@RequestMapping("/updateByPrimaryKeySelective")
public     int updateByPrimaryKeySelective(AmRoleInfo record){
return amRoleInfoService.updateByPrimaryKeySelective(record);
}
@RequestMapping("/updateByPrimaryKey")
public     int updateByPrimaryKey(AmRoleInfo record){
return amRoleInfoService.updateByPrimaryKey(record);
}

}