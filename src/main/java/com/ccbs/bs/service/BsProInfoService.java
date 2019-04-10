package com.ccbs.bs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ccbs.bs.dao.BsProInfoMapper;
import com.ccbs.bs.domain.BsProInfo;
@Service
public class BsProInfoService {
@Autowired
private BsProInfoMapper bsProInfoMapper;
public     int deleteByPrimaryKey(String codPro){
return bsProInfoMapper.deleteByPrimaryKey(codPro);
}
public     int insert(BsProInfo record){
return bsProInfoMapper.insert(record);
}
public     int insertSelective(BsProInfo record){
return bsProInfoMapper.insertSelective(record);
}
public     BsProInfo selectByPrimaryKey(String codPro){
return bsProInfoMapper.selectByPrimaryKey(codPro);
}
public     int updateByPrimaryKeySelective(BsProInfo record){
return bsProInfoMapper.updateByPrimaryKeySelective(record);
}
public     int updateByPrimaryKey(BsProInfo record){
return bsProInfoMapper.updateByPrimaryKey(record);
}

}