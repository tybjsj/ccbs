package com.ccbs.bs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ccbs.bs.service.BsCityInfoService;
import com.ccbs.bs.domain.BsCityInfo;
@RestController
@RequestMapping("/ccbs/BsCityInfo")
public class BsCityInfoController {
@Autowired
private BsCityInfoService bsCityInfoService;
@RequestMapping("/deleteByPrimaryKey")
public     int deleteByPrimaryKey(String numCity){
return bsCityInfoService.deleteByPrimaryKey(numCity);
}
@RequestMapping("/insert")
public     int insert(BsCityInfo record){
return bsCityInfoService.insert(record);
}
@RequestMapping("/insertSelective")
public     int insertSelective(BsCityInfo record){
return bsCityInfoService.insertSelective(record);
}
@RequestMapping("/selectByPrimaryKey")
public     BsCityInfo selectByPrimaryKey(String numCity){
return bsCityInfoService.selectByPrimaryKey(numCity);
}
@RequestMapping("/updateByPrimaryKeySelective")
public     int updateByPrimaryKeySelective(BsCityInfo record){
return bsCityInfoService.updateByPrimaryKeySelective(record);
}
@RequestMapping("/updateByPrimaryKey")
public     int updateByPrimaryKey(BsCityInfo record){
return bsCityInfoService.updateByPrimaryKey(record);
}

}