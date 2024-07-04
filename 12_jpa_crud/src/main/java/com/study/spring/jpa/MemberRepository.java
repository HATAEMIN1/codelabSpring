package com.study.spring.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository                                     //<엔티티 타입,아이디 타입>
public interface MemberRepository extends JpaRepository<Member,Long> {

}
