package com.refsys.adminweb.repository;

import com.refsys.adminweb.domain.Member;
import java.util.Optional;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MemberMapper {

	void save(Member member);

	Optional<Member> findById(@Param("id") Long id);


}
