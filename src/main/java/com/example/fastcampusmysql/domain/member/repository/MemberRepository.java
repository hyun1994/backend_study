package com.example.fastcampusmysql.domain.member.repository;

import com.example.fastcampusmysql.domain.member.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@RequiredArgsConstructor
@Repository
public class MemberRepository {
    final private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    public Member save(Member member) {
        /*
        member id를 보고 갱신 또는 삽입을 정함
        반환값은 id를 담아서 반환
         */
        return member;
    }

    private Member insert(Member member) {
        SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(namedParameterJdbcTemplate.getJdbcTemplate())
                .withTableName("Member")
                .usingGeneratedKeyColumns("id");
    }

    private Member update(Member member) {
        // TODO: implemented
    }
}
