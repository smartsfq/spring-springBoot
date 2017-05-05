package demo;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 2017/5/5
 *
 * @author sfq
 * @version V1.0
 **/
@Service
public interface StudentService {
    List<Student> select();
}
