package com.spittr.controller;

import com.spittr.dao.SpittleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author LiSheng
 * @date 2020/12/8 21:26
 */
@Controller
@RequestMapping("/spittles")
public class SpittleController {

    private SpittleRepository spittleRepository;

    @Autowired
    public SpittleController(SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }

}
