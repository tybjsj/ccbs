package com.ccbs.am.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ccbs.am.dao.AmUserInfoMapper;
import com.ccbs.am.domain.AmUserInfo;
@Service
public class AmUserInfoService {
@Autowired
private AmUserInfoMapper amUserInfoMapper;
public     int deleteByPrimaryKey(String numUserid){
return amUserInfoMapper.deleteByPrimaryKey(numUserid);
}
public     int insert(AmUserInfo record){
return amUserInfoMapper.insert(record);
}
public     int insertSelective(AmUserInfo record){
return amUserInfoMapper.insertSelective(record);
}
public     AmUserInfo selectByPrimaryKey(String numUserid){
return amUserInfoMapper.selectByPrimaryKey(numUserid);
}
public     int updateByPrimaryKeySelective(AmUserInfo record){
return amUserInfoMapper.updateByPrimaryKeySelective(record);
}
public     int updateByPrimaryKeyWithBLOBs(AmUserInfo record){
return amUserInfoMapper.updateByPrimaryKeyWithBLOBs(record);
}
public     int updateByPrimaryKey(AmUserInfo record){
return amUserInfoMapper.updateByPrimaryKey(record);
}

}