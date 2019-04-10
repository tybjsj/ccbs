package com.ccbs.am.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ccbs.am.dao.AmPremInfoMapper;
import com.ccbs.am.domain.AmPremInfo;
@Service
public class AmPremInfoService {
@Autowired
private AmPremInfoMapper amPremInfoMapper;
public     int deleteByPrimaryKey(String numPremid){
return amPremInfoMapper.deleteByPrimaryKey(numPremid);
}
public     int insert(AmPremInfo record){
return amPremInfoMapper.insert(record);
}
public     int insertSelective(AmPremInfo record){
return amPremInfoMapper.insertSelective(record);
}
public     AmPremInfo selectByPrimaryKey(String numPremid){
return amPremInfoMapper.selectByPrimaryKey(numPremid);
}
public     int updateByPrimaryKeySelective(AmPremInfo record){
return amPremInfoMapper.updateByPrimaryKeySelective(record);
}
public     int updateByPrimaryKey(AmPremInfo record){
return amPremInfoMapper.updateByPrimaryKey(record);
}

}