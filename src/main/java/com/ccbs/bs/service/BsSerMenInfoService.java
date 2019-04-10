package com.ccbs.bs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ccbs.bs.dao.BsSerMenInfoMapper;
import com.ccbs.bs.domain.BsSerMenInfo;
import com.ccbs.bs.domain.BsSerMenInfoKey;
@Service
public class BsSerMenInfoService {
@Autowired
private BsSerMenInfoMapper bsSerMenInfoMapper;
public     int deleteByPrimaryKey(BsSerMenInfoKey key){
return bsSerMenInfoMapper.deleteByPrimaryKey(key);
}
public     int insert(BsSerMenInfo record){
return bsSerMenInfoMapper.insert(record);
}
public     int insertSelective(BsSerMenInfo record){
return bsSerMenInfoMapper.insertSelective(record);
}
public     BsSerMenInfo selectByPrimaryKey(BsSerMenInfoKey key){
return bsSerMenInfoMapper.selectByPrimaryKey(key);
}
public     int updateByPrimaryKeySelective(BsSerMenInfo record){
return bsSerMenInfoMapper.updateByPrimaryKeySelective(record);
}
public     int updateByPrimaryKey(BsSerMenInfo record){
return bsSerMenInfoMapper.updateByPrimaryKey(record);
}

}