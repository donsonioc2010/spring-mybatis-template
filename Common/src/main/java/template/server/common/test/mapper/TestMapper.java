package template.server.common.test.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TestMapper {
    @Select("Select * from test_table")
    public List<String> findAll();

    @Insert("insert into test_table (abcd) values (#{param})")
    public int save(String param);
}

