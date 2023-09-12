package template.server.api.test;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import template.server.common.test.mapper.TestMapper;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class TestDao {
    private final TestMapper testMapper;

    public List<String> testList() {
        return testMapper.findAll();
    }
    public int testInsert(String str){
        return testMapper.save(str);
    }
}
