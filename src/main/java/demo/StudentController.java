package demo;

/**
 * 2017/5/5
 *
 * @author sfq
 * @version V1.0
 **/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 成绩查询
 */
@RestController
@RequestMapping("/check")
public class StudentController {
    @Autowired
    StudentService studentService;
    public List<Student> select(){
        List<Student> list = studentService.select();
        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        return list;
    }
}
