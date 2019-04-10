package com.ccbs.bs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ccbs.bs.service.BsNoticeInfoService;
import com.ccbs.bs.domain.BsNoticeInfo;
import com.ccbs.bs.domain.BsNoticeInfoKey;
@RestController
@RequestMapping("/ccbs/BsNoticeInfo")
public class BsNoticeInfoController {
@Autowired
private BsNoticeInfoService bsNoticeInfoService;
@RequestMapping("/deleteByPrimaryKey")
public     int deleteByPrimaryKey(BsNoticeInfoKey key){
return bsNoticeInfoService.deleteByPrimaryKey(key);
}
@RequestMapping("/insert")
public     int insert(BsNoticeInfo record){
return bsNoticeInfoService.insert(record);
}
@RequestMapping("/insertSelective")
public     int insertSelective(BsNoticeInfo record){
return bsNoticeInfoService.insertSelective(record);
}
@RequestMapping("/selectByPrimaryKey")
public     BsNoticeInfo selectByPrimaryKey(BsNoticeInfoKey key){
return bsNoticeInfoService.selectByPrimaryKey(key);
}
@RequestMapping("/updateByPrimaryKeySelective")
public     int updateByPrimaryKeySelective(BsNoticeInfo record){
return bsNoticeInfoService.updateByPrimaryKeySelective(record);
}
@RequestMapping("/updateByPrimaryKey")
public     int updateByPrimaryKey(BsNoticeInfo record){
return bsNoticeInfoService.updateByPrimaryKey(record);
}

}