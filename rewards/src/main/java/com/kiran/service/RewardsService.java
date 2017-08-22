package com.kiran.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.kiran.model.Credit;
import com.kiran.model.Reward;
import com.kiran.model.Voucher;

@Service
public class RewardsService {

	public List<Reward> getRewardsByPerson(List<Voucher> vouchers, List<Credit> credits) {

		// Voucher number vs Customer name map
		Map<String, String> vnoCustnameMap = vouchers.stream()
				.collect(Collectors.toMap(Voucher::getVoucherNumber, Voucher::getFullName));
		// Customer name vs List of Voucher numbers map
		Map<String, List<String>> custnamevnosMap = new HashMap<>();
		vnoCustnameMap.forEach((key, value) -> {
			if (!custnamevnosMap.containsKey(value)) {
				custnamevnosMap.put(value, new ArrayList<String>());
			}
			custnamevnosMap.get(value).add(key);
		});

		// Credit Id vs Customer name map
		Map<String, String> cidCustnameMap = credits.stream()
				.collect(Collectors.toMap(Credit::getCreditId, Credit::getFullName));
		// Customer name vs List of Credit Ids map
		Map<String, List<String>> custnamecidsMap = new HashMap<>();
		cidCustnameMap.forEach((key, value) -> {
			if (!custnamecidsMap.containsKey(value)) {
				custnamecidsMap.put(value, new ArrayList<String>());
			}
			custnamecidsMap.get(value).add(key);
		});

		// Get a set of customer names having Vouchers with them
		Set<String> customerNames = vouchers.stream().map(Voucher::getFullName).collect(Collectors.toSet());
		// Get the set of customer names having Credits with them, and combine
		// the two
		customerNames.addAll(credits.stream().map(Credit::getFullName).collect(Collectors.toSet()));
		List<Reward> rewards = new ArrayList<>();
		String[] name;

		// Create Reward object using the maps created above
		for (String fullname : customerNames) {
			name = fullname.split("-");
			rewards.add(new Reward(
					custnamecidsMap.containsKey(fullname) ? custnamecidsMap.get(fullname) : new ArrayList<String>(),
					custnamevnosMap.containsKey(fullname) ? custnamevnosMap.get(fullname) : new ArrayList<String>(),
					name[0], name[1]));
		}
		return rewards;
	}
}
