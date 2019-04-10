package com.ccbs.bs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ccbs.bs.dao.BsTypInfoMapper;
import com.ccbs.bs.domain.BsTypInfo;
@Service
public class BsTypInfoService {
@Autowired
private BsTypInfoMapper bsTypInfoMapper;
public     int deleteByPrimaryKey(String numBustyp){
return bsTypInfoMapper.deleteByPrimaryKey(numBustyp);
}
public     int insert(BsTypInfo record){
return bsTypInfoMapper.insert(record);
}
public     int insertSelective(BsTypInfo record){
return bsTypInfoMapper.insertSelective(record);
}
public     BsTypInfo selectByPrimaryKey(String numBustyp){
return bsTypInfoMapper.selectByPrimaryKey(numBustyp);
}
public     int updateByPrimaryKeySelective(BsTypInfo record){
return bsTypInfoMapper.updateByPrimaryKeySelective(record);
}
public     int updateByPrimaryKey(BsTypInfo record){
return bsTypInfoMapper.updateByPrimaryKey(record);
}

}