package com.smartflow.sprinbootmybatis.serviceImpl;

import com.smartflow.sprinbootmybatis.entity.Cell;
import com.smartflow.sprinbootmybatis.mappper.CellMapper;
import com.smartflow.sprinbootmybatis.service.CellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：tao
 * @date ：Created in 2020/10/26 22:31
 * @description：${description}
 * @modified By：
 * @version: version
 */
@Service
public class CellServiceImpl implements CellService {
  private final
  CellMapper cellMapper;

    @Autowired
    public CellServiceImpl(CellMapper cellMapper) {
        this.cellMapper = cellMapper;
    }

    @Override
    public Cell getCell(int id) {
        return cellMapper.getCell(id);
    }
}
