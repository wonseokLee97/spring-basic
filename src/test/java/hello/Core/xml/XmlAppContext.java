//package hello.Core.xml;
//
//import hello.Core.member.MemberService;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.context.support.GenericXmlApplicationContext;
//import org.springframework.test.util.AssertionErrors;
//
//public class XmlAppContext {
//
//    @Test
//    void xmlAppContext(){
//        GenericXmlApplicationContext ac = new GenericXmlApplicationContext("appConfig.xml");
//        MemberService memberService = ac.getBean("memberService", MemberService.class);
//        Assertions.assertThat(memberService).isInstanceOf(MemberService.class);
//    }
//}

package hello.Core.xml;
import hello.Core.member.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import static org.assertj.core.api.Assertions.*;
public class XmlAppContext {
    @Test
    void xmlAppContext() {
        ApplicationContext ac = new GenericXmlApplicationContext("appConfig.xml");
        MemberService memberService = ac.getBean("memberService", MemberService.class);
        assertThat(memberService).isInstanceOf(MemberService.class);
    }
}
