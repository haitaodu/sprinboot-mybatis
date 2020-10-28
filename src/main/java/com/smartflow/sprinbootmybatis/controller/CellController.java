package com.smartflow.sprinbootmybatis.controller;

import com.smartflow.sprinbootmybatis.entity.Cell;
import com.smartflow.sprinbootmybatis.service.CellService;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：tao
 * @date ：Created in 2020/10/26 22:35
 * @description：${description}
 * @modified By：
 * @version: version
 */
@Log4j2
@RestController
@RequestMapping("/Cell")
public class CellController {
    private final
    CellService cellService;

    @Autowired
    public CellController(CellService cellService) {
        this.cellService = cellService;
    }

    @GetMapping("getCellById/{id}")
    public Cell getCellById(@PathVariable int id)
    {
     return cellService.getCell(id);
    }

}
