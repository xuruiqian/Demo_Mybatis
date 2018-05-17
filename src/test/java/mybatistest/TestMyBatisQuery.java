package mybatistest;
import org.junit.Test;
import com.astor.mapper.*;
import com.astor.model.*;
import java.util.*;
public class TestMyBatisQuery extends TestMyBatisBase{
	@Test
	public void Query() {
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		User resulst = userMapper.selectByPrimaryKey("1");
		System.out.println(resulst.toString());

		List<User> users=userMapper.selectAll();
		for(User user:users){
			System.out.println(user.toString());
		}
		sqlSession.close();
	}
}
