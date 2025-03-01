package de.zettsystems.java25_xx.scoped;

import java.util.UUID;

public class ScopedSolution {
    // User wird authentifiziert und erst dort benutzt, wo er gebraucht wird
}

class ScopedServer {

    ScopedRestAdapter restAdapter = new ScopedRestAdapter();
    private void serve(Request request) {
        // ...
        User loggedInUser = authenticateUser(request);
        ScopedValue.where(Session.LOGGED_IN_USER, loggedInUser)
                .run(() -> restAdapter.processRequest(request));
        // ...
    }

    private User authenticateUser(Request request) {
        return new User();
    }
}

class ScopedRestAdapter {

    ScopedUseCase useCase = new ScopedUseCase();
    public void processRequest(Request request) {
        // ...
        UUID id = extractId(request);
        useCase.invoke(id);
        // ...
    }

    private UUID extractId(Request request) {
        return UUID.randomUUID();
    }
}

class ScopedUseCase {
    ScopedRepository repository = new ScopedRepository();
    public void invoke(UUID id) {
        // ...
        Data data = repository.getData(id);
        // ...
    }
}

class ScopedRepository {
    public Data getData(UUID id) {
        Data data = findById(id);
        User loggedInUser = Session.LOGGED_IN_USER.get();
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
