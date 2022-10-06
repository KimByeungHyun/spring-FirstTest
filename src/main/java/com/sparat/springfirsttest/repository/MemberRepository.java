package com.sparat.springfirsttest.repository;

import com.sparat.springfirsttest.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
    List<Member> findAll();
}
