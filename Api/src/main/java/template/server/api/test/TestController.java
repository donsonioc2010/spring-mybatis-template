package template.server.api.test;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequestMapping("/test")
@RequiredArgsConstructor
@RestController
public class TestController {
    private final TestMessage testMessage;
    private final TestDao testDao;

    @GetMapping
    public String rtnMsg() {
        return testMessage.toString();
    }

    @GetMapping("/db")
    public ResponseEntity<List> rtnList() {
        return ResponseEntity.ok(testDao.testList());
    }

    @GetMapping("/insdb")
    public ResponseEntity<Integer> rtnNumber(@RequestParam("a") String a) {
        return ResponseEntity.ok(testDao.testInsert(a));
    }
}
