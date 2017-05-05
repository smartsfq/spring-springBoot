package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 2017/5/5
 *
 * @author sfq
 * @version V1.0
 **/
@Component
public class StudentServiceImpl implements StudentService{
    //注入数据库
    @Autowired
    JdbcTemplate jdbcTpl;
    //列表查询
    @Override
    public List<Student> select(){
        List list=jdbcTpl.queryForList("SELECT * FROM student");
        return list;
    }
}
