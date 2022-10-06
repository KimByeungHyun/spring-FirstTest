package com.sparat.springfirsttest.dto;


import com.sparat.springfirsttest.domain.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberInfoResponseDto {

    private Long id;
    private String name;
    private String email;
    private String pw;

    public MemberInfoResponseDto(Member member) {

    }
}
