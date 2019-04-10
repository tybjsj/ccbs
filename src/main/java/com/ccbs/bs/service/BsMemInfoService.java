package com.ccbs.bs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ccbs.bs.dao.BsMemInfoMapper;
import com.ccbs.bs.domain.BsMemInfo;
@Service
public class BsMemInfoService {
@Autowired
private BsMemInfoMapper bsMemInfoMapper;
public     int deleteByPrimaryKey(String numSer){
return bsMemInfoMapper.deleteByPrimaryKey(numSer);
}
public     int insert(BsMemInfo record){
return bsMemInfoMapper.insert(record);
}
public     int insertSelective(BsMemInfo record){
return bsMemInfoMapper.insertSelective(record);
}
public     BsMemInfo selectByPrimaryKey(String numSer){
return bsMemInfoMapper.selectByPrimaryKey(numSer);
}
public     int updateByPrimaryKeySelective(BsMemInfo record){
return bsMemInfoMapper.updateByPrimaryKeySelective(record);
}
public     int updateByPrimaryKey(BsMemInfo record){
return bsMemInfoMapper.updateByPrimaryKey(record);
}

}