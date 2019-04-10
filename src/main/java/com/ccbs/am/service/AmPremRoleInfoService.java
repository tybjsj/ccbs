package com.ccbs.am.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ccbs.am.dao.AmPremRoleInfoMapper;
import com.ccbs.am.domain.AmPremRoleInfo;
import com.ccbs.am.domain.AmPremRoleInfoKey;
@Service
public class AmPremRoleInfoService {
@Autowired
private AmPremRoleInfoMapper amPremRoleInfoMapper;
public     int deleteByPrimaryKey(AmPremRoleInfoKey key){
return amPremRoleInfoMapper.deleteByPrimaryKey(key);
}
public     int insert(AmPremRoleInfo record){
return amPremRoleInfoMapper.insert(record);
}
public     int insertSelective(AmPremRoleInfo record){
return amPremRoleInfoMapper.insertSelective(record);
}
public     AmPremRoleInfo selectByPrimaryKey(AmPremRoleInfoKey key){
return amPremRoleInfoMapper.selectByPrimaryKey(key);
}
public     int updateByPrimaryKeySelective(AmPremRoleInfo record){
return amPremRoleInfoMapper.updateByPrimaryKeySelective(record);
}
public     int updateByPrimaryKey(AmPremRoleInfo record){
return amPremRoleInfoMapper.updateByPrimaryKey(record);
}

}