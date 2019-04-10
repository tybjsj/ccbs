package com.ccbs.am.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ccbs.am.dao.AmPremMenuInfoMapper;
import com.ccbs.am.domain.AmPremMenuInfo;
import com.ccbs.am.domain.AmPremMenuInfoKey;
@Service
public class AmPremMenuInfoService {
@Autowired
private AmPremMenuInfoMapper amPremMenuInfoMapper;
public     int deleteByPrimaryKey(AmPremMenuInfoKey key){
return amPremMenuInfoMapper.deleteByPrimaryKey(key);
}
public     int insert(AmPremMenuInfo record){
return amPremMenuInfoMapper.insert(record);
}
public     int insertSelective(AmPremMenuInfo record){
return amPremMenuInfoMapper.insertSelective(record);
}
public     AmPremMenuInfo selectByPrimaryKey(AmPremMenuInfoKey key){
return amPremMenuInfoMapper.selectByPrimaryKey(key);
}
public     int updateByPrimaryKeySelective(AmPremMenuInfo record){
return amPremMenuInfoMapper.updateByPrimaryKeySelective(record);
}
public     int updateByPrimaryKey(AmPremMenuInfo record){
return amPremMenuInfoMapper.updateByPrimaryKey(record);
}

}