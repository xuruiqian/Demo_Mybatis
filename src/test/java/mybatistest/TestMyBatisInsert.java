package mybatistest;
import java.io.IOException;
import java.util.UUID;
import org.junit.Test;
import com.astor.mapper.*;
import com.astor.model.*;
public class TestMyBatisInsert extends TestMyBatisBase {

	@Test
	public void Insert() throws IOException {

		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		String id = UUID.randomUUID().toString();
		User user = new User();
		user.setId(id);
		user.setUsername("mybatis_insert_1");
		user.setPassword("123456");
		int resulst = userMapper.insert(user);

		System.out.println(resulst);
		sqlSession.close();
	}
}
