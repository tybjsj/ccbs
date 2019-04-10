package com.ccbs.bs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ccbs.bs.dao.BsIndusInfoMapper;
import com.ccbs.bs.domain.BsIndusInfo;
@Service
public class BsIndusInfoService {
@Autowired
private BsIndusInfoMapper bsIndusInfoMapper;
public     int deleteByPrimaryKey(String numIndustry){
return bsIndusInfoMapper.deleteByPrimaryKey(numIndustry);
}
public     int insert(BsIndusInfo record){
return bsIndusInfoMapper.insert(record);
}
public     int insertSelective(BsIndusInfo record){
return bsIndusInfoMapper.insertSelective(record);
}
public     BsIndusInfo selectByPrimaryKey(String numIndustry){
return bsIndusInfoMapper.selectByPrimaryKey(numIndustry);
}
public     int updateByPrimaryKeySelective(BsIndusInfo record){
return bsIndusInfoMapper.updateByPrimaryKeySelective(record);
}
public     int updateByPrimaryKey(BsIndusInfo record){
return bsIndusInfoMapper.updateByPrimaryKey(record);
}

}