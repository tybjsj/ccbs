package com.ccbs.am.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ccbs.am.service.AmPremMenuInfoService;
import com.ccbs.am.domain.AmPremMenuInfo;
import com.ccbs.am.domain.AmPremMenuInfoKey;
@RestController
@RequestMapping("/ccbs/AmPremMenuInfo")
public class AmPremMenuInfoController {
@Autowired
private AmPremMenuInfoService amPremMenuInfoService;
@RequestMapping("/deleteByPrimaryKey")
public     int deleteByPrimaryKey(AmPremMenuInfoKey key){
return amPremMenuInfoService.deleteByPrimaryKey(key);
}
@RequestMapping("/insert")
public     int insert(AmPremMenuInfo record){
return amPremMenuInfoService.insert(record);
}
@RequestMapping("/insertSelective")
public     int insertSelective(AmPremMenuInfo record){
return amPremMenuInfoService.insertSelective(record);
}
@RequestMapping("/selectByPrimaryKey")
public     AmPremMenuInfo selectByPrimaryKey(AmPremMenuInfoKey key){
return amPremMenuInfoService.selectByPrimaryKey(key);
}
@RequestMapping("/updateByPrimaryKeySelective")
public     int updateByPrimaryKeySelective(AmPremMenuInfo record){
return amPremMenuInfoService.updateByPrimaryKeySelective(record);
}
@RequestMapping("/updateByPrimaryKey")
public     int updateByPrimaryKey(AmPremMenuInfo record){
return amPremMenuInfoService.updateByPrimaryKey(record);
}

}