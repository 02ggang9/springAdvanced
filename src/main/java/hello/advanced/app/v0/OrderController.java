package hello.advanced.app.v0;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderServiceV0 orderService;

    @GetMapping("/v0/request")
    public String request(String itemId) {
        orderService.orderItem(itemId);
        return "ok";
    }
}

// 로그 추적기 - 요구사항 분석
// 모니터링 툴을 도입하면 많은 부분이 해결되지만, 그걸로도 해결이 안되는 부분이 있는 경우에는 로그 추적기 붙여놓으면 좋다!
