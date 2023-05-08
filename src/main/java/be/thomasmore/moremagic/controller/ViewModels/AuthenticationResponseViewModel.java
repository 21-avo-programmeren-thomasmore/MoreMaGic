package be.thomasmore.moremagic.controller.ViewModels;

import lombok.Data;

@Data
public class AuthenticationResponseViewModel {
    private String token;

    public AuthenticationResponseViewModel() {
    }

    public AuthenticationResponseViewModel(String token) {
        this.token = token;
    }
}
