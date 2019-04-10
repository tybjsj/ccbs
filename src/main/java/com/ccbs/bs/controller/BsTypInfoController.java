package com.ccbs.bs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ccbs.bs.service.BsTypInfoService;
import com.ccbs.bs.domain.BsTypInfo;
@RestController
@RequestMapping("/ccbs/BsTypInfo")
public class BsTypInfoController {
@Autowired
private BsTypInfoService bsTypInfoService;
@RequestMapping("/deleteByPrimaryKey")
public     int deleteByPrimaryKey(String numBustyp){
return bsTypInfoService.deleteByPrimaryKey(numBustyp);
}
@RequestMapping("/insert")
public     int insert(BsTypInfo record){
return bsTypInfoService.insert(record);
}
@RequestMapping("/insertSelective")
public     int insertSelective(BsTypInfo record){
return bsTypInfoService.insertSelective(record);
}
@RequestMapping("/selectByPrimaryKey")
public     BsTypInfo selectByPrimaryKey(String numBustyp){
return bsTypInfoService.selectByPrimaryKey(numBustyp);
}
@RequestMapping("/updateByPrimaryKeySelective")
public     int updateByPrimaryKeySelective(BsTypInfo record){
return bsTypInfoService.updateByPrimaryKeySelective(record);
}
@RequestMapping("/updateByPrimaryKey")
public     int updateByPrimaryKey(BsTypInfo record){
return bsTypInfoService.updateByPrimaryKey(record);
}

}