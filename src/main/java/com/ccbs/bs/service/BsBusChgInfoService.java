package com.ccbs.bs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ccbs.bs.dao.BsBusChgInfoMapper;
import com.ccbs.bs.domain.BsBusChgInfo;
@Service
public class BsBusChgInfoService {
@Autowired
private BsBusChgInfoMapper bsBusChgInfoMapper;
public     int deleteByPrimaryKey(String numBusId){
return bsBusChgInfoMapper.deleteByPrimaryKey(numBusId);
}
public     int insert(BsBusChgInfo record){
return bsBusChgInfoMapper.insert(record);
}
public     int insertSelective(BsBusChgInfo record){
return bsBusChgInfoMapper.insertSelective(record);
}
public     BsBusChgInfo selectByPrimaryKey(String numBusId){
return bsBusChgInfoMapper.selectByPrimaryKey(numBusId);
}
public     int updateByPrimaryKeySelective(BsBusChgInfo record){
return bsBusChgInfoMapper.updateByPrimaryKeySelective(record);
}
public     int updateByPrimaryKey(BsBusChgInfo record){
return bsBusChgInfoMapper.updateByPrimaryKey(record);
}

}