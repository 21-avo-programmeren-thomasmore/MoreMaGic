package be.thomasmore.moremagic.application.queries.ScryfallTest;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Voidy;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ScryfallTestQueryHandler implements Command.Handler<ScryfallTestQuery, Voidy>{
    @Override
    public Voidy handle(ScryfallTestQuery scryfallTestQuery) {
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(URI.create("https://api.scryfall.com/cards/random")).build();
        //var response = client.send(request, new HttpResponse.BodyHandlers. );
        // test
        return null;
    }
}
