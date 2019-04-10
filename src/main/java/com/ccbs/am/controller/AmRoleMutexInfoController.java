package com.ccbs.am.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ccbs.am.service.AmRoleMutexInfoService;
import com.ccbs.am.domain.AmRoleMutexInfo;
import com.ccbs.am.domain.AmRoleMutexInfoKey;
@RestController
@RequestMapping("/ccbs/AmRoleMutexInfo")
public class AmRoleMutexInfoController {
@Autowired
private AmRoleMutexInfoService amRoleMutexInfoService;
@RequestMapping("/deleteByPrimaryKey")
public     int deleteByPrimaryKey(AmRoleMutexInfoKey key){
return amRoleMutexInfoService.deleteByPrimaryKey(key);
}
@RequestMapping("/insert")
public     int insert(AmRoleMutexInfo record){
return amRoleMutexInfoService.insert(record);
}
@RequestMapping("/insertSelective")
public     int insertSelective(AmRoleMutexInfo record){
return amRoleMutexInfoService.insertSelective(record);
}
@RequestMapping("/selectByPrimaryKey")
public     AmRoleMutexInfo selectByPrimaryKey(AmRoleMutexInfoKey key){
return amRoleMutexInfoService.selectByPrimaryKey(key);
}
@RequestMapping("/updateByPrimaryKeySelective")
public     int updateByPrimaryKeySelective(AmRoleMutexInfo record){
return amRoleMutexInfoService.updateByPrimaryKeySelective(record);
}
@RequestMapping("/updateByPrimaryKey")
public     int updateByPrimaryKey(AmRoleMutexInfo record){
return amRoleMutexInfoService.updateByPrimaryKey(record);
}

}