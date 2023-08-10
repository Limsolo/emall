package com.project.member.dao;

import com.project.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lmf
 * @email 1902736346@qq.com
 * @date 2023-08-10 14:23:42
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
