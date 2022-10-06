package com.sparat.springfirsttest.dto;

import lombok.Getter;

@Getter
public class MemberRequestDto {
        private Long id;
        private String username;
        private String password;
        private String email;
}
