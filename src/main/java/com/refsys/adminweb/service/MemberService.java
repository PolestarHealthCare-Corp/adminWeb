package com.refsys.adminweb.service;

import com.refsys.adminweb.domain.Member;
import com.refsys.adminweb.repository.MemberRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberService {

	private final MemberRepository memberRepository;

	public Member save(Member member) {
		return memberRepository.save(member);
	}

	public Optional<Member> findById(Long id) {
		return memberRepository.findById(id);
	}


}
