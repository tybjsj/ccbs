package com.ccbs.am.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ccbs.am.service.AmMenuInfoService;
import com.ccbs.am.domain.AmMenuInfo;
@RestController
@RequestMapping("/ccbs/AmMenuInfo")
public class AmMenuInfoController {
@Autowired
private AmMenuInfoService amMenuInfoService;
@RequestMapping("/deleteByPrimaryKey")
public     int deleteByPrimaryKey(String numMenuid){
return amMenuInfoService.deleteByPrimaryKey(numMenuid);
}
@RequestMapping("/insert")
public     int insert(AmMenuInfo record){
return amMenuInfoService.insert(record);
}
@RequestMapping("/insertSelective")
public     int insertSelective(AmMenuInfo record){
return amMenuInfoService.insertSelective(record);
}
@RequestMapping("/selectByPrimaryKey")
public     AmMenuInfo selectByPrimaryKey(String numMenuid){
return amMenuInfoService.selectByPrimaryKey(numMenuid);
}
@RequestMapping("/updateByPrimaryKeySelective")
public     int updateByPrimaryKeySelective(AmMenuInfo record){
return amMenuInfoService.updateByPrimaryKeySelective(record);
}
@RequestMapping("/updateByPrimaryKey")
public     int updateByPrimaryKey(AmMenuInfo record){
return amMenuInfoService.updateByPrimaryKey(record);
}

}