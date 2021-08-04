package hello.Core;

import hello.Core.discount.DiscountPolicy;
import hello.Core.discount.RateDiscountPolicy;
import hello.Core.member.MemberRepository;
import hello.Core.member.MemberService;
import hello.Core.member.MemberServiceImpl;
import hello.Core.member.MemoryMemberRepository;
import hello.Core.order.OrderService;
import hello.Core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService(){ // 생성사 주입 to Impl
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(
                memberRepository(),
                discountPolicy());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }


}
