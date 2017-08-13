package com.kiran.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kiran.model.Credit;
import com.kiran.model.Reward;
import com.kiran.model.Voucher;
import com.kiran.service.RewardsService;

@RestController
@RequestMapping("/rewards")
public class RewardsController {

	@Autowired
	RewardsService rewardService;

	@RequestMapping(method = RequestMethod.GET, path = "/getrewardsbyperson", produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<List<Reward>> getRewardsByPerson() {
		// Created a static list of Vouchers
		List<Voucher> voucherList = Arrays.asList(new Voucher("V2378578346", 1200, "INR", "Drew", "Barrymore"),
				new Voucher("V183240062", 5, "USD", "Johnny", "Depp"),
				new Voucher("V45708293", 500, "INR", "Drew", "Barrymore"),
				new Voucher("V1106", 60, "INR", "Bradd", "Pitt"));
		// Created a static list of Credits
		List<Credit> creditList = Arrays.asList(new Credit("C072341", 100, "Drew", "Barrymore"),
				new Credit("C3475634", 50, "Johnny", "Depp"), new Credit("C34857", 10, "Drew", "Barrymore"));
		List<Reward> rewards = rewardService.getRewardsByPerson(voucherList, creditList);
		return new ResponseEntity<List<Reward>>(rewards, HttpStatus.OK);
	}

}
