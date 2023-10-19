package hello.core.member;

public class MemberServiceImpl implements MemberService {
    // 추상적 의존만 함 (dip)
    private final MemberRepository memberRepository;

    // 의존관계 주입
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
