package com.ccbs.am.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ccbs.am.service.AmPremRoleInfoService;
import com.ccbs.am.domain.AmPremRoleInfo;
import com.ccbs.am.domain.AmPremRoleInfoKey;
@RestController
@RequestMapping("/ccbs/AmPremRoleInfo")
public class AmPremRoleInfoController {
@Autowired
private AmPremRoleInfoService amPremRoleInfoService;
@RequestMapping("/deleteByPrimaryKey")
public     int deleteByPrimaryKey(AmPremRoleInfoKey key){
return amPremRoleInfoService.deleteByPrimaryKey(key);
}
@RequestMapping("/insert")
public     int insert(AmPremRoleInfo record){
return amPremRoleInfoService.insert(record);
}
@RequestMapping("/insertSelective")
public     int insertSelective(AmPremRoleInfo record){
return amPremRoleInfoService.insertSelective(record);
}
@RequestMapping("/selectByPrimaryKey")
public     AmPremRoleInfo selectByPrimaryKey(AmPremRoleInfoKey key){
return amPremRoleInfoService.selectByPrimaryKey(key);
}
@RequestMapping("/updateByPrimaryKeySelective")
public     int updateByPrimaryKeySelective(AmPremRoleInfo record){
return amPremRoleInfoService.updateByPrimaryKeySelective(record);
}
@RequestMapping("/updateByPrimaryKey")
public     int updateByPrimaryKey(AmPremRoleInfo record){
return amPremRoleInfoService.updateByPrimaryKey(record);
}

}