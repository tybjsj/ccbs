package com.ccbs.am.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ccbs.am.service.AmUserInfoService;
import com.ccbs.am.domain.AmUserInfo;
@RestController
@RequestMapping("/ccbs/AmUserInfo")
public class AmUserInfoController {
@Autowired
private AmUserInfoService amUserInfoService;
@RequestMapping("/deleteByPrimaryKey")
public     int deleteByPrimaryKey(String numUserid){
return amUserInfoService.deleteByPrimaryKey(numUserid);
}
@RequestMapping("/insert")
public     int insert(AmUserInfo record){
return amUserInfoService.insert(record);
}
@RequestMapping("/insertSelective")
public     int insertSelective(AmUserInfo record){
return amUserInfoService.insertSelective(record);
}
@RequestMapping("/selectByPrimaryKey")
public     AmUserInfo selectByPrimaryKey(String numUserid){
return amUserInfoService.selectByPrimaryKey(numUserid);
}
@RequestMapping("/updateByPrimaryKeySelective")
public     int updateByPrimaryKeySelective(AmUserInfo record){
return amUserInfoService.updateByPrimaryKeySelective(record);
}
@RequestMapping("/updateByPrimaryKeyWithBLOBs")
public     int updateByPrimaryKeyWithBLOBs(AmUserInfo record){
return amUserInfoService.updateByPrimaryKeyWithBLOBs(record);
}
@RequestMapping("/updateByPrimaryKey")
public     int updateByPrimaryKey(AmUserInfo record){
return amUserInfoService.updateByPrimaryKey(record);
}

}