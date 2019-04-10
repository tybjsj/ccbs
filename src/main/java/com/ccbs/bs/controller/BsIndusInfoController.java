package com.ccbs.bs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ccbs.bs.service.BsIndusInfoService;
import com.ccbs.bs.domain.BsIndusInfo;
@RestController
@RequestMapping("/ccbs/BsIndusInfo")
public class BsIndusInfoController {
@Autowired
private BsIndusInfoService bsIndusInfoService;
@RequestMapping("/deleteByPrimaryKey")
public     int deleteByPrimaryKey(String numIndustry){
return bsIndusInfoService.deleteByPrimaryKey(numIndustry);
}
@RequestMapping("/insert")
public     int insert(BsIndusInfo record){
return bsIndusInfoService.insert(record);
}
@RequestMapping("/insertSelective")
public     int insertSelective(BsIndusInfo record){
return bsIndusInfoService.insertSelective(record);
}
@RequestMapping("/selectByPrimaryKey")
public     BsIndusInfo selectByPrimaryKey(String numIndustry){
return bsIndusInfoService.selectByPrimaryKey(numIndustry);
}
@RequestMapping("/updateByPrimaryKeySelective")
public     int updateByPrimaryKeySelective(BsIndusInfo record){
return bsIndusInfoService.updateByPrimaryKeySelective(record);
}
@RequestMapping("/updateByPrimaryKey")
public     int updateByPrimaryKey(BsIndusInfo record){
return bsIndusInfoService.updateByPrimaryKey(record);
}

}