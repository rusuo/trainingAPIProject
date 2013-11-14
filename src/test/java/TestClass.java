import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestClass {

    private HttpClientSession session = new HttpClientSession();
    private TestService service = new TestService(session);

    @Test
    public void firstTest(){
        service.getGooglePage();
        assertEquals("status code is not 200", 200, session.lastStatusCode);
    }

}
