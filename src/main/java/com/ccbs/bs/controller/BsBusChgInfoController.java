package com.ccbs.bs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ccbs.bs.service.BsBusChgInfoService;
import com.ccbs.bs.domain.BsBusChgInfo;
@RestController
@RequestMapping("/ccbs/BsBusChgInfo")
public class BsBusChgInfoController {
@Autowired
private BsBusChgInfoService bsBusChgInfoService;
@RequestMapping("/deleteByPrimaryKey")
public     int deleteByPrimaryKey(String numBusId){
return bsBusChgInfoService.deleteByPrimaryKey(numBusId);
}
@RequestMapping("/insert")
public     int insert(BsBusChgInfo record){
return bsBusChgInfoService.insert(record);
}
@RequestMapping("/insertSelective")
public     int insertSelective(BsBusChgInfo record){
return bsBusChgInfoService.insertSelective(record);
}
@RequestMapping("/selectByPrimaryKey")
public     BsBusChgInfo selectByPrimaryKey(String numBusId){
return bsBusChgInfoService.selectByPrimaryKey(numBusId);
}
@RequestMapping("/updateByPrimaryKeySelective")
public     int updateByPrimaryKeySelective(BsBusChgInfo record){
return bsBusChgInfoService.updateByPrimaryKeySelective(record);
}
@RequestMapping("/updateByPrimaryKey")
public     int updateByPrimaryKey(BsBusChgInfo record){
return bsBusChgInfoService.updateByPrimaryKey(record);
}

}