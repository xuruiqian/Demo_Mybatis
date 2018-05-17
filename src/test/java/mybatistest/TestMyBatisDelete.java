package mybatistest;
import java.io.IOException;
import java.util.UUID;
import org.junit.Test;
import com.astor.mapper.*;
public class TestMyBatisDelete extends TestMyBatisBase {

	@Test
	public void Delete() throws IOException {
		// 通过对象删除

		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

		String id = UUID.randomUUID().toString();
		int resulst = userMapper.deleteByPrimaryKey(id);

		System.out.println(resulst);
		sqlSession.close();
	}

}
