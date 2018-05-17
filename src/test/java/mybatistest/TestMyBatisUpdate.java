package mybatistest;
import java.io.IOException;
import java.util.UUID;
import org.junit.Test;

import com.astor.model.*;
public class TestMyBatisUpdate extends TestMyBatisBase{

	@Test
	public void Update() throws IOException {
		String id=UUID.randomUUID().toString();
		User user = new User();
		sqlSession.update("updateByPrimaryKey", user);

	}
}
