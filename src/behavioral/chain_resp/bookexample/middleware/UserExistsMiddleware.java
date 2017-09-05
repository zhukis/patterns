package behavioral.chain_resp.bookexample.middleware;

import behavioral.chain_resp.bookexample.server.Server;

public class UserExistsMiddleware extends Middleware {
    public boolean check(String email, String password) {
        if (!Server.hasEmail(email)) {
            return false;
        }
        return checkNext(email, password);
    }
}
