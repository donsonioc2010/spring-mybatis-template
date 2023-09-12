package template.server.api.test;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import template.server.common.test.mapper.TestMapper;


@RequiredArgsConstructor
@Service
public class TestService {
    private final TestMapper testMapper;

}
