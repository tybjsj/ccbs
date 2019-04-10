package com.ccbs.am.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ccbs.am.dao.AmRoleInfoMapper;
import com.ccbs.am.domain.AmRoleInfo;
@Service
public class AmRoleInfoService {
@Autowired
private AmRoleInfoMapper amRoleInfoMapper;
public     int deleteByPrimaryKey(String numRoleid){
return amRoleInfoMapper.deleteByPrimaryKey(numRoleid);
}
public     int insert(AmRoleInfo record){
return amRoleInfoMapper.insert(record);
}
public     int insertSelective(AmRoleInfo record){
return amRoleInfoMapper.insertSelective(record);
}
public     AmRoleInfo selectByPrimaryKey(String numRoleid){
return amRoleInfoMapper.selectByPrimaryKey(numRoleid);
}
public     int updateByPrimaryKeySelective(AmRoleInfo record){
return amRoleInfoMapper.updateByPrimaryKeySelective(record);
}
public     int updateByPrimaryKey(AmRoleInfo record){
return amRoleInfoMapper.updateByPrimaryKey(record);
}

}