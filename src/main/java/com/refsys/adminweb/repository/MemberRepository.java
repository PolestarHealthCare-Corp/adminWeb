package com.refsys.adminweb.repository;

import com.refsys.adminweb.domain.Member;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
@RequiredArgsConstructor
public class MemberRepository {

	private final MemberMapper memberMapper;

	public Member save(Member member) {
		log.info("memberMapper.class={}", memberMapper.getClass());
		memberMapper.save(member);
		return member;
	}

	public Optional<Member> findById(Long id) {
		return memberMapper.findById(id);
	}

}
