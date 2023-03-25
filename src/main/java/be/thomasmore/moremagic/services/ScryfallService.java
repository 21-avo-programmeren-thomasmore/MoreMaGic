package be.thomasmore.moremagic.services;

import be.thomasmore.moremagic.domain.Card;
import org.aspectj.weaver.ast.Call;

import java.io.IOException;
import java.util.List;

public class ScryfallService {
    /*private ScryfallInterface scryfallApi;

    public ScryfallService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.scryfall.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        scryfallApi = retrofit.create(ScryfallApi.class);
    }
    public List<Card> getAllCards() {
        Call<List<Card>> call = scryfallApi.getAllCards();
        Response<List<Card>> response;
        try {
            response = call.execute();
        } catch (IOException e) {
            throw new RuntimeException("Error getting cards from Scryfall", e);
        }
        if (!response.isSuccessful()) {
            throw new RuntimeException("Error getting cards from Scryfall: " + response.errorBody());
        }
        return response.body().getData();
    }*/
}
