package com.ccbs.am.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ccbs.am.dao.AmUserLogInfoMapper;
import com.ccbs.am.domain.AmUserLogInfo;
import com.ccbs.am.domain.AmUserLogInfoKey;
@Service
public class AmUserLogInfoService {
@Autowired
private AmUserLogInfoMapper amUserLogInfoMapper;
public     int deleteByPrimaryKey(AmUserLogInfoKey key){
return amUserLogInfoMapper.deleteByPrimaryKey(key);
}
public     int insert(AmUserLogInfo record){
return amUserLogInfoMapper.insert(record);
}
public     int insertSelective(AmUserLogInfo record){
return amUserLogInfoMapper.insertSelective(record);
}
public     AmUserLogInfo selectByPrimaryKey(AmUserLogInfoKey key){
return amUserLogInfoMapper.selectByPrimaryKey(key);
}
public     int updateByPrimaryKeySelective(AmUserLogInfo record){
return amUserLogInfoMapper.updateByPrimaryKeySelective(record);
}
public     int updateByPrimaryKey(AmUserLogInfo record){
return amUserLogInfoMapper.updateByPrimaryKey(record);
}

}