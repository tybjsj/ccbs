package com.ccbs.bs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ccbs.bs.service.BsFactoryInfoService;
import com.ccbs.bs.domain.BsFactoryInfo;
@RestController
@RequestMapping("/ccbs/BsFactoryInfo")
public class BsFactoryInfoController {
@Autowired
private BsFactoryInfoService bsFactoryInfoService;
@RequestMapping("/deleteByPrimaryKey")
public     int deleteByPrimaryKey(String numFacId){
return bsFactoryInfoService.deleteByPrimaryKey(numFacId);
}
@RequestMapping("/insert")
public     int insert(BsFactoryInfo record){
return bsFactoryInfoService.insert(record);
}
@RequestMapping("/insertSelective")
public     int insertSelective(BsFactoryInfo record){
return bsFactoryInfoService.insertSelective(record);
}
@RequestMapping("/selectByPrimaryKey")
public     BsFactoryInfo selectByPrimaryKey(String numFacId){
return bsFactoryInfoService.selectByPrimaryKey(numFacId);
}
@RequestMapping("/updateByPrimaryKeySelective")
public     int updateByPrimaryKeySelective(BsFactoryInfo record){
return bsFactoryInfoService.updateByPrimaryKeySelective(record);
}
@RequestMapping("/updateByPrimaryKey")
public     int updateByPrimaryKey(BsFactoryInfo record){
return bsFactoryInfoService.updateByPrimaryKey(record);
}

}