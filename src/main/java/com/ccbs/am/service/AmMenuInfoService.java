package com.ccbs.am.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ccbs.am.dao.AmMenuInfoMapper;
import com.ccbs.am.domain.AmMenuInfo;
@Service
public class AmMenuInfoService {
@Autowired
private AmMenuInfoMapper amMenuInfoMapper;
public     int deleteByPrimaryKey(String numMenuid){
return amMenuInfoMapper.deleteByPrimaryKey(numMenuid);
}
public     int insert(AmMenuInfo record){
return amMenuInfoMapper.insert(record);
}
public     int insertSelective(AmMenuInfo record){
return amMenuInfoMapper.insertSelective(record);
}
public     AmMenuInfo selectByPrimaryKey(String numMenuid){
return amMenuInfoMapper.selectByPrimaryKey(numMenuid);
}
public     int updateByPrimaryKeySelective(AmMenuInfo record){
return amMenuInfoMapper.updateByPrimaryKeySelective(record);
}
public     int updateByPrimaryKey(AmMenuInfo record){
return amMenuInfoMapper.updateByPrimaryKey(record);
}

}