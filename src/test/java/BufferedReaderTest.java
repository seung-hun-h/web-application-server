import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;

public class BufferedReaderTest {

	@Test
	void test() throws IOException {
	    // given
		BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/user/Workspace/web-application-server/webapp/index.html"));

		String line = "";
		while ((line = bufferedReader.readLine()) != null) {
			System.out.println("line = " + line);
		}

		// when

	    // then
	}
}
