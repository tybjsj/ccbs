package com.ccbs.bs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ccbs.bs.service.BsProInfoService;
import com.ccbs.bs.domain.BsProInfo;
@RestController
@RequestMapping("/ccbs/BsProInfo")
public class BsProInfoController {
@Autowired
private BsProInfoService bsProInfoService;
@RequestMapping("/deleteByPrimaryKey")
public     int deleteByPrimaryKey(String codPro){
return bsProInfoService.deleteByPrimaryKey(codPro);
}
@RequestMapping("/insert")
public     int insert(BsProInfo record){
return bsProInfoService.insert(record);
}
@RequestMapping("/insertSelective")
public     int insertSelective(BsProInfo record){
return bsProInfoService.insertSelective(record);
}
@RequestMapping("/selectByPrimaryKey")
public     BsProInfo selectByPrimaryKey(String codPro){
return bsProInfoService.selectByPrimaryKey(codPro);
}
@RequestMapping("/updateByPrimaryKeySelective")
public     int updateByPrimaryKeySelective(BsProInfo record){
return bsProInfoService.updateByPrimaryKeySelective(record);
}
@RequestMapping("/updateByPrimaryKey")
public     int updateByPrimaryKey(BsProInfo record){
return bsProInfoService.updateByPrimaryKey(record);
}

}