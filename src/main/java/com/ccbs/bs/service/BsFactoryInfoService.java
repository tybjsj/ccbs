package com.ccbs.bs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ccbs.bs.dao.BsFactoryInfoMapper;
import com.ccbs.bs.domain.BsFactoryInfo;
@Service
public class BsFactoryInfoService {
@Autowired
private BsFactoryInfoMapper bsFactoryInfoMapper;
public     int deleteByPrimaryKey(String numFacId){
return bsFactoryInfoMapper.deleteByPrimaryKey(numFacId);
}
public     int insert(BsFactoryInfo record){
return bsFactoryInfoMapper.insert(record);
}
public     int insertSelective(BsFactoryInfo record){
return bsFactoryInfoMapper.insertSelective(record);
}
public     BsFactoryInfo selectByPrimaryKey(String numFacId){
return bsFactoryInfoMapper.selectByPrimaryKey(numFacId);
}
public     int updateByPrimaryKeySelective(BsFactoryInfo record){
return bsFactoryInfoMapper.updateByPrimaryKeySelective(record);
}
public     int updateByPrimaryKey(BsFactoryInfo record){
return bsFactoryInfoMapper.updateByPrimaryKey(record);
}

}