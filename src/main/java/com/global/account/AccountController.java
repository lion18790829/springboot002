package com.global.account;

// import com.global.account.form.SignUpForm;
// import com.global.domain.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class AccountController {

  // localhost:8080/sign-up 을 주소표시줄에 입력했을 때
  // 자동으로 호출되는 메소드
  @GetMapping("/sign-up")
  public String signUpForm(Model model){
    // model.addAttribute("signUpForm", new SignUpForm());
    return "account/sign-up";
  }

}






