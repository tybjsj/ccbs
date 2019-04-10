package com.ccbs.bs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ccbs.bs.service.BsMemInfoService;
import com.ccbs.bs.domain.BsMemInfo;
@RestController
@RequestMapping("/ccbs/BsMemInfo")
public class BsMemInfoController {
@Autowired
private BsMemInfoService bsMemInfoService;
@RequestMapping("/deleteByPrimaryKey")
public     int deleteByPrimaryKey(String numSer){
return bsMemInfoService.deleteByPrimaryKey(numSer);
}
@RequestMapping("/insert")
public     int insert(BsMemInfo record){
return bsMemInfoService.insert(record);
}
@RequestMapping("/insertSelective")
public     int insertSelective(BsMemInfo record){
return bsMemInfoService.insertSelective(record);
}
@RequestMapping("/selectByPrimaryKey")
public     BsMemInfo selectByPrimaryKey(String numSer){
return bsMemInfoService.selectByPrimaryKey(numSer);
}
@RequestMapping("/updateByPrimaryKeySelective")
public     int updateByPrimaryKeySelective(BsMemInfo record){
return bsMemInfoService.updateByPrimaryKeySelective(record);
}
@RequestMapping("/updateByPrimaryKey")
public     int updateByPrimaryKey(BsMemInfo record){
return bsMemInfoService.updateByPrimaryKey(record);
}

}