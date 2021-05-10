package com.faz.springbootshiro.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.faz.springbootshiro.mapper.SysRoleMapper;
import com.faz.springbootshiro.entity.SysRole;
import com.faz.springbootshiro.service.SysRoleService;
import org.springframework.stereotype.Service;

@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {
}
