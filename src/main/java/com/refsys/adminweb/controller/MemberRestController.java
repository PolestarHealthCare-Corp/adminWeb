package com.refsys.adminweb.controller;

import com.refsys.adminweb.domain.Member;
import com.refsys.adminweb.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberRestController {

	private final MemberService memberService;

	@PostMapping("/add")
	public Member save(@RequestBody Member member) {
		return memberService.save(member);
	}

	@GetMapping("/{id}")
	public Member findById(@PathVariable("id") Long id) {
		return memberService.findById(id).get();
	}

}
