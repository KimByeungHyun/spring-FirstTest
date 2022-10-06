package com.sparat.springfirsttest.service;


import com.sparat.springfirsttest.domain.Member;
import com.sparat.springfirsttest.dto.MemberInfoResponseDto;
import com.sparat.springfirsttest.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

//    @Transactional
//    public MemberInfoResponseDto findMember(Long memberId){
//
//    }
//
//    public List<MemberInfoResponseDto> findALlMember() {
//
//    }

}
