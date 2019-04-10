package com.ccbs.bs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ccbs.bs.service.BsOvDtalInfoService;
import com.ccbs.bs.domain.BsOvDtalInfo;
import com.ccbs.bs.domain.BsOvDtalInfoKey;
@RestController
@RequestMapping("/ccbs/BsOvDtalInfo")
public class BsOvDtalInfoController {
@Autowired
private BsOvDtalInfoService bsOvDtalInfoService;
@RequestMapping("/deleteByPrimaryKey")
public     int deleteByPrimaryKey(BsOvDtalInfoKey key){
return bsOvDtalInfoService.deleteByPrimaryKey(key);
}
@RequestMapping("/insert")
public     int insert(BsOvDtalInfo record){
return bsOvDtalInfoService.insert(record);
}
@RequestMapping("/insertSelective")
public     int insertSelective(BsOvDtalInfo record){
return bsOvDtalInfoService.insertSelective(record);
}
@RequestMapping("/selectByPrimaryKey")
public     BsOvDtalInfo selectByPrimaryKey(BsOvDtalInfoKey key){
return bsOvDtalInfoService.selectByPrimaryKey(key);
}
@RequestMapping("/updateByPrimaryKeySelective")
public     int updateByPrimaryKeySelective(BsOvDtalInfo record){
return bsOvDtalInfoService.updateByPrimaryKeySelective(record);
}
@RequestMapping("/updateByPrimaryKey")
public     int updateByPrimaryKey(BsOvDtalInfo record){
return bsOvDtalInfoService.updateByPrimaryKey(record);
}

}