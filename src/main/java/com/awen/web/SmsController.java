package com.awen.web;

import com.awen.customer.SmsCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author : Liu Awen
 * @create : 2020-03-23
 * @describe:
 */
@Controller
public class SmsController {

    @Autowired
    private SmsCustomer smsCustomer;

    @RequestMapping("/sendSms")
    public String sendSms(@RequestParam ("phoneNum") String phoneNum){
        smsCustomer.sendVerifyCode(phoneNum);
        System.out.println("发送短信成功："+phoneNum);
        return "redirect:/Message";
    }
}
