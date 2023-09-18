package com.example.demo.connection.repository;

import com.example.demo.connection.domain.Member;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class MemberRepositoryV0Test {

    MemberRepositoryV0 memberRepositoryV0 = new MemberRepositoryV0();
    @Test
    void crud() throws SQLException  {
        Member member = new Member("memberV2", 10000);
        memberRepositoryV0.save(member);
    }
}