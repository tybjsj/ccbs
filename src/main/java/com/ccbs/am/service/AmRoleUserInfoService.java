package com.ccbs.am.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ccbs.am.dao.AmRoleUserInfoMapper;
import com.ccbs.am.domain.AmRoleUserInfo;
import com.ccbs.am.domain.AmRoleUserInfoKey;
@Service
public class AmRoleUserInfoService {
@Autowired
private AmRoleUserInfoMapper amRoleUserInfoMapper;
public     int deleteByPrimaryKey(AmRoleUserInfoKey key){
return amRoleUserInfoMapper.deleteByPrimaryKey(key);
}
public     int insert(AmRoleUserInfo record){
return amRoleUserInfoMapper.insert(record);
}
public     int insertSelective(AmRoleUserInfo record){
return amRoleUserInfoMapper.insertSelective(record);
}
public     AmRoleUserInfo selectByPrimaryKey(AmRoleUserInfoKey key){
return amRoleUserInfoMapper.selectByPrimaryKey(key);
}
public     int updateByPrimaryKeySelective(AmRoleUserInfo record){
return amRoleUserInfoMapper.updateByPrimaryKeySelective(record);
}
public     int updateByPrimaryKey(AmRoleUserInfo record){
return amRoleUserInfoMapper.updateByPrimaryKey(record);
}

}