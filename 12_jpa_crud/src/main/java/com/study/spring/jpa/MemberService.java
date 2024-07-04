package com.study.spring.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    public Member insert(Member member){
        return memberRepository.save(member);
    }

    public List<Member> selectAll(){
        return memberRepository.findAll();
    }

    public Optional<Member> select(Long id){
        return memberRepository.findById(id);
    }

    public void delete(Long id){
        memberRepository.deleteById(id);
    }

    public Member update(Member member){
        return memberRepository.save(member);
    }
}
