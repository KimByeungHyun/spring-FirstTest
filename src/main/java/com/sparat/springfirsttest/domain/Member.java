package com.sparat.springfirsttest.domain;


import com.sparat.springfirsttest.dto.MemberInfoResponseDto;
import com.sparat.springfirsttest.dto.MemberRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class Member{
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String pw;

    // 시프트 인서트
    public Member(MemberInfoResponseDto memberInfoResponseDto) {
        this.id = memberInfoResponseDto.getId();
        this.name = memberInfoResponseDto.getName();
        this.email = memberInfoResponseDto.getEmail();
        this.pw = memberInfoResponseDto.getPw();
    }

    // 이건 알트 인서트
    public Member(Long id, String name, String email, String pw) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.pw = pw;
    }
}


