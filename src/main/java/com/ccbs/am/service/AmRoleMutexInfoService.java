package com.ccbs.am.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ccbs.am.dao.AmRoleMutexInfoMapper;
import com.ccbs.am.domain.AmRoleMutexInfo;
import com.ccbs.am.domain.AmRoleMutexInfoKey;
@Service
public class AmRoleMutexInfoService {
@Autowired
private AmRoleMutexInfoMapper amRoleMutexInfoMapper;
public     int deleteByPrimaryKey(AmRoleMutexInfoKey key){
return amRoleMutexInfoMapper.deleteByPrimaryKey(key);
}
public     int insert(AmRoleMutexInfo record){
return amRoleMutexInfoMapper.insert(record);
}
public     int insertSelective(AmRoleMutexInfo record){
return amRoleMutexInfoMapper.insertSelective(record);
}
public     AmRoleMutexInfo selectByPrimaryKey(AmRoleMutexInfoKey key){
return amRoleMutexInfoMapper.selectByPrimaryKey(key);
}
public     int updateByPrimaryKeySelective(AmRoleMutexInfo record){
return amRoleMutexInfoMapper.updateByPrimaryKeySelective(record);
}
public     int updateByPrimaryKey(AmRoleMutexInfo record){
return amRoleMutexInfoMapper.updateByPrimaryKey(record);
}

}