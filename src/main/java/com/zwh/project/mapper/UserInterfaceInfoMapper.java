package com.zwh.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zwh.zapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
 * @Entity com.zwh.project.model.entity.UserInterfaceInfo
 */
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




