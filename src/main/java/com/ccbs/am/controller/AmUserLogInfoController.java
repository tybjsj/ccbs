package com.ccbs.am.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ccbs.am.service.AmUserLogInfoService;
import com.ccbs.am.domain.AmUserLogInfo;
import com.ccbs.am.domain.AmUserLogInfoKey;
@RestController
@RequestMapping("/ccbs/AmUserLogInfo")
public class AmUserLogInfoController {
@Autowired
private AmUserLogInfoService amUserLogInfoService;
@RequestMapping("/deleteByPrimaryKey")
public     int deleteByPrimaryKey(AmUserLogInfoKey key){
return amUserLogInfoService.deleteByPrimaryKey(key);
}
@RequestMapping("/insert")
public     int insert(AmUserLogInfo record){
return amUserLogInfoService.insert(record);
}
@RequestMapping("/insertSelective")
public     int insertSelective(AmUserLogInfo record){
return amUserLogInfoService.insertSelective(record);
}
@RequestMapping("/selectByPrimaryKey")
public     AmUserLogInfo selectByPrimaryKey(AmUserLogInfoKey key){
return amUserLogInfoService.selectByPrimaryKey(key);
}
@RequestMapping("/updateByPrimaryKeySelective")
public     int updateByPrimaryKeySelective(AmUserLogInfo record){
return amUserLogInfoService.updateByPrimaryKeySelective(record);
}
@RequestMapping("/updateByPrimaryKey")
public     int updateByPrimaryKey(AmUserLogInfo record){
return amUserLogInfoService.updateByPrimaryKey(record);
}

}