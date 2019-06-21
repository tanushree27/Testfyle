package com.test.details.controller;

import com.test.details.model.BankDetails;
import com.test.details.pageinterface.OffsetLimitRequest;
import com.test.details.repository.BankDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Maincontroller {

    @Autowired
    BankDetailsRepository bankDetailsRepository;

    @RequestMapping("/")
    public String home() {
        return "Spring boot is working!";
    }

    @GetMapping("/bankDetails/{ifsc}")
    public List<BankDetails> getBankDetails(Model model, @PathVariable("ifsc") String ifsc, @RequestParam(value="offset") int offset,
                                            @RequestParam(value="limit") int limit){
        List<BankDetails> bankDetailsList = new ArrayList<>();
        bankDetailsList = bankDetailsRepository.findByIfsc(ifsc, offset, limit);
        model.addAttribute("ifsc", ifsc);
        model.addAttribute("BankDetailsList",bankDetailsList);
        return bankDetailsList;
    }

    @GetMapping("/bankDetails/{bankname}/{city}")
    public List<BankDetails> getBankDetails(Model model, @PathVariable("bankname") String bankname, @PathVariable("city") String city, @RequestParam(value="offset") int offset,
                                            @RequestParam(value="limit") int limit){
        List<BankDetails> bankDetailsList;
        System.out.println("offset: "+offset+" and Limit: "+limit);
       /* bankDetailsList = bankDetailsRepository.findBybanknameAndCity(bankname, city, offset, limit);*/
        bankDetailsList = bankDetailsRepository.findByBanknameAndCity(bankname, city, new OffsetLimitRequest(offset, limit)).getContent();
        System.out.println("offset: "+offset+" and Limit: "+limit);
        return bankDetailsList;
    }


}
