package com.ccbs.bs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ccbs.bs.dao.BsInviteInfoMapper;
import com.ccbs.bs.domain.BsInviteInfo;
@Service
public class BsInviteInfoService {
@Autowired
private BsInviteInfoMapper bsInviteInfoMapper;
public     int deleteByPrimaryKey(String numInvite){
return bsInviteInfoMapper.deleteByPrimaryKey(numInvite);
}
public     int insert(BsInviteInfo record){
return bsInviteInfoMapper.insert(record);
}
public     int insertSelective(BsInviteInfo record){
return bsInviteInfoMapper.insertSelective(record);
}
public     BsInviteInfo selectByPrimaryKey(String numInvite){
return bsInviteInfoMapper.selectByPrimaryKey(numInvite);
}
public     int updateByPrimaryKeySelective(BsInviteInfo record){
return bsInviteInfoMapper.updateByPrimaryKeySelective(record);
}
public     int updateByPrimaryKey(BsInviteInfo record){
return bsInviteInfoMapper.updateByPrimaryKey(record);
}

}