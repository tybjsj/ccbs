package com.ccbs.am.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ccbs.am.service.AmPremInfoService;
import com.ccbs.am.domain.AmPremInfo;
@RestController
@RequestMapping("/ccbs/AmPremInfo")
public class AmPremInfoController {
@Autowired
private AmPremInfoService amPremInfoService;
@RequestMapping("/deleteByPrimaryKey")
public     int deleteByPrimaryKey(String numPremid){
return amPremInfoService.deleteByPrimaryKey(numPremid);
}
@RequestMapping("/insert")
public     int insert(AmPremInfo record){
return amPremInfoService.insert(record);
}
@RequestMapping("/insertSelective")
public     int insertSelective(AmPremInfo record){
return amPremInfoService.insertSelective(record);
}
@RequestMapping("/selectByPrimaryKey")
public     AmPremInfo selectByPrimaryKey(String numPremid){
return amPremInfoService.selectByPrimaryKey(numPremid);
}
@RequestMapping("/updateByPrimaryKeySelective")
public     int updateByPrimaryKeySelective(AmPremInfo record){
return amPremInfoService.updateByPrimaryKeySelective(record);
}
@RequestMapping("/updateByPrimaryKey")
public     int updateByPrimaryKey(AmPremInfo record){
return amPremInfoService.updateByPrimaryKey(record);
}

}