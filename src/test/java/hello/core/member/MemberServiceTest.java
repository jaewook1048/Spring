package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        //given 이런 데이터가 주어졌을 때
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when 이렇게 해서
        memberService.join(member);
        Member findmember = memberService.findMember(1L);

        //then 이런 결과가 나온다.
        Assertions.assertThat(member).isEqualTo(findmember);
    }

}
