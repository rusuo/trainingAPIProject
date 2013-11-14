import org.apache.http.client.methods.HttpGet;

public class TestService {

    private HttpClientSession session;
    private String url = "http://www.google.com";

    public TestService(HttpClientSession session){
        this.session = session;
    }

    public void getGooglePage(){
        HttpGet newRequest = new HttpGet(url);

        session.execute(newRequest);
    }


}
