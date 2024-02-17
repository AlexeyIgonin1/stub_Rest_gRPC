package com.stub.stub_Rest_gRPC.controllers;


import com.stub.stub_Rest_gRPC.utilit.Cfg;
import com.stub.stub_Rest_gRPC.utilit.CfgTwo;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/admin/response")
    public String resposeForm(Model model) {
        Cfg cfg = new Cfg();
        System.out.println(cfg.getEditMapResponse());
        model.addAttribute("cfg", cfg);
        return "responseForm";
    }

    @PostMapping("/admin/response")
    public String responseSubmit(@ModelAttribute Cfg cfg, Model model) {
        Cfg.mapResponse = cfg.getEditMapResponse();
        model.addAttribute("cfg", cfg);
        return "responseSubmit";
    }

    @GetMapping("/admin/enable")
    public String enableForm(Model model) {
        Cfg cfg = new Cfg();
        model.addAttribute("cfg", cfg);
        return "enableForm";
    }

    @PostMapping("/admin/enable")
    public String enableSubmit(@ModelAttribute Cfg cfg, Model model) {
        Cfg.mapEnable = cfg.getEditMapEnable();
        model.addAttribute("cfg", cfg);
        return "enableSubmit";
    }

    @GetMapping("/admin/response/two")
    public String resposeFormTwo(Model model) {
        CfgTwo cfgTwo = new CfgTwo();
        System.out.println(cfgTwo.getEditMapResponseTwo());
        model.addAttribute("cfgTwo", cfgTwo);
        return "responseFormTwo";
    }

    @PostMapping("/admin/response/two")
    public String responseSubmitTwo(@ModelAttribute CfgTwo cfgTwo, Model model) {
        CfgTwo.mapResponseTwo = cfgTwo.getEditMapResponseTwo();
        model.addAttribute("cfgTwo", cfgTwo);
        return "responseSubmitTwo";
    }

    @GetMapping("/admin/enable/two")
    public String enableFormTwo(Model model) {
        CfgTwo cfgTwo = new CfgTwo();
        model.addAttribute("cfgTwo", cfgTwo);
        return "enableFormTwo";
    }

    @PostMapping("/admin/enable/two")
    public String enableSubmitTwo(@ModelAttribute CfgTwo cfgTwo, Model model) {
        CfgTwo.mapEnableTwo = cfgTwo.getEditMapEnableTwo();
        model.addAttribute("cfgTwo", cfgTwo);
        return "enableSubmitTwo";

    }


}
