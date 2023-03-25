package be.thomasmore.moremagic.application.queries.getUser;

import an.awesome.pipelinr.Command;
import be.thomasmore.moremagic.domain.User;
import be.thomasmore.moremagic.persistence.UserRepository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class GetUserQueryHandler implements Command.Handler<GetUserQuery, User> {
    private UserRepository _userRepository;

    public GetUserQueryHandler(UserRepository _userRepository) {
        this._userRepository = _userRepository;
    }

    @Override
    public User handle(GetUserQuery getUserQuery) {
        List<User> users = _userRepository.FindByName(getUserQuery.Name);
        return users.get(0);
    }
}
