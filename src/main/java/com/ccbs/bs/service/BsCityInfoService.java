package com.ccbs.bs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ccbs.bs.dao.BsCityInfoMapper;
import com.ccbs.bs.domain.BsCityInfo;
@Service
public class BsCityInfoService {
@Autowired
private BsCityInfoMapper bsCityInfoMapper;
public     int deleteByPrimaryKey(String numCity){
return bsCityInfoMapper.deleteByPrimaryKey(numCity);
}
public     int insert(BsCityInfo record){
return bsCityInfoMapper.insert(record);
}
public     int insertSelective(BsCityInfo record){
return bsCityInfoMapper.insertSelective(record);
}
public     BsCityInfo selectByPrimaryKey(String numCity){
return bsCityInfoMapper.selectByPrimaryKey(numCity);
}
public     int updateByPrimaryKeySelective(BsCityInfo record){
return bsCityInfoMapper.updateByPrimaryKeySelective(record);
}
public     int updateByPrimaryKey(BsCityInfo record){
return bsCityInfoMapper.updateByPrimaryKey(record);
}

}