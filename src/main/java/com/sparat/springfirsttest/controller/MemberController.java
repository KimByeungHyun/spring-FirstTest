package com.sparat.springfirsttest.controller;


import com.sparat.springfirsttest.domain.Member;
import com.sparat.springfirsttest.dto.MemberInfoResponseDto;
import com.sparat.springfirsttest.dto.MemberRequestDto;
import com.sparat.springfirsttest.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class MemberController {

//    private final MemberService memberService;
    private final MemberRepository memberRepository;


    // 절대 외우기 ,
    @PostMapping("/member")
    public Member creatMember(@RequestBody MemberInfoResponseDto memberInfoResponseDto) {
        Member member = new Member(memberInfoResponseDto);
        return memberRepository.save(member);
    }

    @GetMapping("/member/{id}")
    public Member getMemberInfo(@PathVariable Long id) {
        return memberRepository.findById(id).orElseThrow(
                () -> new IllegalStateException("아이디가 존재하지 않습니다.")
        );
    }

    @GetMapping("/member")
    public List<Member> getMemberList() {
        return  memberRepository.findAll();
    }


//    /**
//     * 한 회원의 userId가 주었을때 회원 정보를 조회하는 API
//     * @param id
//     */
//    @GetMapping("/member/{id}")
//    public CommonResponse getMemberInfo(@PathVariable Long id) {
//        (구현)
//    }
//
//    /**
//     * 회원의 전체 목록을 조회하는 API
//     */
//    @GetMapping("/member")
//    public CommonResponse.ofList getMemberList() {
//        (구현)
//    }


}
