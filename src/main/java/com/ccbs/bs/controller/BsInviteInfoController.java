package com.ccbs.bs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ccbs.bs.service.BsInviteInfoService;
import com.ccbs.bs.domain.BsInviteInfo;
@RestController
@RequestMapping("/ccbs/BsInviteInfo")
public class BsInviteInfoController {
@Autowired
private BsInviteInfoService bsInviteInfoService;
@RequestMapping("/deleteByPrimaryKey")
public     int deleteByPrimaryKey(String numInvite){
return bsInviteInfoService.deleteByPrimaryKey(numInvite);
}
@RequestMapping("/insert")
public     int insert(BsInviteInfo record){
return bsInviteInfoService.insert(record);
}
@RequestMapping("/insertSelective")
public     int insertSelective(BsInviteInfo record){
return bsInviteInfoService.insertSelective(record);
}
@RequestMapping("/selectByPrimaryKey")
public     BsInviteInfo selectByPrimaryKey(String numInvite){
return bsInviteInfoService.selectByPrimaryKey(numInvite);
}
@RequestMapping("/updateByPrimaryKeySelective")
public     int updateByPrimaryKeySelective(BsInviteInfo record){
return bsInviteInfoService.updateByPrimaryKeySelective(record);
}
@RequestMapping("/updateByPrimaryKey")
public     int updateByPrimaryKey(BsInviteInfo record){
return bsInviteInfoService.updateByPrimaryKey(record);
}

}