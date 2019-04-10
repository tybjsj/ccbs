package com.ccbs.bs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ccbs.bs.dao.BsNoticeInfoMapper;
import com.ccbs.bs.domain.BsNoticeInfo;
import com.ccbs.bs.domain.BsNoticeInfoKey;
@Service
public class BsNoticeInfoService {
@Autowired
private BsNoticeInfoMapper bsNoticeInfoMapper;
public     int deleteByPrimaryKey(BsNoticeInfoKey key){
return bsNoticeInfoMapper.deleteByPrimaryKey(key);
}
public     int insert(BsNoticeInfo record){
return bsNoticeInfoMapper.insert(record);
}
public     int insertSelective(BsNoticeInfo record){
return bsNoticeInfoMapper.insertSelective(record);
}
public     BsNoticeInfo selectByPrimaryKey(BsNoticeInfoKey key){
return bsNoticeInfoMapper.selectByPrimaryKey(key);
}
public     int updateByPrimaryKeySelective(BsNoticeInfo record){
return bsNoticeInfoMapper.updateByPrimaryKeySelective(record);
}
public     int updateByPrimaryKey(BsNoticeInfo record){
return bsNoticeInfoMapper.updateByPrimaryKey(record);
}

}