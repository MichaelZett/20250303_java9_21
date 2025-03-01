package de.zettsystems.java25_xx.scoped;

import java.util.UUID;

public class Problem {
    // User muss die ganze Strecke mit durchgereicht werden
}

class Server {
    RestAdapter restAdapter = new RestAdapter();
    private void serve(Request request) {
        // ...
        User user = authenticateUser(request);
        restAdapter.processRequest(request, user);
        // ...
    }

    private User authenticateUser(Request request) {
        return new User();
    }
}

class RestAdapter {
    UseCase useCase = new UseCase();
    public void processRequest(Request request, User loggedInUser) {
        // ...
        UUID id = extractId(request);
        useCase.invoke(id, loggedInUser);
        // ...
    }

    private UUID extractId(Request request) {
        return UUID.randomUUID();
    }
}

class UseCase {
    Repository repository = new Repository();
    public void invoke(UUID id, User loggedInUser) {
        // ...
        Data data = repository.getData(id, loggedInUser);
        // ...
    }
}

class Repository {
    public Data getData(UUID id, User loggedInUser) {
        Data data = findById(id);
        if (loggedInUser.isAdmin()) {
            enrichDataWithAdminInfos(data);
        }
        return data;
    }

    private void enrichDataWithAdminInfos(Data data) {

    }

    private Data findById(UUID id) {
        return new Data();
    }
}
