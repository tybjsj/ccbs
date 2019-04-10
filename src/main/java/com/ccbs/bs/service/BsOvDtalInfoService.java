package com.ccbs.bs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ccbs.bs.dao.BsOvDtalInfoMapper;
import com.ccbs.bs.domain.BsOvDtalInfo;
import com.ccbs.bs.domain.BsOvDtalInfoKey;
@Service
public class BsOvDtalInfoService {
@Autowired
private BsOvDtalInfoMapper bsOvDtalInfoMapper;
public     int deleteByPrimaryKey(BsOvDtalInfoKey key){
return bsOvDtalInfoMapper.deleteByPrimaryKey(key);
}
public     int insert(BsOvDtalInfo record){
return bsOvDtalInfoMapper.insert(record);
}
public     int insertSelective(BsOvDtalInfo record){
return bsOvDtalInfoMapper.insertSelective(record);
}
public     BsOvDtalInfo selectByPrimaryKey(BsOvDtalInfoKey key){
return bsOvDtalInfoMapper.selectByPrimaryKey(key);
}
public     int updateByPrimaryKeySelective(BsOvDtalInfo record){
return bsOvDtalInfoMapper.updateByPrimaryKeySelective(record);
}
public     int updateByPrimaryKey(BsOvDtalInfo record){
return bsOvDtalInfoMapper.updateByPrimaryKey(record);
}

}