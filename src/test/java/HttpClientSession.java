import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;

public class HttpClientSession {
    protected HttpClient client;
    protected int lastStatusCode;

    public HttpClientSession() {
        this.client = new DefaultHttpClient();
    }

    public void execute(HttpUriRequest request) {
        DefaultHttpClient client = new DefaultHttpClient();
        try {
            HttpResponse response = client.execute(request);
            lastStatusCode = getStatusCode(response);

            client.getConnectionManager().shutdown();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int getStatusCode(HttpResponse response) {
        return response.getStatusLine().getStatusCode();
    }

}
