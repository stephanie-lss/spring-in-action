package com.spittr.controller;

import com.spittr.dao.SpittleRepository;
import com.spittr.pojo.Spittle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

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

    @RequestMapping(method = RequestMethod.GET)
    public String spittles(Model model) {
        List<Spittle> spittleList = spittleRepository.findSpittles(Long.MAX_VALUE, 20);
        model.addAllAttributes(spittleList);
        return "spittles";
    }
}
