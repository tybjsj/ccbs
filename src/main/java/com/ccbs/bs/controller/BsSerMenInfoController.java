package com.ccbs.bs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ccbs.bs.service.BsSerMenInfoService;
import com.ccbs.bs.domain.BsSerMenInfo;
import com.ccbs.bs.domain.BsSerMenInfoKey;
@RestController
@RequestMapping("/ccbs/BsSerMenInfo")
public class BsSerMenInfoController {
@Autowired
private BsSerMenInfoService bsSerMenInfoService;
@RequestMapping("/deleteByPrimaryKey")
public     int deleteByPrimaryKey(BsSerMenInfoKey key){
return bsSerMenInfoService.deleteByPrimaryKey(key);
}
@RequestMapping("/insert")
public     int insert(BsSerMenInfo record){
return bsSerMenInfoService.insert(record);
}
@RequestMapping("/insertSelective")
public     int insertSelective(BsSerMenInfo record){
return bsSerMenInfoService.insertSelective(record);
}
@RequestMapping("/selectByPrimaryKey")
public     BsSerMenInfo selectByPrimaryKey(BsSerMenInfoKey key){
return bsSerMenInfoService.selectByPrimaryKey(key);
}
@RequestMapping("/updateByPrimaryKeySelective")
public     int updateByPrimaryKeySelective(BsSerMenInfo record){
return bsSerMenInfoService.updateByPrimaryKeySelective(record);
}
@RequestMapping("/updateByPrimaryKey")
public     int updateByPrimaryKey(BsSerMenInfo record){
return bsSerMenInfoService.updateByPrimaryKey(record);
}

}